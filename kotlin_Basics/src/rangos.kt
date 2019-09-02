fun main(args: Array<String>) {
    for (i: Int in 1..5){
        print(i)
    }

    for (i in 4 downTo 1){
        print(i)
    }

    for (i in 1..6 step 2){
        print(i)
    }
    for (i in 8 downTo 1 step  2){
        print("$i ,")
    }
    for (i in 1 until 10){
        print(i)
    }
     val esOnce: Boolean = (1..12 step  2).last == 11
    print(esOnce)


}