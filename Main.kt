fun main(){
val spisok = NatureReserve().animaReserve
    val zoo = NatureReserve()
    for (i in 1..2)
        spisok.forEach{
            when ((1..4).random()){
                1 -> it.move()
                2 -> it.sleeping()
                3 -> it.eating()
                4 -> it.birth()
            }
        }
}