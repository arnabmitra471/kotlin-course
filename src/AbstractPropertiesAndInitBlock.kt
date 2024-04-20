fun main(){
    val p1 = Person2("Harsh",34,true)
    println(p1)
    p1.display()
}
class Person2(val name:String,val age:Int,val knowsProgramming:Boolean)
{
    var salary: Float = 0.0f
    init {
        salary = 5600000.0f
        println("salary property has been initialized")
    }
    fun display(){
        println("The name of the person is $name")
        println("The age of the person is $age")
        println(knowsProgramming)
    }
}