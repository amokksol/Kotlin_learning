//создаем абстрактный класс
abstract class Appliance {
    var pluggedIn = true
    abstract val color: String

    abstract fun consumePower()
}
//подкласс должен использовать все функции и значения абстрактного класса
class CoffeeMaker: Appliance(){
    override val color = ""
    var coffeLeft = false
    override fun consumePower() {
        println("CconsumePower")

    }

    fun fillWithWater(){
        println("Fill with water")
    }
    fun makeCoffee (){
        println("Make the cpffee")
    }
}