//игра камень ножницы бумага
fun main(){
    //создаем массив с вариантами выбора для компьютера  и пользователя
    val options= arrayOf("Rock","Paper","Scissors")
    //создаем переменную в которой записывается результат вызова функции getGamechoice - рандолмный выбор из имеющеггося
    //массива options
    val gameChoice=getGameChoice(options)

}

//создаем функции для выбора варианта компьютером используя random
fun getGameChoice(optionsParam:Array<String>): String = optionsParam[(Math.random()*optionsParam.size).toInt()]
