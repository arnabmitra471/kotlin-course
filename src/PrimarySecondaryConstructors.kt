fun main()
{
    val bmw = Automobile("BMW",4,5,true,"Petrol")
    val mustang = Automobile("Mustang","Petrol")

    bmw.drive()
    bmw.applyBrakes()
    bmw.display()


    mustang.display()
    mustang.drive()
    mustang.applyBrakes()

    val e1 = Employee("Shyam",34,50000)
    val e2 = Employee("Mahesh",20,60000)
    println(e1.name)
    println(e1.age)
    println(e1.salary)

    println(e2.name)
    println(e2.age)
    println(e2.salary)
}
class Automobile(val name:String,val tyres:Int,val maxSeating:Int,hasAirBags:Boolean,val engineType:String)
{
    init {
        println("1st initializer block executed")
    }
    var airBags = hasAirBags
    init {
        println("2nd initializer block executed")
    }
    fun drive(){
        println("The car is being driven")
    }
    fun applyBrakes(){
        println("Applied brakes")
        println("Has Airbags: $airBags")
    }
    fun display(){
        println("The name of the car is $name")
        println("The number of tyres is $tyres")
        println("The max seating capacity is $maxSeating")
        println("The engine type is $engineType")
    }
    constructor(nameParam:String,engineParam:String):this(nameParam,4,5,true,engineParam)
    {

    }
}
class Employee(nameParam:String,ageParam:Int,salaryParam:Int)
{
    val name:String = "Hello $nameParam"
    var age:Int = ageParam
    var salary = salaryParam

    constructor(nameParam: String,ageParam: Int):this(nameParam,ageParam,5000)
    {

    }
}