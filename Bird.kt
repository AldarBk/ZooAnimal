class Bird(
energy: Int,
weight: Int,
currentAge: Int,
maximumAge: Int,
name:String): Animal(energy,weight,currentAge,maximumAge,name) {
    override fun move(){
   super.move()
        println("$name летит")
    }
}
