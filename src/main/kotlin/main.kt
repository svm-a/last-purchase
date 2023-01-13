import kotlin.system.exitProcess

fun main() {
	println(showTable())
	println(firstNotification())

	when (checkFromFirstNotification()) {
		"1" -> mainShop()
		"2" -> exitProcess(0)
	}
}

fun showTable(): String {
	return """
		When entering the store, you pay attention to the location sign to your left. 
		Have you noticed this?
		
		"For new visitors to the store": 
			1. Buy a product.
			2. If you want to take more up to 45 products - take a cart.
			3. If you want to take more up to 15 products - take a basket.
			4. If you want to take more up to 5 products - take your hands.
		
	""".trimIndent()
}

fun doFirstChoice(): Int {
	val getAnswer = readln().toInt()
	return getAnswer
}