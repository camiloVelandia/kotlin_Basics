object validaciones{
    fun passwodValida(psw:String):Boolean {
        return psw.isNotEmpty() && psw.length>10
    }

    fun esNumero(dato:Any)= dato is Int
}

class Claseuniversal{
    companion object{
        fun create():Claseuniversal = Claseuniversal()
    }
}

fun main(args: Array<String>) {
    println("ingresa contraseña")

    val passw: String = readLine()!!
    println(validaciones.passwodValida(passw))

    println("ingresa algo")

   try {
       val numero:Any= readLine()?.toInt()?: ""
       println(numero)
       println(validaciones.esNumero(numero))
   }
    catch (e: NumberFormatException){
        println(e)
    }

    val claseuniversalEnmain:Claseuniversal =Claseuniversal.create()
}

fun data (){
    val claseuniversaldata:Claseuniversal = Claseuniversal.create()
}