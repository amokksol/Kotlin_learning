//проверка на Null

//Создаем класс Wolf2
class Wolf2 {
    var hungred=10
    val food = "Meat"

    fun eat(){
        println("Волк ест - $food")
    }
}
//создаем второй класс
class MyWolf {
    var wolf: Wolf2? = Wolf2()
    fun myFunction() {
        wolf?.eat()
    }
}

fun getAplhaWolf(): Wolf2? {
    return Wolf2()
}

fun main(args:Array<String>) {
    var w:Wolf2? = Wolf2()

    if (w != null) {
        w.eat()
    }
    var x = w?.hungred
    println("Голод  по оси Х, сейчас на уровне $x")

    var y = w?.hungred ?: -1
    println("Голод по оси Y, сейчас на уровне $y")

    var myWolf = MyWolf()
    myWolf?.wolf?.hungred = 8
    println("Голодность волка =  ${myWolf?.wolf?.hungred}")

    var myArray = arrayOf("Привет","Здорова",null)
    for (item in myArray) {
        item?.let { println(it) }
    }
    getAplhaWolf()?.let {it.eat()}

    w = null
    var z = w!!.hungred
}