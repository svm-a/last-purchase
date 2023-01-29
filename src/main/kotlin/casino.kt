fun getNumber(): Int = (0..2).random()
fun getCash(): Int = (5000..50_000).random()

fun mainCasino() {
	println(sendRuleCasino())
	Thread.sleep(5000)
	runCasino()
	againRunCasino()
	println(sendCountMoney())
}

fun sendRuleCasino(): String = """
	
								// Welcome to the Casino. //
		The rules are quite simple. In horizontal rows, all the numbers must match. One spin costs 5 BUCKS!!!
""".trimIndent()

fun runCasino() {
	println("*** VULCAN CASINO ***")
	val arr = arrayOf(intArrayOf(getNumber(), getNumber(), getNumber()),
		intArrayOf(getNumber(), getNumber(), getNumber()),
		intArrayOf(getNumber(), getNumber(), getNumber()))
	for (row in arr) {
		println(row.joinToString(" "))
	}

	if ((arr[0][0] == arr[0][1] && arr[0][1] == arr[0][2]) || (arr[1][0] == arr[1][1] && arr[1][1] == arr[1][2]) ||
		(arr[2][0] == arr[2][1] && arr[2][1] == arr[2][2])) {
		println(textCasino)
		counterCasino++
	}
	else {
		println("Lose")
		money -= 1
	}
	sendText()
}


fun sendText() {
	println("Again? (+/-)")
	print(text)
}

fun againRunCasino() {
	while (money != 0.0f) {
		when (readln()) {
			"+" -> {
				runCasino()
			}
			"-" -> {
				println("Thanks for money")
				break
			}
			else -> {
				againRunCasino()
			}
		}
	}
}


fun sendCountMoney(): String = """
	You've won: ${counterCasino * getCash()}$
""".trimIndent()

const val textCasino: String = "Victory"
var counterCasino = 0