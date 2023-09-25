//class Lingkaran (val radius:Double) : Shape("Lingkaran"){
//    private val pi= 3.141592
//    init {
//        println("$name dibuat dengan radius $radius")
//        println("$name area ${area()}")
//        println("$name perimeter ${perimeter()}")
//    }
//
//    fun area() = radius*radius*pi
//
//    fun  perimeter() =2*radius*pi
//}

//abstrak
class Lingkaran (val radius:Double) : Shape("Lingkaran"){
    private val pi= 3.141592
    init {
        println("$name dibuat dengan radius $radius")
        println("$name area ${area()}")
        println("$name perimeter ${perimeter()}")
    }

    override fun area(): Double {
        return radius*radius*pi
    }

    override fun perimeter() = 2*radius*pi
}