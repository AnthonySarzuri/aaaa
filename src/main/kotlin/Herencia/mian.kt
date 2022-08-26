package Herencia

fun main() {
    val docente=Docente(
        "Grover",
        "Soria",
        6000,
        "Ingenieria en sistemas",
        "Sistemas",
        listOf("GameDevelopment", "AR","DiseñoGtrafico")
    )
    docente.mostrarInfo()

    val jefecar=JefeCarrera(
        "Fulanito",
        "De Tal",
        4500.50,
        "Ingenieria en sistemas",
    )
    jefecar.mostrarInfo()
}