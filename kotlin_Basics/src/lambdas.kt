fun main(args: Array<String>) {

    val num: Int? =null

    val resultado: Int = sum(4,5)
    print(resultado)

    val resultmincuatro: Boolean = minCuatro("hola   ")
    println(resultmincuatro)
}

val sum :(Int,Int) -> Int={x,y -> x+y }//lambda

val minCuatro: (String)-> Boolean={it.length > 4} //lambda