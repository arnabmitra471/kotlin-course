fun main(){
    val day = Day.MONDAY
//    when(day)
//    {
//        Day.MONDAY -> println("Day is monday")
//        Day.TUESDAY -> println("Day is tuesday")
//        Day.WEDNESDAY -> println("Day is wednesday")
//        Day.THURSDAY -> println("Day is thursday")
//        Day.FRIDAY -> println("Day is friday")
//        Day.SATURDAY -> println("Day is saturday")
//        Day.SUNDAY -> println("Day is sunday")
//    }
    for(i in Day.entries)
    {
        println(i)
    }
    println(Day.entries)
    day.printFormattedDay()
    println(day.number)
}
enum class Day(val number:Int)
{
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),FRIDAY(5), SATURDAY(6),SUNDAY(7);

    fun printFormattedDay(){
        println("The day is $this")
    }
}