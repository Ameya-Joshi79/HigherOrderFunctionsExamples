import grocerypackage.Grocery

fun main(args:Array<String>){

    val groceries = listOf(Grocery("Tomatoes", "Vegetable", "1lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "1lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive Oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice Cream", "Frozen", "Pack", 3.0, 2))

    println(groceries.max().name)

    println(groceries.min().name)

    /*
      Grocery List 2
     */

    val groceries2 = listOf(Grocery("Tomatoes", "Vegetable", "1lb", 3.0, 3),
        Grocery("Mushrooms", "Vegetable", "1lb", 4.0, 1),
        Grocery("Bagels", "Bakery", "Pack", 1.5, 2),
        Grocery("Olive Oil", "Pantry", "Bottle", 6.0, 1),
        Grocery("Ice Cream", "Frozen", "Pack", 3.0, 2))

    /*
      Sum of all Quantity values
     */
    val sumQuantities = groceries2.sumOf {
        it.quantity
    }

    print("Total Quantities $sumQuantities")

}