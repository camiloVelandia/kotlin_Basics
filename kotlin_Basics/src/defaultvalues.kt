fun saluda(saludo : String = "hola a todos"){
    println(saludo)

}

fun otra (edad: Int=0, esAdulto: Boolean=true, esMujer:Boolean=false){

}

fun main(args: Array<String>) {

    saluda("holaa")
    saluda()

    otra(esAdulto = true,esMujer = true,edad = 32)


}