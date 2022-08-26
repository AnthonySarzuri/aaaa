package Herencia

open class jefe(
    val nombre: String,
    val apellido: String,
    var salario: Double,
    val profesion: String,


    )   {
    var Seguro: Int=0
    fun calcularSeguro():Int=(100..200).random()
    open fun mostrarInfo(){
        println("""
            Nombre: $nombre $apellido
            Gana: $salario
            y es profesional de $profesion
        """.trimIndent())
    }
}