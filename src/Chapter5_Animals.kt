//создание класса животных
//OPEN если ставим перед классом - определяем его как супер класс
//Если OPEN  перед свойствами класса - то значит эти свойства должны переопределяться
open class Animal {
    open val image=""
    open val food=""
    open val habitat=""
    val hunger=10
    //OPEN перед функциями - указывает, что они будут переопределяться для каждого животного возможно по разному
    //звук издаваемый животным
    open fun makeNoise(){
        println("Животное издает свой звук")
    }
    //пища
    open fun eat(){
        println("Животное употребляет пищу")
    }
    //ореал обитания
    open fun roam() {
        println("У животного есть Вид")
    }
    //сон
    fun sleep() {
        println("Живтное может спать")
    }
}
//создаем подкласс гиппо - и указываем его наследование от суперкласса Animal
class Hippo: Animal(){
    //переопределяем свойства которые наследуем от суперкласса Animals
    override val image = "hippo.jpg"
    override val food  = "Трава"
    override val habitat = "Вода"
    override fun makeNoise() {
        println("Фыр Фыр Фыр")
    }
    override fun eat(){
        println("Гиппопотам ест  $food")
    }
}
open class Canine: Animal(){
    override fun roam() {
        println("Это вид - собачьих")
    }
}

class Wolf: Canine(){
    override val image = "wolf.jpg"
    override val food  = "мясо"
    override val habitat = "Леса"
    override fun makeNoise() {
        println("АУУУУУУУ")
    }
    override fun eat(){
        print("Волки едят $food")
    }
}
class Vet {
    fun giveShot(animal:Animal) {
        animal.makeNoise()
    }
}

fun main(args:Array<String>) {
    val animals= arrayOf(Hippo(), Wolf())
    for (item in animals) {
        item.roam()
        item.eat()
    }
    val vet = Vet()
    val wolf = Wolf()
    val hippo = Hippo()
    vet.giveShot(wolf)
    vet.giveShot(hippo)


}