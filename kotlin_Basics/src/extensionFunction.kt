fun main(args: Array<String>) {

    "hola mi nombre es camilo".print()
    println(4.multiply(5))
    println(5 multiply  9)

    val listaNombres : MutableList<String> = mutableListOf("camilo","pancho","jay","night")
    listaNombres.swap( 3,2)
    println(listaNombres.toString())
}

fun <t> MutableList<t>.swap(index1: Int, index2: Int){
    val tmp: t = this[index1]
    this[index1] = this[index2]
    this[index2]= tmp
}

infix fun Int.multiply(numM: Int):Int{
    return this * numM
}

fun String.print(){
    println(this)
}