package intro

fun sayHello(){   //return type is Unit,, not a must to include it
    println("Hello Mwas")
}
fun area(length:Int, width:Int):Int = length*width  //this syntax is used where the function returns an expression

fun main(){ sayHello()
    println(area(5,4))
}