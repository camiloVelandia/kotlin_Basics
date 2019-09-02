fun esNumero(dato: Any?) = dato is Int || dato is Int?

fun main(args: Array<String>) {

    println("ingresa dato: ")

    val num: Any? = try{
        readLine()?.toInt()
    } catch (e: NumberFormatException){
        "error no Int"
    }

    print("variable: ")
    println(num)
    print("funcion: ")
    print(esNumero(num))
}