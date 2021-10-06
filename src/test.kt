/*
Make a program that takes a value (x) and returns "Bang" if the number is divisible by 3, "Boom" if it is divisible by 5, "BangBoom" if it divisible by 3 and 5, and "Miss" if it isn't divisible by any of them. Note: Your program should only return one value

Ex: Input: 105 --> Output: "BangBoom" Ex: Input: 9 --> Output: "Bang" Ex:Input: 25 --> Output: "Boom"
*/

fun test(valor: Int): String {
    if ((valor % 15) == 0) {
        return "BangBoom"
    } else if ((valor % 3) == 0) {
        return "Bang"
    } else if ((valor % 5) == 0) {
        return "Boom"
    }

    return "Miss"
}


fun main() {

    if (test(3) != "Bang") {
        println("Error1")
    }
    if (test(15) != "BangBoom") {
        println("Error2")
    }

    if (test(2) != "Miss") {
        println("Error3")
    }

    if (test(5) != "Boom") {
        println("Error4")
    }
}