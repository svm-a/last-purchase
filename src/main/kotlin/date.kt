fun dairyCost() {
	val dairyProducts = mapOf(
		"Milk" to 1.5f,
		"Cream" to 0.99f,
		"Kefir" to 1.89f,
		"Yougurt" to 0.67f,
	)
	for (value in dairyProducts) {
		print("$value ")
		println()
	}
}

fun meatCost() {
	val meatProducts = mapOf(
		"Turkey" to 3.99,
		"Chicken" to 4.99,
		"Pork" to 3.59,
		"Beef" to 3.79,
		"Minced meat" to 5.59,
		"Barbecue" to 5.49
	)
	for (value in meatProducts) {
		print("$value ")
	}
	println()
}

fun vegetableCost() {
	val vegetableProducts = mapOf(
		"Carrot" to 0.15,
		"Tomato" to 0.20,
		"Broccoli" to 1.00,
		"Pumpkin" to 4.99,
		"Peas" to 3.29,
		"Zucchini" to 2.55
	)
	for (value in vegetableProducts) {
		print("$value ")
	}
	println()
}

fun confectioneryCost() {
	val confectioneryProducts = mapOf(
		"Alfajor" to 10.99,
		"Bichon au citron" to 9.99,
		"Croissant" to 2.99,
		"Baklava" to 14.39,
		"Apple strudel" to 12.49
	)
	for (value in confectioneryProducts) {
		print("$value ")
	}
	println()
}

fun houseHoldChemicalsCost() {
	val houseHouldProducts = mapOf(
		"Washing powder" to 1.49,
		"Dishwashing" to 2.5,
		"Detergent soap" to 2.19,
		"Toothpaste" to 1.49,
		"Shampoo" to 3.69,
	)
	for (value in houseHouldProducts) {
		print("$value ")
	}
	println()
}