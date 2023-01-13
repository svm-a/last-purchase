fun checkFirstAnswer(): String {
	println(
		"""
		//////////////////////////
		/  Write a text message  /
		/		 1 or 2          /
		//////////////////////////
	""".trimIndent()
	)
	print("write here > ")
	val value = readln()

	when (value) {
		"1" -> return "1"

		"2" -> return "2"

		else -> return checkFirstAnswer() //
	}
}