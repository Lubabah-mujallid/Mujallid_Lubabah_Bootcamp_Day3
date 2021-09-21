import kotlin.random.Random

abstract class Animal(val name: String = "", val age: Int = 0) {
    abstract fun talk()
}

class Cat(name: String, age: Int) : Animal(name, age) {
    override fun talk() {
        println("$name: MEOW!")
    }
}

class Dog(name: String, age: Int) : Animal(name, age) {
    override fun talk() {
        println("$name: WOOF!")
    }
}

fun randomAnimal(iscat:Boolean):Animal{
    val names = listOf<String>("kitty","poppy","butter","sweet","lemon","toosh","furry","black","honey","smelly","sleepy")
    val age = Random.nextInt(10)
    if (iscat)
        return Cat(names[Random.nextInt(names.size)],age)
    else
        return Dog(names[Random.nextInt(names.size)],age)
}

fun main() {
    val cats = listOf<Cat>(randomAnimal(true) as Cat,randomAnimal(true) as Cat,randomAnimal(true) as Cat,randomAnimal(true) as Cat,randomAnimal(true) as Cat)
    val dogs = listOf<Dog>(randomAnimal(false) as Dog,randomAnimal(false) as Dog,randomAnimal(false) as Dog,randomAnimal(false) as Dog,randomAnimal(false) as Dog)
    for (i in cats){
        i.talk()
        for (j in dogs){
            if(j.age > i.age)
                j.talk()
        }
    }
}