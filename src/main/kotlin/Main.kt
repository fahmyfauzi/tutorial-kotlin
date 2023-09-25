fun main()  {
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
//    val myArray = arrayOf(1,2,3,4,"hello","guys",true)
//    println(myArray[4])
//    for(a in myArray){
//        println(a)
//    }

    //     10. while loop

//     var x = 3
//     while (x <= 5)
//     {
//         println("test")
//         x++
//     }

//     val myArray = arrayOf("Test",1,2,true,"hello","world")
//     val myArrayLength = myArray.size
//     var i = 0
//     while(i < myArrayLength){
//         println(myArray[i])
//         i++
//     }

//     println("Masukan sebuah number: ")
//     var inputUser = readLine()?.toInt()
//     var i = 0
//
//     if (inputUser != null)
//     {
//         while (inputUser >= i)
//         {
//             println(inputUser)
//             inputUser--
//         }
//     }

//     println("Masukan number 1:")
//     var number1 =  readLine()?.toInt()
//     println("Masukan number 2:")
//     var number2 =  readLine()?.toInt()
//
//     var i = 1
//     var result = 1
//
//     if( number1 != null && number2 !=null)
//     {
//         while (i <= number2)
//         {
//           // number 1 = 2 , number 2= 5, hasilnya 2*2*2*2*2 =32
//             result*=number1*1
//             /*
//             contoh inputan number1=3 dan number2=3
//             iterasi 1 : 1 * 3 * 1 = 3
//             iterasi 2 : 3 * 3 * 1 = 9
//             iterasi 3 : 9 * 3 * 1 = 27
//              */
//             println("result now $result")
//             println("index now $i")
//             println("number now $number1")
//             i++
//         }
//
//         print(result)
//     }



    //10. FOR LOOP
    // var myArray = arrayOf(1, 2, 3, 4, 5)
//    for(i in myArray)
//    {
//        println(i)
//    }
//
//    for (i in 1..10){
//        println(i)
//    }
//    for (item in 'a'..'g')
//    {
//        println(item)
//    }

//    for (item in 10 downTo 5 step 2)
//    {
//        println(item)
//    }

//    var myArray = arrayOf(4, 2, 5, 7,19, 8, 10, 3)
//    var max = myArray[0]
//
//    for (item in myArray)
//    {
//        if (item > max) {
//            max = item
//        }
//    }
//    println(max)

//    var myArray = arrayOf(1,2,4,5,6)
//    var result = 0
//
//    for(i in myArray)
//    {
//        result += i
//    }
//    println(result)


//    println("Masukan 5 number: ")
//    var avg = 0.0
//    for (item in 1..5) {
//        var inputUser = readLine()?.toInt()
//        if (inputUser != null)
//        {
//            avg+=inputUser/5.0
//        }
//    }
//    println("Nilai rata-ratanya adalah $avg")


    //11. LIST
//    var myArray = arrayOf(1,2,3,4)
//    var myList = listOf(1,2,3,4)
//    var myList = mutableListOf(1,2,3,4)
//
//    myList.add(2)
//    myList.removeAt(1)
//    myList.remove(3)
//
//    myArray
//    println(myList)
//    println(myArray)

//    var myList = mutableListOf<Int>()
//    for (item in 1..5)
//    {
//        var inputUser = readLine()?.toInt()
//        if(inputUser != null)
//        {
//            myList.add(inputUser)
//        }
//    }
//    println(myList)

//    var myListPR = mutableListOf<Int>()
//    println("Masukan 5 anka")
//    for (item in 1..5) {
//        var inputUser = readLine()?.toInt()
//        if (inputUser != null) {
//            myListPR.add(inputUser)
//        }
//    }
//
//
//    for (i in myListPR.size -1 downTo 0)
//    {
//        println(myListPR[i])
//    }


//    fibonanci
//    println("masukan angka n > 1")
//    var n = readLine()?.toInt()
//    var myList = mutableListOf<Int>(0,1)
//    if (n!=null){
//        for (item  in 2..n-1){
//            //(indeks array ke 2 dikurangi 2) + (indeks array ke 2 dikurangi 1)
//            myList.add(myList[item-2] + myList[item-1])
//        }
//        println(myList)
//    }

    //12. WHEN
//    println("masukan umur kamu: ")
//    val age = readln()?.toInt()
//    val x = 8
//    when(age)
//    {
//       in 1..6 -> println("Kamu masih anak kecil")
//        in 6..17 -> println("Kamu sudah remaja muda")
//        18-> {
//            println("selamat kamu sudah menginjak remaja")
//            println("akhirnya 18 tahun")
//        }
//        19,20 -> if (19 > x || x > 20 ){
//            println("kamu sudah remaja")
//            println("memang tak seindah yang ku kira")
//        }
//
//        in 21..65 -> println("Kamu sudah dewasa")
//        else->println("kamu sudah sangat dewasa")
//    }
//
//    println("kamu dari mana?")
//    val from = readLine()
//    when(from)
//    {
//        "indonesia" -> println("hai")
//        "francis"-> println("bonjur")
//        "portugis"-> println("olá")
//        "arab" -> println("marhaban")
//        "spain"->println("Hola")
//        "inggris"-> println("Hallo")
//        else -> println("saya tidak tau bahasa itu")
//    }


//    13. FUNCTIONS AND PARAMETERS
//    printThreeLine()

//    printPow(3,5)
//    printPow(4,9)
//
//    printSum(2,5)
//
//    val teks = printText("Testing")
//    println(teks)

//    var resultMultiply = multiply(3,4)
//    println(resultMultiply)

//    val list = listOf(1,2,3,4)
//    println(printFirstList(list))

//    val userInput = readLine()?.toInt()
//    if (userInput != null)
//    {
//        println(searchListNumber(list,userInput))
//    }


    //14. VARARG, DEFAULT AND NAMED PARAMETERS

//    val arrayNumber = intArrayOf(1,232,5,341,32,1)
//    val numbers = getMax(1,23,4,5,*arrayNumber,68,85,42)
//    println(numbers)

//    searcFor("how to be come a good programmer","bing")
//    searcFor("how to good backend")
//    searcFor(searchEngine = "yahoo", search = "how to proffession backend developer")

//    print(alternatingSum(3,4,5,2,1,2,3))

    //15. EXTENSION FUNCTIONS
//    println("Masukan sebuah angka: ")
//    val input = readLine()?.toInt()
//
//    if(input!= null)
//    {
//        if(input.isPrime())
//        {
//            println("$input is a prime number")
//        }else{
//            println("$input is not a prime number")
//        }
//    }

//    val list = listOf(1,2,3,4,5,6)
//   val sum = list.getProduct()
//    println(sum)



//    16. CLASSES

//    val x=10
//    val y=5
//    println(x.plus(y))

//    val mySegitiga= Segitiga(4.0,7.0)
//    println("Segitiga Area adalah ${mySegitiga.area()}")
//    println("Segitiga Perimeter adalah ${mySegitiga.perimeter()}")
//    println("Segitiga sama kaki adalah ${mySegitiga.isSquare()}")
//
//    Lingkaran(5.0)
//    println()
//    Lingkaran(7.0)


//    Triangle(2.0,4.0,6.0)

//    17. INHERITANCE

//    val myCircle = Lingkaran(2.0)
//    myCircle.pi //contoh private
//    Triangle(2.0,4.0,6.0)
//    val ukuranSegitiga = Segitiga(2.0,4.0)
//    println(ukuranSegitiga.area())
//    println(ukuranSegitiga.perimeter())
//    println(ukuranSegitiga.isSquare())
//
//    ukuranSegitiga.changeName("Testing")
//    println(ukuranSegitiga.name)

//    18. ABSTRACT CLASSES

// 19. CONSTRUCTOR AND FUNCTION OVERLOADING

    val mySegitiga = Segitiga(5.0)



}





