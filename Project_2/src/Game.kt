import java.awt.Choice

//игра камень ножницы бумага
fun main(){
    //создаем массив с вариантами выбора для компьютера  и пользователя
    val options= arrayOf("Rock","Paper","Scissors")
    //создаем переменную в которой записывается результат вызова функции getGamechoice - рандолмный выбор из имеющеггося
    //массива options
    val gameChoice=getGameChoice(options)
    val userChoice=getUserChoice(options)
    printResult(userChoice, gameChoice)

}

//создаем функции для выбора варианта компьютером используя random
fun getGameChoice(optionsParam:Array<String>): String = optionsParam[(Math.random()*optionsParam.size).toInt()]

//создадим функцию, выбора пользователя
fun getUserChoice(optionsParam: Array<String>):String {
//переменная для проверки правильного ввода
    var isValidChoice = false
    var userChoice=""
    //выполнять цикл - пока не введут правильный вариант
    while (!isValidChoice) {
        //Запрос выбора
        print("Пожалуйтса введите ваш вариант")
        for (item in optionsParam) print(" $item")
        println(".")
        //прочитать ползовательский ввод
        var userInput = readLine()
        //проверка ввода на null и правильный выбор
        if (userInput != null && userInput in optionsParam) {
            isValidChoice = true
            userChoice = userInput
        }
        //если выбран недопустимый вариант, сообщить
        if (!isValidChoice) println("пожалуйста введите правильно")

    }
    return userChoice
}

//функция печати результатов
fun printResult(userChoice: String, gameChoice: String){
    var result: String
    if (userChoice == gameChoice) result="Ниичья"
    else if ((userChoice=="Rock" && gameChoice=="Scissors") ||
            (userChoice=="Paper" && gameChoice=="Rock") ||
            (userChoice=="Scissors" && gameChoice=="Paper"))
                result = "You win!"
    else result="You lose!"
    //общий резульат
    println("Выш выбор: $userChoice. Компьютер выбрал: $gameChoice. $result")
}


