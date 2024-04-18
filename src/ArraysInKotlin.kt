fun main()
{
    val arr:Array<Int> = arrayOf(45,98,90,12,76,98,98,23,18,230,340)

    for( (i,e) in arr.withIndex())
    {
        println("$i - $e")
    }
    // Accessing the elements of an array
    println()
    println(arr[1])
    println(arr[5])
    println(arr[2])
    println("The size of the array is ${arr.size}")

    arr[2] = 156
    println(arr[2])
}