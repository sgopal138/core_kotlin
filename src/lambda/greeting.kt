package lambda

fun main(args: Array<String>){
    val greeting = {println("Hello")}
    greeting()

    val addition = { a: Int, b: Int -> a+b}
    val result = addition(2,5)
    println(result)

    callMe { println("callMe() called") }
}

fun callMe(greeting: () -> Unit){
    greeting()
}