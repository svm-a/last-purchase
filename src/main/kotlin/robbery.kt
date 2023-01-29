fun mainRobbery() {
	println(runRobbery())
	money += stolenMoney
	Thread.sleep(10000)
	mainCasino()
}

fun runRobbery(): String = """
		You see a knife on the shelf on the left, you pick it up and start threatening the cashier.
		The cashier, who saw the knife in your hands,got scared and stepped back. Leaning against the wall, he opened
		his mouth and fell silent. 
		
		You ordered him to open the cash register, seeing a small amount of money (approximately in size $stolenMoney$
		you took it right away.
	
		You decided to use the stolen money to go to the casino.
		
	""".trimIndent()


fun getRandomMoney(): Int = (0..1000).random()

val stolenMoney = getRandomMoney()