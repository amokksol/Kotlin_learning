fun main (args: Array<String>) {
    val mShoppingList = mutableListOf("Чай","Яйца","Молоко")
    println(" Оригинальная коллеция mShopping = $mShoppingList")
    val extraShopping = listOf("Печенье", "Шоколад", "Пряники")
    mShoppingList.addAll(extraShopping)
    println("Добавленный спискок mShopping - $mShoppingList")
    if (mShoppingList.contains("Чай")) {
        mShoppingList.set(mShoppingList.indexOf("Чай"), "Кофе")
    }
    mShoppingList.sort()
    println("После сортировки: $mShoppingList")
    mShoppingList.reverse()
    println("Реверс: $mShoppingList")

    var a: MutableList<String> = mutableListOf()
    a.add(0,"Zero")
    a.add(1,"Two")
    a.add(2,"Four")
    a.add(3,"Six")
    println(a)
    if (a.contains("Zero")) a.add("Eight")
    a.removeAt(0)
    println(a)
    if (a.indexOf("Four") != 4) a.add("Ten")
    println(a)
    if (a.contains("Zero")) a.add("Twelve")
    println(a)

}
