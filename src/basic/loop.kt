package basic

fun main(){
    println("=======For Loop========")

    for(i in 1..10 step 2){
        if(i == 7)
            continue
        println("$i")
    }

    println("=======While Loop========")
    var i1 = 1
    while(i1 <=10){
        println("$i1")
        i1 += 2
        if(i1 == 3)
            break

    }

    println("=======Do While Loop========")

    var i2 = 1
    do{
        println("$i2")
        i2 += 2
    } while(i2 <=10)

}