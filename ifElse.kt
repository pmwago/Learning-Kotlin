package intro

fun trueOrFalse(par:Boolean):String{
    return if (par){
        "It's true"
    }
    else{
        "It's false"
    }
}
fun main(){
    val age :Int=25

    if (age>18){
        println("You're an adult!")
    }
    else{
        println("Child this one")
    }

    val isDead : Boolean =false

    if (isDead){  //evaluated directly since the variable is declared as boolean
        println("Rest in peace")
    }
    else{
        println("Very much alive")
    }

    val num:Int=3;
    println(trueOrFalse(num>5))
    println(trueOrFalse(num>1))


}