data class Auto(var marca: String, private var puertas:Int){
    var NumPuertas = puertas
    get(){
        return if (field> 0)field else 1
    }
}
data class Persona(var name: String, val age:Int , val eyescolor:String)


fun main(args: Array<String>) {
    val auto = Auto("ford", 1)

    var marca:String = auto.marca
    auto.marca = "chevrol"

    auto.NumPuertas=3
    auto.hashCode()
    auto.toString()
    println(auto.NumPuertas)


    val mabel = Persona("mabel",25,"azul")
    val marla:Persona = mabel.copy("marla")

    println(mabel)
    println(marla  )

    val carla:Persona = mabel
    carla.name  = "carla"
    println(carla)

}