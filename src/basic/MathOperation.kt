package basic

fun main() {
    print("Enter number1 : ")
    val number1 = readLine()!!.toDouble()

    print("Enter number2 : ")
    val number2 = readLine()!!.toDouble()

    val sum = number1 + number2
    println("Sum of $number1 and $number2 is : $sum")

    val subs = number1 - number2
    println("Subtract of $number1 and $number2 is : $subs")

    val mul = number1 * number2
    println("Mul of $number1 and $number2 is : $mul")

    val div = number1 / number2
    println("Divide of $number1 and $number2 is : $div")
}