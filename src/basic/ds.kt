package basic

import java.util.*
import kotlin.collections.HashMap

fun main(){
    var map = mutableMapOf<String, List<String>>();


    for(i in 0..1) {
        println("Enter username:")
        val username = readLine()!!.toString()

        println("Enter number of car:")
        val carCount = readLine()!!.toInt()

        var cars = mutableListOf<String>()
        println("Enter car:")
        for (car in 0 until carCount) {
            cars.add(readLine()!!.toString())
        }
        map[username] = cars

        println("=======map=====")

        println("$map")
    }

    println("==========print usermap==============")

    for(user in map.keys){
        println("$user")

        var userCars = map.get(key = user)
        for(c in userCars!!){
            println("$c")
        }
    }



}