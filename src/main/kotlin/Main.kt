import java.lang.NumberFormatException

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

//    val mySegitiga = Segitiga(5.0)
//    val lingkaran = Lingkaran(3.0)
//    val triangle =Triangle(7.0,7.0,7.0)
//
//    val maxSegitgaDanLingkaran = maxArea(mySegitiga,lingkaran)
//    val maxSegitigaLingkaranTriangle = maxArea(mySegitiga,lingkaran,triangle)
//
//    println("maksimum area dari segitiga dan lingkaran adalah $maxSegitgaDanLingkaran")
//    println("maksimum area dari segitiga, lingkaran dan triangle adalah $maxSegitigaLingkaranTriangle")

    //--------
//    val list = listOf(1,2,3,4,5)
//    val array = arrayOf(1,2,3,4,5)
//
//    println("Lisst: $list")
//    printAlternately(array)

//    println("list: $list")
//    printAlternately(list)


    //--------

//    Lingkaran.randomCircle()



//    20. OBJECTS AND COMPANION OBJECTS
//    Lingkaran(5.0)
//    Lingkaran.randomCircle()

//    segiempat
//    Segitiga.randomSegiEmpat()


//21. ANONYMOUS CLASSES     /

//    val a = 3.0
//    val b = 4.0
//    val height = 2.0
//
//    val parallelogram = object :Shape("Parallelogram",a,b,height){
//        init {
//            println("$name telah dibuat dengan a = $a b = $b dan height = $height")
//            println("$name area adalah ${area()}")
//            println("$name perimeter adalah ${perimeter()}")
//        }
//        override fun area(): Double {
//            return a*height
//        }
//
//        override fun perimeter(): Double {
//            return 2*a+2*b
//        }
//
//        fun isRectangle():Boolean = height == b
//    }
//    println("Parallelogram adalah ${parallelogram.isRectangle()}")
//

//    val base1 = 4.0
//    val base2 = 6.0
//    val side1= 3.0
//    val side2 =5.0
//    val height = 2.0
//
//    val trapesium = object :Shape("Trapesium",base1,base2,side1,side2,height){
//        init {
//            println("$name telah dibuat dengan base1 = $base1 base2 = $base2 side1= $side1 side2 = $side2 dan height = $height")
//            println("$name area adalah ${area()}")
//            println("$name perimeter adalah ${perimeter()}")
//        }
//        override fun area(): Double {
//            return 0.5*height*(base1*base2)
//        }
//
//        override fun perimeter(): Double {
//            return base1+base2+side1+side2
//        }
//        fun isTrapesium ()= side2 == side1
//
//    }
//    println("Trapesium adalah ${trapesium.isTrapesium()}")



    //22. EXCEPTIONS

//    println("Masukan sebuah angka: ")
//    val input = try {
//        readLine()?.toInt()
//    }catch (e:NumberFormatException){
//        0
//    }finally {
//        println("Ini dari block finally")
//    }
//    println("Angka kamu adalah: $input")

//    println(devide(10.0,0.0))
//    val cobaError = try {
//        devide(5.0,0.0)
//    }catch (e:DivisionByZeroException){
//        0.0
//    }
//
//    println("hasil dari division adalah $cobaError")


// val errorLingkaran = try {
//     lingkaranPositif(radius = -2.3)
// }catch (e:NegativeException){
//     0.0
// }

//    println(errorLingkaran)

//    23. LAMBDA FUNCTIONS
//    val circle1 = Lingkaran(5.0)
//    val circle2 = Lingkaran(3.5)
//    val triangle1 = Triangle(4.0,4.0,4.0)
//    val triangle2 = Triangle(3.0,3.0,3.0)
//    val rectagle1= Segitiga(6.0)
//    val rectagle2= Segitiga(4.0,3.0)
//
//    var shapes = listOf(circle1,circle2,triangle1,triangle2,rectagle1,rectagle2)
//    shapes = shapes.customFilter { shape, string -> shape.area() > 20.0  }.sortedBy{ it.area() }

//     shapes = shapes.customFilter { it.area() > 20.0 }.sortedBy{ it.area() }
//    shapes = shapes.filter { it.area() > 20.0 }.sortedBy{ it.area() }

//    for (shape in shapes){
//        println("${shape.name} : Area = ${shape.area()}")
//    }

//    var list = (1..10).toList()
//    val sum = list.custoSum{it%2==1}
//    println(list)
//    println("Hasilnya adalah $sum")


//    24. GENERIC
    var triple =Triple(3,"Testing",true)
    println(triple)
    var customTriple = CustomTriple(3,"Hello",true)
    customTriple.printTypes()

    //-------
        val circle1 = Lingkaran(5.0)
    val circle2 = Lingkaran(3.5)
    val triangle1 = Triangle(4.0,4.0,4.0)
    val triangle2 = Triangle(3.0,3.0,3.0)
    val rectagle1= Segitiga(6.0)
    val rectagle2= Segitiga(4.0,3.0)

    var shapes = listOf(circle1,circle2,triangle1,triangle2,rectagle1,rectagle2)

     shapes = shapes.customFilter { it.area() > 20.0 }.sortedBy{ it.area() }

    for (shape in shapes){
        println("${shape.name} : Area = ${shape.area()}")
    }


}

fun List<Int>.custoSum(filterFucntion: (Int) -> (Boolean)):Int{
    var sum = 0
    for (num in this)
    {
        if(filterFucntion(num)){
            sum+=num
        }
    }
    return sum

}

//fun List<Shape>.customFilter(filterFuction:(Shape) -> (Boolean)):List<Shape> {
//    val listResult = mutableListOf<Shape>()
//    for (shape in this){
//        if(filterFuction(shape)){
//            listResult.add(shape)
//        }
//    }
//    return listResult
//}

//fun List<Shape>.customFilter(filterFuction:(Shape,String) -> (Boolean)):List<Shape> {
//    val listResult = mutableListOf<Shape>()
//    for (shape in this){
//        if(filterFuction(shape,"Hello")){
//            listResult.add(shape)
//        }
//    }
//    return listResult
//}

//generic
fun <T> List<T>.customFilter(filterFuction:(T) -> (Boolean)):List<T> {
    val listResult = mutableListOf<T>()
    for (item in this){
        if(filterFuction(item)){
            listResult.add(item)
        }
    }
    return listResult
}

class DivisionByZeroException : Exception("Kamu tidak bisa membagi angka dengan 0 (nol). mohon masukan angka yang benar")

fun lingkaranPositif(radius:Double): Lingkaran
{
    if(radius < 0) {
        throw NegativeException()
    }
    return Lingkaran(radius)
}
class NegativeException:Exception("Radius tidak boleh negatif")


fun devide(a:Double,b:Double):Double{
    if(b==0.0)
    {
        throw DivisionByZeroException()
    }
    return a/b
}


fun maxArea(shape1:Shape,shape2:Shape):Double{
    val areaShape1 =shape1.area()
    val areaShape2 = shape2.area()
    return  if(areaShape1 > areaShape2) areaShape1 else areaShape2
}

fun maxArea(shape1:Shape, shape2:Shape,shape3:Shape):Double{
    val maxAreaShape1Shape2 = maxArea(shape1,shape2)
    val areaShape3 = shape3.area()
    return if(maxAreaShape1Shape2 > areaShape3) maxAreaShape1Shape2 else areaShape3
}

fun printAlternately(list:List<Int>)
{
    var i = 0
    var j = list.size -1
    var toggle = true
    while (i <= j)
    {
        if(toggle)
        {
            println(list[i])
            i++
        }else{
            println(list[j])
            j--
        }
        toggle = !toggle
    }
}

fun printAlternately(arr:Array<Int>)
{
    var i = 0
    var j = arr.size-1 //5
    var toggle =true
    while(i <= j)
    {
        if(toggle)
        {
            println(arr[i])
//            println("i++")

            i++
        }else{
            println(j)
//            println("j--")

            j--
        }
        toggle = !toggle
    }
}





