package basic

fun main(){
    println("Enter array size")
    val size = readLine()!!.toInt()
    var numArray:Array<Int> = Array(size){0}

    println("Enter $size number:")
    for(i in 0 until size){
        numArray[i] = readLine()!!.toInt()
    }

    println("=======Array===========:")
    for(ii in numArray.indices){
        println("${numArray[ii]}")
    }
}