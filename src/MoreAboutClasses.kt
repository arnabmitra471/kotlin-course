fun main(){
    val i = 34
    var sum = i.plus(3298)
    println(sum)
    var diff = i.minus(2164)
    println(diff)
    var prod = i.times(23)
    println(prod)
    println(i.toFloat())


    val p1 = Person("A",12)
    val p2 = Person("B",26)
    p1.eat()
    p1.checkVote()
    p1.sleep()
    p1.display()
    p1.study()

    p2.eat()
    p2.checkVote()
    p2.display()
    p2.sleep()
    p2.study()

}

class Person(val name:String,val age:Int)
{
    fun eat()
    {
        println("$name is eating")
    }
    fun display()
    {
        println("The name of the person is $name")
        println("The age of the person is $age")
    }
    fun sleep()
    {
        println("$name is sleeping")
    }
    fun study()
    {
        println("$name is studying")
    }
    fun checkVote()
    {
        if(age >= 18)
        {
            println("You can vote")
        }
        else
        {
            println("You cannot vote")
        }
    }
}