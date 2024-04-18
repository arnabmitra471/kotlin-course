import kotlin.math.pow

fun main(){
    println("Enter the length of cuboid: ")
    val len = readln().toInt()

    println("Enter the breadth of cuboid: ")
    val bre = readln().toInt()

    println("Enter the height of cuboid: ")
    val hei = readln().toInt()

    val cuboidSa:Int = surfaceArea(len,bre,hei)
    println("The surface area of the cuboid is $cuboidSa")

    println("Enter the side of the cube")
    val cubeSide = readln().toDouble()
    val cubeSa = surfaceArea(cubeSide)
    println("The surface area of the cube is $cubeSa")

    println("Enter the radius of the sphere: ")
    val radius = readln().toInt()
    val sphereSa = surfaceArea(radius)
    println("The surface area of the sphere is $sphereSa")

    println("Enter the length of the rectangle: ")
    val recLen = readln().toDouble()

    println("Enter the breadth of the rectangle: ")
    val recBre = readln().toDouble()
    val recArea = area(recLen,recBre)
    println("The area of the rectangle is $recArea")

    println("Enter the radius of the circle: ")
    val radiusCirc = readln().toDouble()
    val circArea = area(radiusCirc)
    println("The area of the circle is $circArea")

}
fun area(l:Double,b:Double):Double
{
    val area:Double = l * b
    return area
}
fun area(r:Double):Double
{
    val area:Double = Math.PI * r.pow(2.0)
    return area
}

fun surfaceArea(s:Double):Double
{
    val sa = 6 * s.pow(2.0)
    return sa
}
fun surfaceArea(l:Int,b:Int,h:Int):Int
{
    val sa = 2 * ((l * b ) + (b * h) + (l * h))
    return sa
}
fun surfaceArea(r:Int):Double
{
    val sa = 4 * (Math.PI * r * r * r)
    return sa
}