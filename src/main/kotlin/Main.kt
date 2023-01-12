fun main() {
	println(showStartMenu())
}

fun showStartMenu(): String {

	return """
	Welcome to your favorite store in your favorite city.
	I suggest you take advantage of small tips on how to be in our store.

	1. Write the number 1 if you want to see these hints.
	2. Write the number 2 if you want to go further and ignore the prompts.
	3. Write the number 3 If you want to leave.
	""".trimIndent()
}

fun getOpinionFromUser(): Int {
	val value = readln().toInt()
	return value
}