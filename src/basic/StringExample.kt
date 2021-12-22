package basic

class StringExample {
}

fun StringExample.getName(str1: String, str2: String): String {
    return "$str1 $str2";
}

fun main() {
    val stringExample = StringExample()
    
    val name = stringExample.getName("Suraj", "Gopal")
    println("My name is $name")
}