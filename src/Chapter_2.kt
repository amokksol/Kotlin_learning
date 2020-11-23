fun main(){
//преобразование Int в Long
    var x = 5
    var z: Long = x.toLong()
//преобразование из Long в Int - если число слишкоми больше для Int - выведет странное число
    var a = 234564646464585
    var b: Int=a.toInt()


    //массивы

    //объявление массива
    var myArray= arrayOf(1,2,3)
    println(myArray[0])
    println(myArray.size)
    myArray = arrayOf(5,6)
    print(myArray.size)
}