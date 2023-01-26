fun firstNotification(): String {
	return """
		*** You have received a notification. ***
		
		Write 1 if you want to buy products
		Write 2 if you want to leave the store.
		
	""".trimIndent()
}

fun secondNotification(): String {
	return """
		*** You have received a notification. ***
		
		Write 1 if you want to go Dairy department.
		Write 2 if you want to go Meat department.
		Write 3 if you want to go Vegetable department.
		Write 4 if you want to go Confectionery department.
		Write 5 if you want to go Department of household chemicals.
		
	""".trimIndent()
}

fun sendBalance(): String {
	return """
		The balance of your card is $money
	""".trimIndent()
}