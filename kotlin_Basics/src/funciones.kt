fun hello():Unit{
    println("hola a todos")
}

fun suma (a:Int, b:Int){

    println("la suma de $a y $b es igual a: ${a+b}")

}

/*fun max(a:Int, b:Int): Int{
    return if(a>b)
        a
    else
        b

}*/

fun max(a:Int, b:Int) = if(a>b)a else b

fun main(args: Array<String>) {

    println(max(45,9))
    println(suma(5,5))

}