fun main(){
    Logger.log("This is a log message")
    Logger.log("This is another log message")

    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementInstagramLikes()
    SharingWidget.incrementInstagramLikes()
    SharingWidget.incrementInstagramLikes()
    SharingWidget.incrementFBLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.display()

//    val s1 = SharingWidget
//    val s2 = SharingWidget
//    val s3 = SharingWidget
//    println(s1)
//    println(s2)
//    println(s3)

    val obj2 = object : CloneableWidget
    {
        override fun cloneWidget() {
            println("Cloning the anonymous widget")
        }
    }
    obj2.cloneWidget()


}
object Logger
{
    fun log(message : String){
        println(message)
    }
}

interface CloneableWidget
{
    fun cloneWidget()
}

object SharingWidget : CloneableWidget
{
    private var twitterLikes = 0
    private var FBLikes = 0
    private var instagramLikes = 0

    fun incrementTwitterLikes() = twitterLikes++
    fun incrementFBLikes() = FBLikes++
    fun incrementInstagramLikes() = instagramLikes++

    fun display(){
        println("Facebook Likes - $FBLikes")
        println("Instagram Likes - $instagramLikes")
        println("twitter Likes - $twitterLikes")
    }

    override fun cloneWidget() {
        println("Cloning sharing widget")
    }
}