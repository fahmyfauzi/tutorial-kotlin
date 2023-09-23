class Lingkaran (val radius:Double){
    val pi= 3.141592
    init {
        println("Lingkaran dibuat dengan radius $radius")
        println("Lingkaran area ${area()}")
        println("Lingkaran perimeter ${perimeter()}")
    }

    fun area() = radius*radius*pi

    fun  perimeter() =2*radius*pi
}