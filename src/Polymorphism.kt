fun main(){
    val shapes = arrayOf(Circle(9.0),Circle(5.0),Square(5.0),Square(15.0),Triangle(4.0,5.0))
    calculateAreas(shapes)

    val square:Shape = Square( 4.0)
    square.area()
    printArea(square)
    square.display()

    val circle:Shape = Circle(20.0)
    circle.area()
    printArea(circle)
    circle.display()

    val triangle:Shape = Triangle(44.0,32.0)
    triangle.area()
    printArea(triangle)
    triangle.display()
}
fun calculateAreas(shapes: Array<Shape>){
    for(shape in shapes)
    {
        println(shape.area())
    }
}
fun printArea(shape:Shape){
    println(shape.area())
}
abstract class Shape
{
    abstract fun area():Double
    abstract fun display()
}
class Circle(val radius:Double):Shape()
{
    override fun area():Double{
        return Math.PI * radius * radius
    }

    override fun display() {
        println("Circle is getting displayed")
    }
}
class Square(val side:Double):Shape()
{
    override fun area():Double{
        return side * side
    }
    override fun display(){
        println("Square is getting displayed")
    }
}
class Triangle(val base:Double,val height:Double):Shape()
{
    override fun area():Double
    {
        return 0.5 * base * height
    }

    override fun display() {
        println("Triangle is getting displayed")
    }
}