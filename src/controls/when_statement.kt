package controls

fun main(args: Array<String>) {

    var day: String = "Monday"

    when(day){
        "Sunday" -> print("Tpdau is Sunday")
        "Monday" -> print("Today is Monday")

        else -> print("day not found")
    }
}