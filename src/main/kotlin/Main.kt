fun main()
{
    //----------Kotlin Newbie To Pro----------//

    //1. hello world
//    println("Hello World!")

    //2. VAR, VAL, INTEGER, BOOLEAN
//    var myVariable :Int = 3
//    val myVariable = 8
//    val myVariable = true
//    var myVariable = true
//    println("My number is $myVariable")
//    myVariable = 5
//    myVariable = false
//    println("My number now is $myVariable")

//    3. ARITHMETIC OPERATORS
//    val x = 3
//    var y = 2
//    val result = x+y
//    println(result)
//    println("Hasil dari $x + $y adalah ${x+y}")
//    println("Hasil dari $x - $y adalah ${x-y}")
//    println("Hasil dari $x * $y adalah ${x*y}")
//    println("Hasil dari $x / $y adalah ${x/y}")
//    println("Hasil dari $x % $y adalah ${x%y}")
//
//    y -= 10
//    println(y + 1)


    // 4. DECIMAL NUMBERS
//    val x = 3F
//    var y = 2F
//    val x:Float = 3F
//    val y:Float = 2F
//    println(x/y)

//    val pi = 3.14
//    val radius = 5.5
//    val volume = 0.75 * pi * radius * radius *radius
//
//    println("volume 0.75 * $pi * $radius is $volume")


    //5 STRINGS
//    val text="Ini adalah Text Biasa"
//    println(text.uppercase())
//    println(text.lowercase())
//
//    val myName = "fahmy"
//    println(myName.reversed().uppercase())

//6. LOGICAL AND COMPARISON OPERATORS
//val x =10
//    val y =20
//    val a=15
//    val b=30
//
//    val kurang = x < y
//    val lebih = a > b
//    val sama = x == b
//    val tidakSama = y != b
//
//    println(kurang)
//    println(lebih)
//    println(sama)
//    println(tidakSama)
//
//    val and = y>x && a<b
//    val or = !(y==b) || b<a
//    println(and)
//    println(or)
//
//    val simpleExpression = 3>4 || 4>3   && 4<=4
//    println(simpleExpression)
//


//    val bool = true
//    val x =9
//    val y = 3
//    val z =9
//
//    val hardExpression = !(x!=z)    && bool || z > (x+y) && (!bool || y <z)
//
//    println(hardExpression)


    //7. IF CONDITIONS
//    val x =7
//    val y = 7
//    if(x > y)
//    {
//        println("$x lebih dari $y")
//    }else if(x<y){
//        println("$x kurang dari $y")
//    }else{
//        println("$x sama dengan $y")
//    }
//
//    val text = "kakak"
//    if(text.reversed() == text)
//    {
//        println("$text adalah palindrom")
//    }else{
//        println("$text bukan palindrom")
//    }

//    print("Masukan angka: ")
//    val userInput = readLine()
    // ? adalah null
//    val result = userInput?.toUpperCase()
//    println(result)

//    if(userInput != null) print( userInput.toInt() + 5) else println("Masukan angka")

//    println("Masukan umur kamu: ")
//    val userInput = readLine()
//
//    if(userInput != null)
//    {
//        var age = userInput.toInt()
//        if (age >= 1 && age <= 17){
//            println("Kamu belum dewasa")
//        }else if(age >18 && age <=45 ){
//            println("Kamu sudah dewasa")
//        }else{
//            println("Kamu sangat sudah dewasa")
//        }
//    }
//
//    println("Terimaksih")


//    8. ARRAYS
    val myArray = arrayOf(1,2,3,4,"hello","guys",true)
    println(myArray[4])
    for(a in myArray){
        println(a)
    }

}
