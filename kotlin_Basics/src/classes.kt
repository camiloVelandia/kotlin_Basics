class ejemplo{
    fun hola(){
        println("hola mundo")
    }

}
class persona(val nombre: String){
    init {
        println("nombre $nombre")

    }

    constructor(name: String, edad:Int):this(name){

        println("nombre $nombre , edad $edad")
    }
}

open class base(val inicial:Int){
   open fun imprimeAlgo(){
        println("algo $inicial")
    }
}

class general (val d:Int): base(d){

    override fun imprimeAlgo() {
        super.imprimeAlgo()
        val suma:Int =4+d
    }
}

fun main(args: Array<String>) {
    val persona = persona("camilo", 18)
    println(persona.nombre)

    val general = general(9)
    general.imprimeAlgo()


}