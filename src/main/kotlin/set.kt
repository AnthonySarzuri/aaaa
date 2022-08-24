fun main() {
    val numeros= listOf(4,3,2,1,5,7)
    val impares=numeros.filter {
        numero-> numero%2!=0 //Definicion exacta de lo que es una funcion flecha
    }
    //pero en resumen es...
    val impar=numeros.filter { it % 2!=0 }

    println(impares)
    println(impar)

    val resultado=numeros.map{valor->(2*valor)-1}

    println(resultado)

    //reduce barre tu lista de izq a der





    numeros.reversed().reduce{total,valor->total*valor}

}

