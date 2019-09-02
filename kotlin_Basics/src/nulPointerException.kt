fun main(args: Array<String>) {

    var a: String ="abc"


    var b: String? = "abc"
    b  = null

    val l1 = a.length
    val l2 = b?.length ?: 0 //operador elvis me asigna algo a la variable null

    println(l1)
    println(l2)

}