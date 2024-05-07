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
       Using minBy and maxBy Higher Order Functions
     */
    val item = groceries2.maxBy {
        it.unitPrice
    }

    println("The Item with the highest Unit price is ${item.name}")


    val itemLowestQuantity = groceries2.minBy {
        it.quantity
    }

    println("The Item with the Lowest quantity is ${itemLowestQuantity.name}")


    /*
        sumBy and sumByDouble Higher Order Functions
     */
    /*
     Sum of all Quantity values
    */
    val sumQuantities = groceries2.sumOf {
        it.quantity
    }

    println("Total Quantities $sumQuantities")

    val totalPrice = groceries2.sumOf {
        it.quantity * it.unitPrice
    }

    println("Total Price at Checkout: $totalPrice")


}