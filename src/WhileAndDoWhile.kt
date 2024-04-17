fun main()
{
    var i = 1

    while (i <= 10)
    {
        println(i)
        i++
    }
    println("Enter a number to print its multiplication table")
    val num = readln().toInt()
    var count = 1
    while(count <= 20)
    {
        println("$num x $count = ${num * count}")
        count++
    }
    println("Done")

    // summing up first n natural numbers
    println("Enter the number of terms: ")
    val n = readln().toInt()
    var counter = 1
    var sum = 0
    do {
        sum += counter
        counter++
    }while(counter <= n)
    println("The sum of the terms is $sum")


}