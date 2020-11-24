 class Song (val title: String, val artist: String){
     fun play() {
         println("Играет песня: $title  Артиста: $artist ")
     }
     fun stop () {
         println("Песня $title остановлена ")
     }
 }

 fun main(array: Array<String>){
     val songOne = Song("Что такое осень", "ДДТ")
     val songTwo = Song("Что нам делать в Греции", "Каста")
     val songThree= Song("Письмо", "Децл")
     songTwo.play()
     songTwo.stop()
     songThree.play()
 }