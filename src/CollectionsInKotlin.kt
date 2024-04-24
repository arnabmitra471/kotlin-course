fun main(){
    val arr: List<Any> = listOf(34,45,67,98,90,12,54,87,76,111,145,"Hello","This is another String","Hello",23.5f,12.5f)
    for(i in arr)
    {
        println(i)
    }

    for(j in arr)
    {
        println(j)
    }
    println(arr)

    println(arr.contains(34))
    println(arr.indexOf(122))
    println(arr.lastIndexOf(111))
    println(arr.lastIndex)
    println("The size of the list is ${arr.size}")

    val mutableArr = mutableListOf(23,45,98,90,12,43,98,23)
    println(mutableArr)
    mutableArr.add(45)
    mutableArr.add(190)
    mutableArr.add(87)
    println(mutableArr)
    val mutableArr2 = mutableListOf(23,89,100,78,111,54,89)
    println(mutableArr2)
    println(mutableArr2[2])
    mutableArr.addAll(mutableArr2)
    mutableArr.removeAll(mutableArr2)
    println(mutableArr)


    var students = mutableMapOf<Int,String>()
    students[1] = "Mohan"
    students[2] = "Shyam"
    students[3] = "Rohan"
    students[4] = "Mahesh"
    students[5] = "Rajesh"
    println(students)
    println(students[3])

    for((key,value) in students)
    {
        println("$key -> $value")
    }
    students.remove(3)
    println(students)
}