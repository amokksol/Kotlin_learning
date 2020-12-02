//объявляем класс указываем свойства, 2 свойства из 4 имеют значения по умолчанию false & easy
data class Recipes(val title:String,
                   val mainIngredient: String,
                   val isVegetarian:Boolean = false,
                   val difficulty: String = "Easy"){

}

//создаем для примера класс со вторичным  конструктором для примера
class Mushroom(val size: Int, val isMagic:Boolean){
  constructor(isMagic_param: Boolean) : this(0, isMagic_param){

  }

}
//функция использующая значения параметров по умолчанию
fun findRecepies(title: String ="",
                 ingredient:String="",
                 isVegetarian:Boolean=false,
                 difficulty:String=""):Array<Recipes>
{
  //код поиска рецепта
  return arrayOf(Recipes(title, ingredient,isVegetarian,difficulty))

}

//перегруженные функции
fun addNumbers(a:Int,b:Int): Int {
  return a+b
}
fun addNumbers(a:Double, b:Double):Double{
  return a+b
}
fun main() {
  val r1 = Recipes("Thai Curry", "Chicken")
  val r2 = Recipes(title="Thai Curry", mainIngredient = "Chicken")
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
    val (title, mainIngredient,vegetarian, difficulty) = r1
    println("$title,$vegetarian")
  //создание объекта Mushroom вызовом первичного констурктора
  val m1=Mushroom(6,false)
  println("m1 размер: ${m1.size} он магичен?: ${m1.isMagic}")
  //создание объекта вызовом вторичного конструктора
  val m2 = Mushroom(true)
  println("m2 размер: ${m2.size} он магичен?: ${m2.isMagic}")
  //вызов перегруженных функций int и double
  println(addNumbers(2,5))
  println(addNumbers(1.6,7.3))


}