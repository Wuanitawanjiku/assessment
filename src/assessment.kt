fun main(){

introduction("Wuanita",23)
    drinks(23)
    println(names("Nathaniel", "Joy", "Stephanie","Abel"))
    mulDiv()
    Human("Angel", 12,34.5)
    comparison(101,454)
    names(arrayOf("Mercy", "Patience","Joel"))

}
fun introduction(name: String, age:Int){
    print("My name is $name and I am $age years old.")
}

fun drinks(age :Int): String {
    if (age < 6){
        return "Serve a glass of milk"
    }
    else if (age <=15){
        return "Serve a bottle of fanta"
    }
    else {
        return "Serve a bottle of coca cola"
    }
}

fun names(a:String, b:String, c:String, d:String): Int{
    var names = arrayOf(a, b, c, d)
    var length =0
    for (name in names){
        if (name.length > 4){
            length++
        }
    }
    return length
}

fun mulDiv(){
 var a = 34
 var b = 64
 var c = (a * b)
 var d = (a / b)
 var e = (a % b)
}

class Human(var name:String, var age:Int, var weight:Double)
fun eat(foodWeight:Int){
    var foodWeight = 1
    print("I am eating {foodWeight} kgs of food")
}
fun speak(speech: String){
    print("I love Kenya")
}
fun birthday(){
    var age = 0
    age++
}

fun comparison(a: Int, b:Int):Int{
    return b
}

fun names(name: Array<String>){

}