package controls

fun main(args:Array<String>){
    var a = 2
    var b =5

    var maxValue : Int

    if(a>b)
        maxValue = a
    else
       maxValue = b
    print(maxValue)


    var max:Int = if(a>b) {
        print("a is greater")
        a
    } else {
        print("b is greater")
        b
    }
    print(max)
}