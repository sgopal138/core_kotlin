package controls

fun main(args: Array<String>){

    var row = 5

    for(i in 1..row){
        for(j in 1..i){
            print(j)
        }
        println()
    }

    println("============================")

    for(i in 1..5){
        for(j in 5 downTo i){
            print(j)
        }
        println()
    }

    println("==========================")

    for(i in 1..5){
        for(j in 5 downTo i){
            print(" ")
        }
        for(k in 1..i){
            print(k)
        }
        println()
    }

    println("==========================")

    for(i in 1..5){
        for(j in 5 downTo i){
            print(" ")
        }
        for(k in 1..i){
            print(k)
        }
        for(l in 2..i){
            var aa = l.downTo(1 )
            print(aa)
        }
        println()
    }
}