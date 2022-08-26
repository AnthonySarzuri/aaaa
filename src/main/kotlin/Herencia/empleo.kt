package Herencia
//Cuando se trabaja con la hereencia hay distintos caminos
//En kotlin opr default no se deja heredar

//La herencia sucede en una situacion donde tosoalos elementos se encuentren en una misma naturaleza

//Para usar Herencia debes habilitar tanto la clase como los elementos o atributos que vayas a usar
//Cuando usas la palabra reservada open
open class empleo(
    val nombre: String,
    val apellido: String,
    var salario: Int,
    val profesion: String,


)   {
    var Seguro: Int=0
    fun calcularSeguro():Int=(100..200).random()
    open fun mostrarInfo(){
        println("""
            Empleado: $nombre $apellido
            Gana: $salario
            y es profesional de $profesion
        """.trimIndent())
    }
}

