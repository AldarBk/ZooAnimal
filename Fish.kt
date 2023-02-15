class Fish(
    energy: Int,
    weight: Int,
    currentAge: Int,
    maximumAge: Int,
    name:String): Animal(energy,weight,currentAge,maximumAge,name) {
       override fun move(){
           energy -= if (energy == 0)
               return
           else 5
           weight -= if (weight == 0)
               return
           else 1
           currentAge += if (tryIncrementAge()) {
               1
           } else 0
           println("$name плывет")
       }
}