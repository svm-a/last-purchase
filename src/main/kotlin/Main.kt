fun main() {
	println(showTable())
	println(firstNotification())

	when (checkFromFirstNotification()) {
		"1" -> {
			mainShop()
		}

		"2" -> {
			println(
				"""
				You have decided to leave the store. It turned out to be a lousy day for you. 
				And the only thing you wanted was to set the mood. Next to the store you see a casino. 
				Your idea of multiplying your wallet seemed silly to you, but you still decided
			""".trimIndent()
			)
			Thread.sleep(5000)
			mainCasino()
		}
	}

}

fun showTable(): String = """
	"For new visitors to the store":
		1. Buy a product.
		2. If you want to take more up to 45 products - take a cart.
		3. If you want to take more up to 15 products - take a basket.
		4. If you want to take more up to 5 products - take your hands.

""".trimIndent()

const val text: String = "write here >> "