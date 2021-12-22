package basic

fun main(){

   /* val diceRange = 1..6
    var randomNumber = (1..6).random()

    println("Random Number is ${randomNumber}")*/

    val dice = Dice(6, "Red")
//    dice.sides = 10
    println("Your ${dice.sides} sided dice rolled ${dice.roll()} with color ${dice.color}")

    val dice1 = Dice(10, "Blue")
//    dice.sides = 10
    println("Your ${dice1.sides} sided dice rolled ${dice1.roll()} with color ${dice1.color}")
}

class Dice(var sides: Int, var color: String) {
//    var sides = 6

   /* fun roll() : Int {
        var randomNumber = (1..sides).random()

//        println("Random Number is ${randomNumber}")
        return randomNumber
    }*/

    fun roll() : Int {
        return (1..sides).random()

    }
}