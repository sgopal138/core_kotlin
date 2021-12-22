package basic

fun main(){
    println("Enter the number")
    val num: Int = readLine()!!.toInt()

    if(num % 2 == 0){
        println("Number $num is even")
    } else {
        println("Number $num is odd")
    }
}