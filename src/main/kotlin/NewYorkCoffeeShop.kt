class NewYorkCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice) {

    override fun makeAmericano() {
        println("Thanks for buying americano at NewYork CoffeeShop")
        americanoCount++
    }

    override fun makeCappuccino() {
        println("Thanks for buying cappuccino at NewYork CoffeeShop")
        cappuccinoCount++
    }

    override fun makeLatte() {
        println("Thanks for buying latte at NewYork CoffeeShop")
        latteCount++
    }
}