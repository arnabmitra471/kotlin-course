import kotlin.math.pow

fun main(){
    println("Enter first number: ")
    val num1 = readln().toDouble()

    println("Enter second number: ")
    val num2 = readln().toDouble()
    /* The reference to the function is stored in the variable
    So we can use the reference of the function to invoke it
     */
    val fn = :: addition
    val sum = fn(num1,num2)
    println("The sum of the numbers is $sum")

    println("Enter a number: ")
    val n1 = readln().toDouble()

    println("Enter exponent: ")
    val exp = readln().toDouble()

    val powerFn = :: power
    val res = powerFn(n1,exp)
    println("The number raised to $exp th power is $res")
}
fun addition(a:Double,b:Double):Double
{
    val sum = a + b
    return sum
}
fun power(n1:Double,n2:Double):Double
{
    return n1.pow(n2)
}