@file:Suppress("ASSIGNED_BUT_NEVER_ACCESSED_VARIABLE")

fun mainShop() { // // here will be the entry point of the store function to make it easier to control the code
	runShop()
	println(takeStuff())
	println(departmentSelection())
	getProducts()
	mainCalculator()

}

//here we get a notification about the selection. we compare the data in our receipt file.
//Compare and assign the appropriate weight.
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

fun departmentSelection(): String {
	return """
		There are only 5 product departments in our store.
		We will expand them in the future (nope)

		1. Dairy department.
		2. Meat department.
		3. Vegetable department.
		4. Confectionery department.
		5. Department of household chemicals.

	""".trimIndent()
}

fun getProducts() {
	when (checkAnswerFromSecondNotif()) {
		"1" -> {
			println(printDairy())
			println(dairy())
		}

		"2" -> {
			println(printMeat())
			println(meat())
		}

		"3" -> {
			println(printVegetable())
			println(vegetable())
		}

		"4" -> {
			println(printConfectionery())
			println(confectionary())

		}

		"5" -> {
			println(printHouseHoldChemicals())
			println(houseHoldChemicals())
		}
	}
}

private fun dairy(): List<String> {
	var addProduct = fromDairy()
	var getData = dairyCost(key = addProduct)

	while (addProduct != "stop" && counter != permissibleWeight) {
		counter++
		listOfProducts += addProduct
		println("You've chosen $addProduct. You can still take ${permissibleWeight - counter} items. To stop, write 'stop'")
		addProduct = fromDairy()
		dairyCost(addProduct).also { getData = it }
	}
	return listOfProducts
}

private fun meat(): List<String> {
	var addProduct: String = fromMeat()
	var getData = meatCost(addProduct)

	while (addProduct != "stop" && counter != permissibleWeight) {
		counter++
		listOfProducts += addProduct
		println("You've chosen $addProduct. You can still take ${permissibleWeight - counter} items. To stop, write 'stop'")
		addProduct = fromMeat()
		meatCost(addProduct).also { getData = it }
	}
	return listOfProducts
}


fun vegetable(): List<String> {
	var addProduct = fromVegetable()
	var getData = vegetableCost(addProduct)

	while (addProduct != "stop" && counter != permissibleWeight) {
		counter++
		listOfProducts += addProduct
		println("You've chosen $addProduct. You can still take ${permissibleWeight - counter} items. To stop, write 'stop'")
		addProduct = fromVegetable()
		vegetableCost(addProduct).also { getData = it }
	}
	return listOfProducts
}

fun confectionary(): List<String> {
	var addProduct = fromConfectionery()
	var getData = confectioneryCost(key = addProduct)

	while (addProduct != "stop" && counter != permissibleWeight) {
		counter++
		listOfProducts += addProduct
		println("You've chosen $addProduct. You can still take ${permissibleWeight - counter} items. To stop, write 'stop'")
		addProduct = fromConfectionery()
		confectioneryCost(addProduct).also { getData = it }
	}
	return listOfProducts
}


fun houseHoldChemicals(): List<String> {
	var addProduct = fromHouseHoldChemicals()
	var getData = houseHoldChemicalsCost(key = addProduct)

	while (addProduct != "stop" && counter != permissibleWeight) {
		counter++
		listOfProducts += addProduct
		println("You've chosen $addProduct. You can still take ${permissibleWeight - counter} items. To stop, write 'stop'")
		addProduct = fromHouseHoldChemicals()
		houseHoldChemicalsCost(addProduct).also { getData = it }
	}
	return listOfProducts
}


var counter = 0
var money = createMoney()
var permissibleWeight = 0
var listOfProducts = mutableListOf<String>()