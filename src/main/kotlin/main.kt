import kotlin.system.exitProcess

fun main() {

    val moscowCoffeeShop = MoscowCoffeeShop(30.0, 40.0, 60.0)
    val newYorkCoffeeShop = NewYorkCoffeeShop(5.0, 7.0, 9.5)
    var currentCoffeeShop: CoffeeShop

    while(true) {
        println("Hello! Please choose your coffeeshop")
        println("1 - MoscowCoffeeShop\n2 - NewYorkCoffeeShop\n\n0 - Exit")
        currentCoffeeShop = when (readLine()) {
            "1" -> moscowCoffeeShop
            "2" -> newYorkCoffeeShop
            "0" -> break
            else -> {
                println("Error")
                continue
            }
        }
        chooseDrink(currentCoffeeShop)
    }
}

private fun chooseDrink(currentCoffeeShop: CoffeeShop) {
    println("Please, choose your coffee: ")
    println("1.Americano\n2.Cappuccino\n3.Latte\n\n0 - Show statistics")
    when (readLine()) {
        "1" -> {
            currentCoffeeShop.makeAmericano()
            checksAndAskForBiscuits(currentCoffeeShop)
        }
        "2" -> {
            currentCoffeeShop.makeCappuccino()
            checksAndAskForBiscuits(currentCoffeeShop)
        }
        "3" -> {
            currentCoffeeShop.makeLatte()
            checksAndAskForBiscuits(currentCoffeeShop)
        }
        "0" -> currentCoffeeShop.showStatistics()
        else -> {
            println("Error")
            exitProcess(1)
        }
    }
}

private fun checksAndAskForBiscuits(currentCoffeeShop: CoffeeShop) {
    if (currentCoffeeShop is Biscuits) {
        println("Вы хотите также приобрести печеньки?")
        println("1 - Yes\n2 - No")

        val isBiscuits = readLine()

        if (isBiscuits == "1")
            currentCoffeeShop.sellBiscuits()
    }
}
