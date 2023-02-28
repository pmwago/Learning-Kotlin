package intro

fun calculateBMI(weight:Double,height:Double) : String{
    var bmi= weight/(height*height)
    if(bmi<18.5){
        return "Underweight"
    }
    else if(bmi>=18.5 && bmi<=24.9){
        return "normal"
    }
    else{
        return "overweight"
    }
}
fun main(){
    var weight=72.57
    var height=1.727
    val BMI= calculateBMI(weight,height)
    println(BMI)
}