fun main(args: Array<String>) {

    val a:Boolean = esMayor(6)
    defineTipo("wer")
}

fun esMayor(data: Int):Boolean{
    if (data>0){
        println("$data")
        return true

    }else{
        println("$data")
        return false
    }
}

fun defineTipo(data:Any){
    if (data is String){
        print(data.length)
    }else if (data is Int){
        print("${data * 2}")

    }
}