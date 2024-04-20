fun main(){
    val s1 = Circle1(7.0)
    val s2 = Square1(7.0)
    val s3 = Triangle1(6.0,7.0)
    val p1 = Player("Harish",32)
    val p2 = Player("Meera",25)
    println(s1.area())
    s1.display()
    s1.drag()
    s1.clone()
    println()
    println(s2.area())
    s2.display()
    s2.drag()
    s2.clone()
    println()
    println(s3.area())
    s3.display()
    s3.drag()
    s3.clone()
    println()

    p1.drag()
    p1.clone()

    p2.drag()
    p2.clone()

    val circle = Circle1(34.5)

    val arr = arrayOf(circle,s1,s2,p1)

    for(obj in arr)
    {
        if(obj is Circle1)
        {
            println(obj.area())
        }
        else if(obj is Square1)
        {
            println(obj.area())
        }
        else
        {
            (obj as Player).clone()
            obj.sayName()
        }
    }
}

interface Draggable
{
    val dragSpeed:Int
    fun drag()
}
interface Cloneable
{
    val cloneCount:Int
    fun clone()
}
abstract class Shape1 : Draggable{
    abstract fun area():Double
    abstract fun display()
}
class Circle1(val radius:Double) : Shape1(),Draggable,Cloneable
{
    override val dragSpeed: Int = 32
    override val cloneCount: Int = 5
   override fun area():Double{
       return Math.PI * radius * radius
   }

    override fun display() {
        println("Circle1 is being displayed")
    }

    override fun drag(){
        println("The dragging speed of the circle is $dragSpeed")
        println("Dragging Circle 1")
    }

    override fun clone() {
        println("Cloning Circle1 $cloneCount times")
    }
}
class Square1(val side: Double) : Shape1(),Draggable,Cloneable
{
    override val dragSpeed: Int = 45
    override val cloneCount: Int = 10
    override fun area(): Double {
       return side * side
    }

    override fun display() {
        println("Square is being displayed")
    }

    override fun drag(){
        println("The dragging speed of the square is $dragSpeed")
        println("Dragging Square 1")
    }

    override fun clone() {
        println("Cloning the square $cloneCount times")
    }
}
class Triangle1(val base:Double, val height:Double) : Shape1(),Draggable,Cloneable
{
    override val dragSpeed: Int = 25
    override val cloneCount: Int = 16
    override fun area(): Double {
       return 0.5 * base * height
    }

    override fun display() {
        println("Triangle1 is being displayed")
    }

    override fun drag(){
        println("The dragging speed of the triangle is $dragSpeed")
        println("Dragging Triangle 1")
    }

    override fun clone() {
        println("Cloning the triangle $cloneCount times")
    }
}

class Player(val name:String,val age:Int):Draggable,Cloneable
{
    override val dragSpeed: Int = 12
    override val cloneCount: Int = 34

    fun sayName(){
        println("The name of the player is $name")
    }
    override fun drag(){
        println("$name is dragging and his age is $age")
        println("The dragging speed of player is $dragSpeed")
    }

    override fun clone() {
        println("Cloning player $cloneCount times")
    }
}
