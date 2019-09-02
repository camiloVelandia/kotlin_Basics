fun main(args: Array<String>){

    val srt ="un string normal"

    val nombre ="mabel"
    val edad =25

    val sentencia = "ella es $nombre y tiene $edad"
    println(sentencia)

    val cumple = "$nombre cumple ${edad+1}"
    println(cumple)

    val text ="""
        |este es un super string que quiero imprimir que es demasioao largo 
          |y tiene varios renglones
              |como este
    """.trimMargin()//trimMargin indenta el texto con el prefijo |
    println(text)
}


