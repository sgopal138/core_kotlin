package `interface`

abstract class MyAbstract {

    abstract var name: String
    open var designation : String? = null

}

class AbsText : MyAbstract(){
    override var name: String = "suraj"

    override var designation: String? = ""
        get() = field
        set(value) {field = value}

}

fun main(){
    var absTest = AbsText()
    println("My name is ${absTest.name}")
    absTest.designation = "eng"
    println("Designation is ${absTest.designation}")

    with(absTest){
        print("New name ${absTest.name}")
        absTest.designation = "dfsffd"
        println("Designation is ${absTest.designation}")
    }
}

