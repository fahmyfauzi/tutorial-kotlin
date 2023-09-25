//open class Shape(private var name:String){
//open class Shape( var name:String){
//    init {
//        println("Saya adalah superclass")
//    }
//
////    private fun changeName(newName:String){
////        name = newName
////    }
//
//    fun changeName(newName:String){
//        name = newName
//    }
//}


//abstrak
abstract class Shape( var name:String){
    init {
        println("Saya adalah superclass")
    }

    abstract  fun area():Double
    abstract fun perimeter():Double

    fun changeName(newName:String){
        name = newName
    }
}