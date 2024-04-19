fun main(){
    val shapes = arrayOf(Circle(9.0),Circle(5.0),Square(5.0),Square(15.0),Triangle(4.0,5.0))
    calculateAreas(shapes)
}
fun calculateAreas(shapes: Array<Shape>){
    for(shape in shapes)
    {
        println(shape.area())
    }
}
open class Shape
{
    open fun area():Double{
        return 0.0
    }
}
class Circle(val radius:Double):Shape()
{
    override fun area():Double{
        return Math.PI * radius * radius
    }
}
class Square(val side:Double):Shape()
{
    override fun area():Double{
        return side * side
    }
}
class Triangle(val base:Double,val height:Double):Shape()
{
    override fun area():Double
    {
        return 0.5 * base * height
    }
}