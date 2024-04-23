fun main(){
    val a1 = Address("Shalimar street","Bhavnagar","700001")
    val p1 = User("Ram",23,true,a1)
    val p2 = User("Ram",23,true,a1)
    println(p1)
    println(p1.hashCode())
    println(p2)
    println(p1 == p2)
    println(p2.hashCode())


    p1.greet()
    p1.work()
    p1.eat()
    p1.work()

    p2.greet()
    p2.work()
    p2.eat()
    p2.work()

    p1.printDetails()
    p2.printDetails()

    val newAddress = Address(street = "Badu road", city = "Madhyamgram", pinCode = "560002")
    var p3 = p1.copy(name = "Abhishek Verma", lovesEating = false,age = 43, address = newAddress)
    println(p3)
    println(p1)

    p3.address.city = "Jamnagar"
    println(p3.address)
    println(p1.address)

}
interface PrintableUser{
    fun printDetails()
}
data class User(var name:String, var age:Int,var lovesEating : Boolean, val address : Address) : PrintableUser
{
    fun greet(){
        println("Hello my name is $name and my age is $age years old")
    }
    fun work(){
        println("$name is working")
    }
    fun eat(){
        println("The user is having food")
    }
    override fun printDetails(){
        println("The name of the user is $name")
        println("The age of the user is $age")
        println("The user loves eating a lot $lovesEating")
    }
}
data class Address(val street : String, var city : String, val pinCode : String)
{

}