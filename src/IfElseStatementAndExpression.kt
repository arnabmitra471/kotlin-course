fun main(){
    // Predicting apple price and deciding whethee to add to the cart or not

    val isRaining = false
    if(isRaining)
    {
        println("Hey it is raining !! Take your umbrella")
    }
    else
    {
        println("No rains - Enjoy your day")
    }

    val x = 101
    val y = 101

    val result = if(x > y)
    {
        "x is greater than y"
    }
    else if(x < y)
    {
        "x is less than y"
    }
    else
    {
        "x is equal to y"
    }
    println(result)

    val number = 20
    val res2 = if (number % 2 == 0)
    {
        "The number is even"
    }
    else
    {
        "The number is odd"
    }
    println(res2)

    val applePrice = 200
    val budget = 50000
    val shouldAddToCart:String = if(applePrice < budget)
    {
        "Alexa add 1kg apples to the cart"
    }
    else
    {
        "Alexa don't add 1kg apples to the cart"
    }
    println(shouldAddToCart)


}