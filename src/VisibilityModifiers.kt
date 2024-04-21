fun main(){
    val obj = B()
    println(obj.p)
    println(obj.r)
    obj.test()
}
open class A{
    val p = 32
    private val q = 556
    internal val r = 12
    protected val s = 45

    protected fun gn(){
        println("This is g(n) function")
    }
}
class B : A()
{
    fun test(){
        println("value of p = $p")
        println("value of r = $r")
        println("value of s = $s")
        gn()
    }
}


