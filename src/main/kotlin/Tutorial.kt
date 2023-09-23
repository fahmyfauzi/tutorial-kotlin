fun printThreeLine()
{
    println("halo")
    println("world")
    println("whats up?")
}

fun printPow(base:Int,exponent:Int)
{
    var result = 1
    for (item in 1..exponent)
    {
        //3*3*3*3*3
        result*=base
    }
    println("$base to the power of $exponent is $result")
}

fun printSum(base:Int,exponent: Int)
{
    var result= 0
    for(item in base..exponent)
    {
        /*
        contoh input base: 1 dan exponent: 5
        maka 1+2+3+4+5 = 15
         */
      result += item
    }
    println(result)
}

fun printText(myText:String):String{

    return myText

}
fun multiply(numberA:Int, numberB:Int) = numberA*numberB

fun printFirstList(list:List<Int>) = println(list[0])

//search index list
fun searchListNumber(list:List<Int>,numberSearch:Int) :Int{
    for (i in 0 until list.size-1 ){
        if(list[i] == numberSearch)
        {
            return i
        }

    }
    return -1
}

fun getMax(vararg numbers:Int):Int{
    var max = numbers[0]
    for (number in numbers){
        if(number>max)
        {
            max=number
        }
    }
    return max
}

fun searcFor(search:String,searchEngine:String ="Google")
{
    println("Mencari kata $search dalam $searchEngine")
}

fun alternatingSum(vararg numbers:Int):Int{

//    var result =0
//    var number =0

    //3+4-5+2-1+2-3 = 4
//    for (i in numbers)
//    {
//        if(number == 0)
//        {
//            result += i
//            number=1
//        }else{
//            result -= i
//            number =0
//        }
//    }

//    var result =0
//    var numberTotal = numbers.size-1
//    for (i in 0..numberTotal)
//    {
//        if(i%2!=0)
//        {
//            result -= numbers[i]
//        }else{
//            result += numbers[i]
//        }
//    }

    //best practice
    var result = 0
    var toggle = true
for (number in numbers)
{
    if (toggle)
    {
        result+=number
    }else{
        result-=number
    }
    //switch toggle untuk perulangan selanjutnya
    toggle=!toggle
}
    return result

}

fun Int.isPrime():Boolean{
    for(i in 2 until this - 1)
    {
        if(this % i == 0)
        {
           return false
        }
    }
    return true
}

//extension

fun List<Int>.getProduct():Int{
    var result = 1
    for(item in this)
    {
        //1*2*3*4*5*6 =720
        result*=item
    }
    return result
}



