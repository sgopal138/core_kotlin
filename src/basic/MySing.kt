package basic

 class MySing{

    private constructor(){
        println("constructor called...")
    }

    companion object{
        val instance:MySing by lazy { MySing()}
    }
}

fun main(args: Array<String>) {
    val obj = MySing.instance;
}

