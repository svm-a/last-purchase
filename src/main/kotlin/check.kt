fun checkFirstAnswer(): Boolean {
	val value = readln()

	when (value) {
		"1", "2" -> {
			return true
		}

		else -> {
			return false
		}
	}
}