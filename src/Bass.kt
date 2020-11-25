class Rectangle(var widht: Int, var height:Int){
    val isSquare: Boolean
    get() = (widht == height)

    val area: Int
    get() = (widht * height)
}

fun main(){
    var r = arrayOf(Rectangle(1, 1), Rectangle(1,1), Rectangle(1,1), Rectangle(1,1))
    for (x in 0..3) {
        r[x].widht = (x+1) * 3
        r[x].height = x +5
        print("Прямоугольник $x имеет площадь ${r[x].area}. ")
        println("Это ${if(r[x].isSquare) "" else "не"} квадрат.")
    }
}
