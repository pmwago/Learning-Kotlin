package intro

fun isOpen(hour:Int): Boolean {
    var open=8
    var close=17

    val status= if(hour>=open && hour<=close)
         true
      else  false
    return status
}

fun main(){
    print("Open : ")
    println(isOpen(10))
}