@file:Suppress("UNREACHABLE_CODE")

// in the function, we are offered two options either to leave (not yet developed) or to continue. we take the data.
// we compare them for correctness and return them to the main function
fun checkFromFirstNotification(): String {
	print(text)
	return when (readln()) {
		"1" -> "1"
		"2" -> "2"
		else -> checkFromFirstNotification() //
	}
}

// when we call the runShop functions. we give 3 variants of events. we get the input data,
// compare it and return it. compare (we have excluded errors) and assigns a weight.
fun checkAnswerFromRunShop(): String {
	print(text)
	return when (readln()) {
		"1" -> return "1"
		"2" -> return "2"
		"3" -> return "3"
		else -> return checkAnswerFromRunShop()
	}
}

fun checkAnswerFromSecondNotif(): String {
	print(text)
	return when (readln()) {
		"1" -> "1"
		"2" -> "2"
		"3" -> "3"
		"4" -> "4"
		"5" -> "5"
		else -> checkFromFirstNotification()
	}
}

fun fromDairy(): String {
	print(text)
	return when (readln()) {
		"Milk" -> "Milk"
		"Cream" -> "Cream"
		"Kefir" -> "Kefir"
		"Yougurt" -> "Yougurt"
		"stop" -> "stop"
		else -> {
			println("Not correctly")
			fromDairy()
		}
	}
}

fun fromMeat(): String {
	print(text)
	return when (readln()) {
		"Turkey" -> "Turkey"
		"Chicken" -> "Chicken"
		"Pork" -> "Pork"
		"Beef" -> "Beef"
		"Minced meat" -> "Minced meat"
		"Barbecue" -> "Barbecue"
		"stop" -> "stop"
		else -> {
			println("Not correctly")
			fromMeat()
		}
	}
}

fun fromVegetable(): String {
	print(text)
	return when (readln()) {
		"Carrot" -> "Carrot"
		"Tomato" -> "Tomato"
		"Broccoli" -> "Broccoli"
		"Pumpkin" -> "Pumpkin"
		"Peas" -> "Peas"
		"Zucchini" -> "Zucchini"
		"stop" -> "stop"
		else -> {
			println("Not correctly")
			fromVegetable()
		}
	}
}

fun fromConfectionery(): String {
	print(text)
	return when (readln()) {
		"Alfajor" -> "Alfajor"
		"Bichon au citron" -> "Bichon au citron"
		"Croissant" -> "Croissant"
		"Baklava" -> "Baklava"
		"Apple strudel" -> "Apple strudel"
		"stop" -> "stop"
		else -> {
			println("Not correctly")
			fromConfectionery()
		}
	}
}

fun fromHouseHoldChemicals(): String {
	print(text)
	return when (readln()) {
		"Washing powder" -> "Washing powder"
		"Dishwashing" -> "Dishwashing"
		"Detergent soap" -> "Detergent soap"
		"Toothpaste" -> "Toothpaste"
		"Shampoo" -> "Shampoo"
		"stop" -> "stop"
		else -> {
			println("Not correctly")
			fromHouseHoldChemicals()
		}
	}
}

fun fromNegative() {
	print(text)
	when (readln()) {
		"1" -> {
			removeProduct(listOfProducts)
		}

		"2" -> {
			mainRobbery()
		}

		else -> {
			fromNegative()
		}
	}
}