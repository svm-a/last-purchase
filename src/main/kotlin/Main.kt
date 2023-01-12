fun main() {
	println(showTable())
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
	println(
		"""
		*** You have received a notification. ***
		
		Write 1 if you want to buy products
		Write 2 if you want to leave the store.

	""".trimIndent()
	)
	val getAnswer = readln().toInt()
	return getAnswer
}



