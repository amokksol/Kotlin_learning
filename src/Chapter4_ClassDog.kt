class Dog(val name: String, weight_param: Int, breed_param: String){
    init {
        print("Собака $name создана.")
    }
    var activities = arrayOf("Бег")
    val breed = breed_param.toLowerCase()

    init {
        println(" Порода собаки: $breed")
    }
    var weight = weight_param
    set(value) {
        if(value>0) field=value
    }
    val weightInKgs: Double
    get() = weight/2.2

    fun bark(){
        println(if (weight < 20) "Маленькая" else "Волчара")
    }
}
fun main(args: Array<String>){
    val myDog = Dog("Майло", 25, "Джек-Рассел")
    myDog.bark()
    myDog.weight=30
    println("Вес моего пса в килоограмах ${myDog.weightInKgs}")
    myDog.weight = -56
    println("Вес моей псины ${myDog.weight}")
    myDog.activities = arrayOf("Бегать", "Прыгать", "Лаять", "Лежать")
    for (item in myDog.activities){
        println("Моя собака умеет: $item")
    }

    val dogs = arrayOf(Dog("Лайма", 100, "Ротвейлер"), Dog("Туз",18,"Дворянин"))
    dogs[1].bark()
    dogs[1].weight = 15
    println("Вес ${dogs[1].name} составляет ${dogs[1].weight}")
}