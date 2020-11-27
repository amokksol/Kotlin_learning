interface Roamable {
    var velocity: Int
    get() = 20
    set (value) {
        println("Включение обновления: Скорость")
    }
}
//класс ОБЯЗАН реализовывать функции и ссвойства полученные от Интерфейса - чтобы это пропустить - нужно объявлять
// класс асбтрактным
class Venicle:Roamable, Animal(){
    override fun roam(){
        println("выбор машины")
    }
}