fun main(){
    val number = 5
    val result = number in 1 until 5 // 1,2,3,4
    println(result)

    val animal = "Cat"

//    if(animal == "Dog")
//    {
//        println("Animal is dog")
//    }
//    else if(animal == "Horse")
//    {
//       println("Animal is Horse")
//    }
//    else if(animal == "Goat")
//    {
//        println("Animal if goat")
//    }
//    else if(animal == "Cat")
//    {
//        println("Animal is cat")
//    }
//    else
//    {
//        println("Animal not found")
//    }


    val animalRes = when(animal)
    {
        "Dog" -> "Animal is dog"
        "Horse" -> "Animal is Horse"
        "Cat" -> "Animal is cat"
        "Goat" -> "Animal is Goat"
        else -> "Animal not found"
    }
    println(animalRes)

    val num = 19
    when(num) {
        11 -> println("The number is eleven")
        12 -> println("The number is twelve")
        in 13..19 -> println("Teen")
        else -> println("Not in range")
    }


}