fun main(args: Array<String>) {


    val arrA:IntArray= intArrayOf(1,2,3,4,5,6,7,8,9)
    val listA = arrayListOf<String>("hola", "qwer", "kotlin")

    val num:Int = arrA[0] //obtengo la primer posicion de arrA
    arrA[2]  = 10//cambio el 3 de arrA por un 10

    val mutableList: MutableList<Int> = mutableListOf(2,3,4,5,6,7,8)
    mutableList.add(9)
    mutableList.add(2,56)
    mutableList[0] = 1

    
}