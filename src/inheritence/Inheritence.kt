package inheritence
fun main(){
    var dog = Dog()
    dog.breed ="Labra"
    dog.color="black"
    println("${dog.breed}")
    println("${dog.color}")
}

open class AnimalClass{
    var color: String = "black"

    fun eat(){}

}

 class Dog : AnimalClass() {
    var breed: String = ""

    fun bark(){}


}

class Cat: AnimalClass(){
    var age: Int = -1

    fun meow(){}

}