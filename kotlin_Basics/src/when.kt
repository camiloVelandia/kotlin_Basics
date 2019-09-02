fun type(dato:Any){
    when(dato){
        is String ->{
            println(dato.length)}
        is Int -> print("${dato*2}")
        is Boolean -> {println("es un booleano")
        print(dato)}
        else -> print(" no se que es")

    }
}

fun rango(numero:Int){
    when(numero){
        in 1..10 -> print("esta entre 1 y 10")
        in 11..20-> print("esta entre 11 y 20")
        else-> print("no me sirve")
    }
}

fun main(args: Array<String>) {

    type(89.3)
    rango(120)

}