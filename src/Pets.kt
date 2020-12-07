//создаем абстрактный клас с одним пармметром, которыей будет наследоваться на 3 основных класса
abstract class Pet(var name:String)
class Cat(name: String):Pet(name)
class Dog(name: String):Pet(name)
class Fish(name: String):Pet(name)

class Contest<T: Pet> {
    //создаем переменную вида - ассоциативный список (ключ, значение)
    val scores: MutableMap<T, Int> = mutableMapOf()

    //функция добавления счета в значения
    fun addScore(t:T, score: Int=0){
        if (score>=0) scores.put(t, score)
    }

// функция выбора побидетеля - по значению
fun getWinners(): MutableSet<T> {
    //переменная winners
    val winners: MutableSet<T> = mutableSetOf()
    val highScore = scores.values.max()
    for ((t, score) in scores) {
        //добавление участникв в winners
        if (score == highScore) winners.add(t)
    }
    return winners
}
}

//добавляем интерфейс покупателя животных
interface Retailer<out T>{
    fun sell(): T
}
class CatRetail: Retailer<Cat> {
    override fun sell(): Cat {
        println("Продан Кот")
        return Cat("")
    }
}

class DogRetail: Retailer<Dog> {
    override fun sell(): Dog {
        println("Продана Собака")
        return Dog("")
    }
}
class FishRetail: Retailer<Fish> {
    override fun sell(): Fish {
        println("Продана Рыба")
        return Fish("")
    }
}

fun main(args: Array<String>){
    val catFuzz = Cat("Fuzz")
    val catDuzz = Cat("Duzz")
    val catKatsu = Cat("Katsu")
    val fishFinny = Fish("Finny")

    val catContest = Contest<Cat>()
    catContest.addScore(catKatsu, 60)
    catContest.addScore(catDuzz, 50)
    catContest.addScore(catFuzz, 55)

    val topCat = catContest.getWinners().first()
    println("У кошек победитель - ${topCat.name}")

    val petContest = Contest<Pet>()
    petContest.addScore(catFuzz, 55)
    petContest.addScore(fishFinny, 99)
    val topPet = petContest.getWinners().first()
    println("Общий победитель у животных - ${topPet.name}")

    val dogRetailer: Retailer<Dog> = DogRetail()
    val catRetailer: Retailer<Cat> = CatRetail()
    val petRetailer: Retailer<Pet> = CatRetail()
    petRetailer.sell()



}