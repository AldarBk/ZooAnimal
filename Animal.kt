import kotlin.random.Random

open class Animal(
    var energy: Int,
    var weight: Int,
    var currentAge: Int,
    val maximumAge: Int,
    val name: String
) {
    var isTooOld = false


    fun ageOld(): Boolean {
        if (currentAge >= maximumAge)
            isTooOld = true
        return isTooOld
    }

    fun sleeping() {
        energy += 1
        currentAge += 1
        println("$name спит")
    }

    fun eating() {
        energy += 3
        weight += 1
        currentAge += if (tryIncrementAge())
            1
        else 0
        println(" $name ест")
    }

    open fun move() {
        energy -= if (energy == 0)
            return
        else 5
        weight -= if (weight == 0)
            return
        else 1
        currentAge += if (tryIncrementAge())
            1
        else 0
        println("$name передвигается")
    }

    fun birth(): Animal {
        return Animal(energy = Random.nextInt(1, 10), weight = Random.nextInt(1, 5), currentAge = 0, maximumAge, name)
    }

    fun tryIncrementAge(): Boolean{
        return Random.nextBoolean()
    }
}