class Segitiga(val a:Double,val b:Double) {

    init {
        println("Segitiga telah dibuat dengan a = $a dan b = $b")
    }

    fun area() = a*b
    fun perimeter() = 2*a + 2*b
    fun isSquare() = a == b



}