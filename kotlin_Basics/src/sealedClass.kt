sealed class  Intencion{
    class Refrescar : Intencion()
    class RecargarMar:Intencion()
}

fun main(args: Array<String>) {

    val intencion : Intencion = Intencion.Refrescar()

    val output = when(intencion){
        is Intencion.Refrescar->"refrescar"
        is Intencion.RecargarMar->"carghar mas data"
    }

    println(output)
}