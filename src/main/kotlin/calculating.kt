fun mainCalculator() {

	while (counter != permissibleWeight) {
		print("Do you want to continue shopping? (+/-) ")
		when (readln()) {
			"+" -> {
				println(departmentSelection())
				getProducts()
			}

			"-" -> {
				break
			}
		}
	}
	println(sendInfo(money))
	countMoney(money, listOfProducts)
}

fun sendInfo(cash: Float): Any {
	return """
		
		You have successfully purchased the products or may have deceived the system. Now you've to go to the checkout.
		Money : $cash ***
	""".trimIndent()
}

fun countMoney(cash: Float, products: List<String>) {
	var countProducts = 0f
	for (value in products) {
		Thread.sleep(1000)
		countProducts += dairyCost(value)
		println("So $value. It costs ${dairyCost(value)}")
	}

	if (cash > countProducts) {
		println(positiveBalance())
	} else if (cash == countProducts) {
		println(equalBalance())
	} else {
		runNegativeBalance()
	}
}

fun positiveBalance(): String = """
	
	The operation was successful.
		Have a good trip!
""".trimIndent()

fun runNegativeBalance() {
	println(
		"""
		The operation was unsuccessful. 
	There are not enough money in your account
	""".trimIndent()
	)
	println(
		"""
		
		1. Remove the product.
		2. Rob the seller.
	""".trimIndent()
	)
	fromNegative()
}

fun equalBalance(): String = """
	The operation was successful.
		Have a good trip!
""".trimIndent()


fun removeProduct(products: MutableList<String>) {
	print("write the product >> ")
	val productName = readln()
	products.remove(productName)
	countMoney(money, listOfProducts)
}
