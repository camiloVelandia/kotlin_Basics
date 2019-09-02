data class Familiar(val name: String = "pancho", val age:Int = 25, val colorCAbello:String = "negro")
data class Result( val result:Int, val status:Boolean)

fun calcular(a:Int, b:Int):Result{
    if (a*2 > b){
        return Result(a*2, true)
    }else
        return Result(a,false)
}


fun main(args: Array<String>) {

    val (name: String,_,color) = Familiar()

    println(name)
    println(color)

    val(resultado, estatus)= calcular(4,7)

    println(resultado)
    println(estatus)


}