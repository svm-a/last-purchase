fun dairyCost(key: String): Float {
	val dairyProducts = mapOf(
		"Milk" to 1.5f,
		"Cream" to 0.99f,
		"Kefir" to 1.89f,
		"Yougurt" to 0.67f,
	)
	return dairyProducts[key] ?: 0f
}

fun printDairy(): String = """
	_______________________
	- 1. Milk - 1.5       -
	- 2. Cream - 0.99     -
	- 3. Kefir - 1.89     -
	- 4. Yougurt - 0.67   -
	-----------------------
""".trimIndent()


fun meatCost(key: String): Float {
	val meatProducts = mapOf(
		"Turkey" to 3.99f,
		"Chicken" to 4.99f,
		"Pork" to 3.59f,
		"Beef" to 3.79f,
		"Minced meat" to 5.59f,
		"Barbecue" to 5.49f
	)
	return meatProducts[key] ?: 0f
}

fun printMeat(): String = """
	-----------------------
	- 1. Turkey - 3.99       -
	- 2. Chicken - 4.99      -
	- 3. Pork - 3.59         -
	- 4. Beef - 3.79         -
	- 5. Minced meat - 5.59  -
	- 6. Barbecue - 5.49     -
	- - - - - - - - - - - -
""".trimIndent()

fun vegetableCost(key: String): Float {
	val vegetableProducts = mapOf(
		"Carrot" to 0.15f,
		"Tomato" to 0.20f,
		"Broccoli" to 1.00f,
		"Pumpkin" to 4.99f,
		"Peas" to 3.29f,
		"Zucchini" to 2.55f
	)
	return vegetableProducts[key] ?: 0f
}

fun printVegetable(): String = """
	------------------------
	- 1. Carrot - 0.15     -    
	- 2. Tomato - 0.20     -    
	- 3. Broccoli - 1.00   -   
	- 4. Pumpkin - 4.99    -  
	- 5. Peas - 3.29       - 
	- 6. Zucchini - 2.55   -
	- - - - - - - - - - - - 
""".trimIndent()

fun confectioneryCost(key: String): Float {
	val confectioneryProducts = mapOf(
		"Alfajor" to 10.99f,
		"Bichon au citron" to 9.99f,
		"Croissant" to 2.99f,
		"Baklava" to 14.39f,
		"Apple strudel" to 12.49f
	)
	return confectioneryProducts[key] ?: 0f

}

fun printConfectionery(): String = """
	- - - - - - - - - - - - - - - -
	- 1. Alfajor - 10.99          -
	- 2. Bichon au citron - 9.99  -       
	- 3. Croissant - 2.99         - 
	- 4. Baklava - 14.39          -
	- 5. Apple strudel - 12.49    -      
	- - - - - - -  - - - - - - 	- -
""".trimMargin()


fun houseHoldChemicalsCost(key: String): Float {
	val houseHoldProducts = mapOf(
		"Washing powder" to 1.49f,
		"Dishwashing" to 2.5f,
		"Detergent soap" to 2.19f,
		"Toothpaste" to 1.49f,
		"Shampoo" to 3.69f,
	)
	return houseHoldProducts[key] ?: 0f
}

fun printHouseHoldChemicals(): String = """
	- - - - - - - - - - - - - - - - 
	- 1. Washing powder - 1.49    -
	- 2. Dishwashing - 2.5        -      
	- 3. Detergent soap - 2.19    -
	- 4. Toothpaste - 1.49        -
	- 5. Shampoo - 3.69           -    
	- - - - - - - - - - - - - - - -	  
""".trimIndent()