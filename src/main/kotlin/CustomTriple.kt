class CustomTriple<A:Any,B:Any,C:Any>(
    var first:A,
    var seccond:B,
    var third:C
) {
    fun printTypes(){
        println("the type of first is ${first::class}")
        println("the type of seccond is ${seccond::class}")
        println("the type of third is ${third::class}")
    }
}