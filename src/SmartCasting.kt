fun main(){
    val bd1:Runnable = BullDog("Tommy",12)


    val bd2:Runnable = BullDog("Snoopy",12)


    val bd3:Runnable = BullDog("Dora",12)


    val d1:Runnable = Dog("Dora",12)

    val d2:Runnable = Dog("Barbie",12)

    val h1:Runnable = Human("Mahesh Sharma",21,21)

    val h2:Runnable = Human("Ramjeevan Bhatt",32,32)

    val r1:Runnable = Rabbit("Sherlock",9)




    // Creating an array of objects

    val arr: Array<Runnable> = arrayOf(bd1,bd2,bd3,d1,d2,h1,h2,r1)

    for(obj in arr)
    {
        when(obj)
        {
            is Dog ->{
                obj.eat()
                obj.run()
                obj.showDetails()
                obj.sleep()
            }
            is BullDog ->{
                obj.eat()
                obj.run()
                obj.showDetails()
                obj.sleep()
            }
            is Human ->{
                obj.eat()
                obj.run()
                obj.showDetails()
                obj.sleep()
            }
            is Rabbit ->{
                obj.eat()
                obj.run()
                obj.showDetails()
                obj.sleep()
            }
        }
    }



}

interface Runnable
{
    fun run()
}
abstract class Animal(val name:String,val lifeSpan:Int) : Runnable
{
    protected abstract val species:String

    abstract fun eat()
    abstract fun sleep()
    abstract fun showDetails()
}
class Dog(dogName:String,lifeSpan: Int) : Animal(dogName,lifeSpan)
{
    override val species = "general"
    override fun eat() {
        println("The dog is eating")
    }


    override fun sleep() {
        println("The dog is sleeping")
    }

    override fun showDetails() {
        println("The name of the general dog is $name")
        println("The lifespan of the general dog is $lifeSpan")
        println("The species of the general dog is $species")
    }

    override fun run() {
        println("The dog is running and searching for food")
    }
}
class BullDog(dogName:String,lifeSpan: Int) : Animal(dogName,lifeSpan)
{
    override val species: String = "Bull Dog"

    override fun eat() {
        println("The bull dog is eating")
    }

    override fun sleep() {
        println("The bull dog is sleeping ")
        println("Be careful folks")
    }

    override fun showDetails() {
        println("The name of the bull dog is $name")
        println("The lifespan of the dog is $lifeSpan")
        println("The species of the dog is $species")

    }

    override fun run() {
        println("The bull dog is running")
        println("The bull dogs are very dangerous !!")
    }
}
class Human(name: String,private val age:Int,yearsLived:Int) : Animal(name,yearsLived)
{
    override val species: String = "Human"

    override fun run() {
        println("The person is jogging")
    }

    override fun eat() {
       println("The person is having food")
    }

    override fun sleep() {
       println("The person is sleeping")
    }

    override fun showDetails() {
        println("The name of the person is $name")
        println("The age of the person is $age")
        println("The person is alive for $lifeSpan years")

    }
}
class Rabbit(name:String, lifeSpan: Int) : Animal(name,lifeSpan)
{
    override val species: String = "American Fuzzy Lop"
    override fun run() {
        println("The rabbit is running")
    }

    override fun sleep() {
        println("The rabbit is sleeping")
    }

    override fun eat() {
       println("The rabbit is having food")
    }

    override fun showDetails() {
        println("The name of the rabbit is $name")
        print("The lifespan of the rabbit is $lifeSpan")
        println("The species of the rabbit is $species")
    }
}