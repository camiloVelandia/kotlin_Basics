fun suma(num:Int,num2: Int, func:() -> Unit){

    println("la suma de  $num y $num2 = ${num+num2}")

    func()

}

fun main(args: Array<String>) {

    suma(5,4) {
        println("funcion de orden mayor")
    }
}