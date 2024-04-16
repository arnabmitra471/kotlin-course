fun main(){
    // Arithmetic operators
    var num1 = 225
    var num2 = 43
    val sum = num1 + num2
    println("The sum of the two numbers is $sum")

    val diff = num1 - num2
    println("The difference between two numbers is $diff")

    val prod = num1 * num2
    println("The product of the two numbers is $prod")

    val quot = num1 / num2
    println("The quotient after division is ${quot.toFloat()}")

    val rem = num1 % num2
    println("The remainder after division is $rem")

    println("The actual value of num1 is $num1")
    num1++
    println("The incremented value of num1 is ${num1++}")
    ++num2
    println("The incremented value of num2 is $num2")

    println("The actual value of num1 is $num1")
    num1--
    println("The decremented value of num1 is $num1")

    // Relational operators
    println(num1 > num2)
    println(num1 < num2)
    println(num1 >= num2)
    println(num1 <= num2)
    println(num1 == num2)
    println(num1 != num2)

    // Logical operators

    val above70 = false
    val knowsProgramming = false

    var calledForInterview = above70 && knowsProgramming
    println(calledForInterview)

    // || (or)
    calledForInterview = above70 || knowsProgramming
    println(calledForInterview)

    // Working with logical expressions - Short circuiting


    /*
    In case of logical or (||) if the first condition becomes true then it will
    not check any further condition
     */
    /*
    In case of logical and (&&) if the first condition becomes false then it will
    not check any further condition
     */
    var i = 10
    var j = 11
    var result = i == 10 || j++ == 11
    println(i)
    println(j)
    println(result)
    result = i == 10 && j++ == 11
    println(result)

    // Not Operator

    val answer = false
    val negateResult = !(!answer)
    println(negateResult)



}