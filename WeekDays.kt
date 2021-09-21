/*Days of the Week
Create a dictionary that uses numbers 1 - 7 for keys and days of the week as values
Print each day of the week using a for loop*/

fun main(){
    val week = mapOf(1 to "Sun", 2 to "Mon", 3 to "Tue", 4 to "Wed", 5 to "Thu", 6 to "Fri", 7 to "Sat")
    //println(week.keys)
    for(i in 1..week.size)
        println("day number $i is ${week[i]}")
}