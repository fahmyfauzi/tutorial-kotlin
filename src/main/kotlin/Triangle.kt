import kotlin.math.sqrt

class Triangle (val a:Double, val b:Double, val c:Double):Shape("Triangle"){

    init {
        println("$name telah dibuat dengan a = $a b = $b c = $c")
        println("$name area adalah ${area()}")
        println("$name perimeter adalah ${perimeter()}")
//        println(changeName("testing")) //contoh protected

    }

    override fun perimeter()=a+b+c
    override fun area() = sqrt((perimeter()/2)*(perimeter()/2-a)*(perimeter()/2-b)*(perimeter()-c))

//     fun perimeter() = a + b + c

   //A = sqrt((p/2) * ((p/2) - a) * ((p/2) - b) * ((p/2) - c))
//     fun area() = sqrt((perimeter()/2)*(perimeter()/2-a)*(perimeter()/2-b)*(perimeter()-c))

}