fun main(){
    val t1 = Tablet(11)
    t1.powerOn()
    t1.accessInternet()
    t1.developApps()
    t1.playMovie()
    t1.recordVideo()
    t1.sendMessage()
    t1.makeCall()
    t1.takePicture()
    t1.developApps()
    t1.getDeviceInfo()
    t1.powerOff()
    t1.display()
    println(t1.toString())
}
open class Phone
{
    open val name:String = ""
    open val type:String = ""
    open val color:String = ""

    fun powerOn(){
        println("Powering on the device")
    }
    fun powerOff(){
        println("Powering the device off")
    }
    fun getDeviceInfo(){
        println("Getting the device info")
    }
    fun makeCall(){
        println("Calling...")
    }
    fun sendMessage(){
        println("Sending a message")
    }
}
open class SmartPhone(versionParam: Int) : Phone()
{
    override val name = "Realme"
    override val type = "Smartphone"
    override val color = "Yellow"
    val version:Int = versionParam
    open fun takePicture(){
        println("Taking a picture")
    }
    open fun recordVideo(){
        println("Recording video")
    }
    open fun accessInternet(){
        println("Connecting to internet")
    }
    open fun playMovie(){
        println("Playing movies")
    }
    open fun display(){
        println("The name of the phone is ${this.name}")
        println("The phone is a ${this.type}")
        println("The color of the phone is ${this.color}")
        println("Your android version is $version")
    }
}
class Tablet(versionParam:Int):SmartPhone(versionParam) {
    override val name = "Samsung Galaxy Tab A"
    override val type = "Tablet"
    override val color = "white"
    override fun recordVideo() {
        super.recordVideo()
        println("Recording video on tablet")
    }
    override fun takePicture()
    {
        super.takePicture()
        println("Taking picture on tablet")
    }
    override fun accessInternet(){
        super.display()
        println("Connecting to 5G Internet")
    }
    override fun playMovie(){
        println("Playing a movie")
    }
    fun developApps(){
        println("Developing android apps")
    }

    override fun display() {
        super.display()
        println("The name of the tablet is ${this.name}")
        println("The type of the device is ${this.type}")
        println("The color of the device is ${this.color}")
    }

    override fun toString(): String {
        return "name - $name type - $type"
    }

}
