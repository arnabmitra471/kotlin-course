fun main(){
    val c1 = Car("BMW","Petrol",15000,2021,100)
    c1.fillFuel()
    c1.driveCar()
    c1.applyBrakes()
    c1.changeCoolent()
    c1.changeGear(3)
    c1.display()
    c1.speedUp( 45)
    c1.applyBrakes()

    println(c1.name)
    val c2 = Car("Mustang","Petrol",16000,2022,200)
    c2.fillFuel()
    c2.driveCar()
    c2.applyBrakes()
    c2.changeCoolent()
    c2.changeGear(3)
    c2.display()
    c2.speedUp( 45)
    c2.applyBrakes()
    println(c2.name)
    val c3 = Car("Beetle","Petrol",16000,2022,200)
    c3.fillFuel()
    c3.driveCar()
    c3.applyBrakes()
    c3.changeCoolent()
    c3.changeGear(3)
    c3.display()
    c3.speedUp( 45)
    c3.applyBrakes()
    println(c3.name)
}

class Car(val name:String, val type:String,val batteryCapacity:Int,val year:Int,var kmRan:Int)
{
    fun fillFuel(){
        println("Fuel is being filled")
    }
    fun driveCar(){
        println("$name is being driven")
     }
    fun changeCoolent(){
        println("Coolent is being refilled")
    }
    fun applyBrakes(){
        println("Applying brakes")
    }
    fun changeGear(gear:Int)
    {
        println("The gear has been changed to $gear th gear")
    }
    fun speedUp(speed:Int)
    {
        println("Speeding up to $speed km/h")
    }
    fun display(){
        println("The name of the car is $name")
        println("The type of the car is $type")
        println("The battery capacity of the car is $batteryCapacity")
        println("The car was bought in $year")
        println("The car has ran $kmRan kms")
    }
}