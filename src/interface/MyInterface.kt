package `interface`

interface MyInterface {
    var name: String
    fun onClick();
}

class MyClass : MyInterface{
    override var name: String = "Suraj"


    override fun onClick() {
        print("onClick() called")
    }

}

fun main(args: Array<String>){
    var myClass = MyClass()
    myClass.name = "Suraj"
    println(myClass.name)

    myClass.onClick()
}