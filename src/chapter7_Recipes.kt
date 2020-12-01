//объявляем класс данных не ставим  - {}  - так как класс не имеет тела
data class Recipes(val title:String, val isVegetarian:Boolean)
fun main() {
  val r1 = Recipes("Thai Curry", false)
  val r2 = Recipes("Thai Curry", false)
    //создаем переменную - копию r1 - с изменным параметром
  val r3 = r1.copy(title = "Chicken Dhuna")
    //выводим хэшируемые значения переменных
    println("r1 hash code: ${r1.hashCode()}")
    println("r2 hash code: ${r2.hashCode()}")
    //копии дается другое хэш значение
    println("r3 hash code: ${r3.hashCode()}")
    //печатем в строком виде все значения перемнной
    println("r1 toString ${r1.toString()}")
// проверка эквивалентности и тождества
    println("r1 == r2? ${r1==r2}")
    println("r1 === r2? ${r1===r2}")
    println("r1 == r3? ${r1==r3}")
    //деструктуризация на отдельные перемнные
    val (title, vegetarian) = r1
    println("$title,$vegetarian")

}