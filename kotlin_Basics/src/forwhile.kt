fun main(args: Array<String>) {

    val listaNumeros = intArrayOf(1,2,3,4,5,6 )

    for (i in listaNumeros.indices){
        print(listaNumeros[i])
    }

    val frutas:List<String> = listOf("manzana", "pera", "piña","platano")

    for (i:String in frutas){
        println(i)
    }

    var x = 10
    while (x>0){
        x--
        println(x)
    }

    var sum:Int=0
    var input: String?= ""
    do{
        print("ingresa un num")
        input = readLine()
        sum += input?.toInt() ?: 0
    } while (input != "0")
    println("la suma es $sum")
}