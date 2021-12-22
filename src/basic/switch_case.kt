package basic

fun main(){
    println("Enter the number")
    val num = readLine()!!.toInt()

    when(num){
        1 -> println("One")
        2 -> println("Two")
        else -> println("Invalid")
    }
}