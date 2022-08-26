package Herencia

class JefeCarrera(
    nombre: String,
    apellido: String,
    salario: Double,
    profesion: String
):jefe(nombre,apellido, salario, profesion) {
    var secure=salario+(salario*0.25)
    fun calcularInc():Int=(2000..6000).random()
    var fin=secure+calcularInc()

    override  fun mostrarInfo(){
        super.mostrarInfo()
        println("""
            Su seguro es $fin
            
        """.trimIndent())
    }
}