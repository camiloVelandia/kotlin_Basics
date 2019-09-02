data class  Tiempo( val years: Int, val days:Int)

operator fun Tiempo.plus(other:Tiempo): Tiempo{

    return Tiempo(this.years + other.years, this.days+other.days)
}

fun main(args: Array<String>) {

    val tiempo1 = Tiempo(2000,56)
    val tiempo2 = Tiempo(100, 2)

    val sumaTiempo = tiempo1 + tiempo2

    println(sumaTiempo)

}