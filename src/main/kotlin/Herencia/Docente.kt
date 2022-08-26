package Herencia
//Si vas a heredar de una clase padre usas :  acompañado de la clase padre se la suele conocer como super clase
class Docente(
    nombre: String,
    apellido: String,
    salario: Int,
    profesion: String,
    area: String,
    asignatura: List<String>
):empleo(nombre,apellido, salario, profesion) {
    var areafinal=area
    var asignaturas=asignatura

    override  fun mostrarInfo(){
        super.mostrarInfo()
        println("""
            Pertenece al area $areafinal
            dicta ${asignaturas.joinToString()}
        """.trimIndent())
    }
}
