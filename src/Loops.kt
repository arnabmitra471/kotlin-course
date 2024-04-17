fun main() {
    // While loop do while loop and for loop
    // Loops are used a set of instructions repeatedly

    for (i in 1..10 step 2)
    {
        println(i)
    }
    println("Enter a number to print its multiplication table: ")
    val num = readln().toInt()
    for (i in 1..20) {
        println("$num x $i = ${num * i}")
    }

//    for(i in 1..100)
//    {
//        println("Arnab Mitra")
//    }

    for (i in 1..10) {
        for (j in 1..12) {
            println(" i: $i, j:$j")
        }
    }
    val cars = arrayOf("BMW","Ford","Audi","Maruti Suzuki","Chevrolet","Volvo")
    for(i in cars)
    {
        println(i)
    }
    println()
    println(cars[0])
    println(cars[1])

    var greeting = "Hello everyone !"
    println(greeting)
//    println(greeting[0])
//    println(greeting[1])
    for(char in greeting)
    {
        println(char)
    }
    println()
    for(n in 1 ..< 100)
    {
        println(n)
    }
    println()
    for( i in 100 downTo 1 step 2)
    {
        println(i)
    }
}