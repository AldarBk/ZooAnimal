class NatureReserve {
    var animaReserve = mutableListOf<Animal>()
    var animal = Animal(100, 10, 5, 12, "Гекон")
    var dog = Animal(100, 10, 5, 12, "Песик")
    var bird = Animal(100, 10, 5, 12, "Ястреб")
    var fish = Animal(10, 5, 2, 6, "Пиранья")

    init {
        for (i in 1..5) {
            animaReserve.add(bird)
        }
        for (i in 1..3) {
            animaReserve.add(fish)
        }
        for (i in 1..2) {
            animaReserve.add(dog)
        }
        for (i in 1..4) {
            animaReserve.add(animal)
        }
    }
}