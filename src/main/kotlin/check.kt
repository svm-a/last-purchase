// in the function, we are offered two options either to leave (not yet developed) or to continue. we take the data.
// we compare them for correctness and return them to the main function
fun checkFromFirstNotification(): String {
	println(">> ")
	val value = readln()

	when (value) {
		"1" -> return "1"
		"2" -> return "2"
		else -> return checkFromFirstNotification() //
	}
}

// when we call the runShop functions. we give 3 variants of events. we get the input data,
// compare it and return it. compare (we have excluded errors) and assigns a weight.
fun checkAnswerFromRunShop(): String {
	println(">> ")
	val value = readln()

	when (value) {
		"1" -> return "1"
		"2" -> return "2"
		"3" -> return "3"
		else -> return checkAnswerFromRunShop()
	}
}

fun checkAnswerFromSecondNotif(): String {
	println(">> ")
	val value = readln()
	when (value) {
		"1" -> return "1"
		"2" -> return "2"
		"3" -> return "3"
		"4" -> return "4"
		"5" -> return "5"
		else -> return checkFromFirstNotification()
	}
}

fun fromDairy(): String {
	println(">> ")
	val value = readln()
	when (value) {
		"Milk" -> return "Milk"
		"Cream" -> return "Cream"
		"Kefir" -> return "Kefir"
		"Yougurt" -> return "Yougurt"
		else -> return fromDairy()
	}

}