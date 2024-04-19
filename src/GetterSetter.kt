fun main()
{
    val calc = Calculator()
    val sum = calc.add(32,65)
    val sumFloat = calc.add(54.6f,58.9f)
    println("The sum of the integers is $sum")
    println("The sum of the floats is $sumFloat")

    val diff = calc.subtract(32,65)
    val diffFloat = calc.subtract(54.6f,58.9f)
    println("The sum of the integers is $diff")
    println("The sum of the floats is $diffFloat")

    val prod = calc.multiply(32,65)
    val prodFloat = calc.multiply(54.6f,58.9f)
    println("The sum of the integers is $prod")
    println("The sum of the floats is $prodFloat")

    val p1 = Person1("A",34)
    val p2 = Person1("B",21)

    println(p1.name)
    println(p1.age)

    println(p2.name)
    println(p2.age)
    p2.age = 23
    println(p2.age)

}
class Calculator
{
    lateinit var message:String

    fun add(n1:Int,n2:Int):Int{
        val sum = n1 + n2
        return sum
    }
    fun add(n1:Float,n2:Float):Float
    {
        val sum = n1 + n2
        return sum
    }
    fun subtract(n1:Int,n2:Int):Int{
        val diff = n1 + n2
        return diff
    }
    fun subtract(n1:Float,n2:Float):Float
    {
        val sum = n1 + n2
        return sum
    }
    fun multiply(n1:Int,n2:Int):Int{
        val prod = n1 * n2
        return prod
    }
    fun multiply(n1:Float,n2:Float):Float
    {
        val prodFloat = n1 * n2
        return prodFloat
    }

}
// Getters and setters

class Person1(nameParam:String,ageParam:Int)
{
    var name = nameParam
        get(){
            return field.uppercase()
        }
    var age = ageParam
        set(value)
        {
            if(value > 0)
            {
                field = value
            }
            else
            {
                println("Cannot set negative age")
            }
        }
}