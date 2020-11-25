class Drumkit(var hasTopHat: Boolean, var hasSnare: Boolean) {
    //если hasTopHat - true - выводим данный текст
    fun playTopHat (){
        if (hasTopHat) println("ding ding ba-da-bing!")
    }
    //если hasShare  - true - выводим данный текст
    fun playShare(){
        if (hasSnare) println("bang bang bang")
    }
}

fun main(){
    val d = Drumkit(true, true) // переменаая в которой ссылка на классовые параметры - присваиваем им значения
    //вызываем
    d.playTopHat()
    d.playShare()
    d.hasSnare=false // сделали false - выведет только одну строку
    //повторный вызов
    d.playTopHat()
    d.playShare()
}