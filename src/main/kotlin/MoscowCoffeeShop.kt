class MoscowCoffeeShop(americanoPrice: Double, cappuccinoPrice: Double, lattePrice: Double):
    CoffeeShop(americanoPrice, cappuccinoPrice, lattePrice), Biscuits {

    override fun makeAmericano() {
        println("Спасибо за покупку американо в Московской Кофейне!")
        americanoCount++
    }

    override fun makeCappuccino() {
        println("Спасибо за покупку каппучино в Московской Кофейне!")
        cappuccinoCount++
    }

    override fun makeLatte() {
        println("Спасибо за покупку латте в Московской Кофейне!")
        latteCount++
    }

    override fun sellBiscuits() {
        println("Держи свои печеньки!")
    }
}