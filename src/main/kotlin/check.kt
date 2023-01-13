fun checkFirstAnswer(): String {
	println("write a value")
	val value = readln()

	when (value) {
		"1" ->
			return "1"

		"2" ->
			return "2"

		else ->
			return checkFirstAnswer() //
	}
}