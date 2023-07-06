fun main() {
  ageClassifier(14)
  ageClassifier(27)
    haveYouBeen("kenyan")
    haveYouBeen("Tanzania")
    haveYouBeen("Somalia")
    vehicle(1)
//    vehicle(10)
//    numbers((76,87,99,102)
    var y=arrayOf(23,46.6,73.8)
    println(y)
    println(mixedArray(arrayOf("sammy",23,46.6,73.8)))

}
fun ageClassifier(age:Int){
//    val age=12
//    if (age>12 && age<18){
//println("you are a teenager ")
//    }
//    else{
//        println("you are not a teenager")
//
//    }
    if (age >0 && age<1) {
        println("am a todler")
    }
        else if(age in 3..2){
            println("you are a baby")
    }
    else if(age in 5..16){
        println("you are a child")
    }
    else if (age>18 && age<59){
        println("you are an adult")
    }
    else{
        println("you are a retiree")
    }
}
fun classifier2(age: Int){
    when (age){
        0,1-> println("you are a baby")

    }
}
fun haveYouBeen(nationality:String){
    when (nationality){
        "kenyan"->println("have been to nairobi")
        "uganda"->println("have been to kampala")
        "rwanda"->println("have been to kigali")
        "Tanzania"->println("have been to Dodoma")
        "south sudan"->println("have been to Juba")
        "Sudan"->println("have been to Khartoum")
        else->println("have you been to Eas Africa")

    }
}
//write a function that takes in an interger representing the
//number of passengers a vehicle can sit.typically between 2 and 7
//classify the vehicles as
//coupe 2 seater
//wagon above 5 seater
fun vehicle(passenger:Int){
    when(passenger){
        2->println("coupe")
        5,6,7-> println("wagon")
        else ->println("other")
    }
}
//write afunction that takes an array of random integers and
// prints them out whether each is odd or even 76,87,99,102
fun numbers(num:Array<Int>){
    for (numbers in num)
        if (numbers / 2 !==0) {
            println("odd")
        }
    else{
        println("even")
    }
}
fun mixedArray(arr:Array<Any>):Double{
    var mixed=0.0
    for (elements in arr) {
        if (elements is Double){
            mixed += elements
        }
    }
    return mixed

}
