package basic

fun main(args: Array<String>){
    /*var name: String
    name = "Suraj"
    print(name)*/

//    display("Gopal")

    var person = Person()
    person.display(" Suraj Gopal")
    println("Company name is ${person.company}")

    println(getName())
}

fun getName(): String{
    return "Suraj Gopal haahaahahah"
}

fun display(name: String){
    println(name)
}

class Person{
    val company : String = "TechM"
    fun display(name: String){
        print(name)
    }
}