//class Segitiga(private val a:Double,private val b:Double) : Shape("Segitiga") {
//
//    init {
//        println("$name telah dibuat dengan a = $a dan b = $b")
//    }
//
//    fun area() = a*b
//    fun perimeter() = 2*a + 2*b
//    fun isSquare() = a == b
//
//
//
//}

//abstrak
class Segitiga(private val a:Double,private val b:Double) : Shape("Segitiga") {

    //secondary constructor
    constructor(a:Double):this(a,a)

    init {
        println("$name telah dibuat dengan a = $a dan b = $b")
    }

    override fun area(): Double {
        return a*b
    }

    override fun perimeter() =2*a + 2*b
    fun isSquare() = a == b



}