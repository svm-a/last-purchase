fun mainShop() { // here will be the entry point of the store function to make it easier to control the code
	runShop()
	println(takeStuff())
}

// here we get a notification about the selection. we compare the data in our receipt file.
// Compare and assign the appropriate weight.
fun runShop() {
	println(
		"""
		// Welcome to the store //
		What are you going to choose?
1. Cart.
2. Basket.
3. Nothing.
	""".trimMargin()
	)
	when (checkAnswerFromRunShop()) {
		"1" -> permissibleWeight = 45
		"2" -> permissibleWeight = 15
		"3" -> permissibleWeight = 5
	}
}

// the function notifies us about taking an object and highlights the presence of weight.
fun takeStuff(): String {
	return """
	You took it. Now specify the number of the department in which you are going to log in.	
	You can only take $permissibleWeight items with you
	
	""".trimIndent()

}

var permissibleWeight = 0