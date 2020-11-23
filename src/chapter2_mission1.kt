fun main()
{
    //1 задание
    val hobbits = arrayOf("Frodo","Sam","Merry","Pippin")
    var x = 0

    while (x<4) {
        println("${hobbits[x]} хорошее имся для хоббита")
        x +=1
    }

    //2 задание
    val fireman= arrayOf("Pugh","Pugh","Barney McGrew","Cuthbert","Dibble","Grub")
    var firemanNo = 0

    while (firemanNo < 6)
    {
        println("номера пожарного$firemanNo это ${fireman[firemanNo]}")
        firemanNo+=1
    }

}