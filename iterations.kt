package intro

fun showRange(par:IntProgression){
    for(i in par){
       print(i)
    }
    print("")
    println()
}
fun main(){
    showRange(1..5)
    showRange(0 until 5)
    showRange(5 downTo 1) // [1]
    showRange(0..9 step 2) // [2]
    showRange(0 until 10 step 3) // [3]
    showRange(9 downTo 2 step 3)

    val name="abc"
    for(n in 0..name.lastIndex){
        print(name[n]+1)
    }

    println()
    var i = 1
    println(i++ + ++i)


}