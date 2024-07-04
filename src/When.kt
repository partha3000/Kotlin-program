fun main () {
    val day = 4

    val result = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    println(result)
    class Data(args: Array<String>){
        val a = -9
        val b = -11

        val max = if (a > b) {
            println("$a is larger than $b.")
            println("max variable holds value of a.")
            a
        } else {
            println("$b is larger than $a.")
            println("max variable holds value of b.")
            b
        }
    }
}