import kotlin.random.Random

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

    companion object{
        fun randomCircle():Lingkaran
        {
            val radius = Random.nextDouble(1.0 ,10.0)
            return Lingkaran(radius)
        }
    }
    init {
        println("$name dibuat dengan radius $radius")
        println("$name area ${area()}")
        println("$name perimeter ${perimeter()}")
    }

    override fun area(): Double {
        return radius*radius*ImportantNumber.PI
    }

    override fun perimeter() = 2*radius*ImportantNumber.PI
}