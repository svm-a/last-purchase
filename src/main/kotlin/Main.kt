import kotlin.system.exitProcess

fun main() {
	println(showTips())
//	println(showStartMenu())
//	println(stepSelection())
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

fun stepSelection() {
	when (getOpinionFromUser()) {
		1 -> println(showTips())
		2 -> println(runShop())
		3 -> exitProcess(0)

	}
}

fun runShop(): String {
	return "start shop"
}

fun showTips(): String {
	return """
	As in any store, you can take a basket, a cart or nothing. In each case there will be peculiar restrictions.
	
	1. If you take a cart, you will be able to take no more than 40 items.
	2. If you take the basket. You will only be able to take 15 items.
	3. If you don't take anything, you can only take 5 items.
	
	""".trimIndent()
}