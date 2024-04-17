fun main(){
    println("Enter first number: ")
    val num1:Int = readln().toInt()

    println("Enter second number: ")
    val num2:Int = readln().toInt()
    val result:Int = addNums(num1,num2)
    println("The sum of the numbers is $result")

    println("Enter a number to check if it is even or odd")
    val number = readln().toInt()
    evenOrOdd(number)
    println()

    printMessage(50)
    println()
    printMessage()

}
fun addNums(n1:Int,n2:Int) = n1 + n2
fun evenOrOdd(n:Int){
   val result = if(n % 2 == 0) "Even" else "Odd"
    println(result)
}
// Default arguments
fun printMessage(count:Int = 5){
    for(i in 1.. count)
    {
        println("Hello $i")
    }
}