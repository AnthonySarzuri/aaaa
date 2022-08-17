fun main(){
    //Colecciones ---> Setr, list, Map
    //Colecciones 2 formas mutables y no mutables
    //Lo funcional recomienda que trates siempre de usar no mutables

    //LISTAS
    //Las no mutables
    val numeros= listOf(1,4,5,2,6,7,8,8,9,2,3,5,1,0,3)
    val nombres= listOf<String>()//Dinamicamente agregadas luego


    //Mutables
    val precios= mutableListOf(1,2,3,4,5,6,7)
    precios.add(1,10)
    println(precios)
    precios.remove(5)
    println(precios)

    numeros.distinct().joinToString()

    println(numeros.distinct().joinToString())
//Clean code
    val edades= listOf(14,15,29,23,19,17,16)
    val mayores=edades.filter { it>=18 }.joinToString ()
    println("Los mayores de edad son: $mayores")
    //average
    println("El pomedio de edades del curso es: ${edades.average().toString()}")

    //cuenten cuantos studiantes son mayres de edad
    println("los mayores de edad son : ${edades.count{ it >=18}}")

    val suma=edades.filter { it>=18 }
    println("La suma de la edades de los mayores de edad es: ${edades.filter { it>=18 }.sum()} ")
    //el menor
    println(edades.sorted().first())
    //el mayor
    println(edades.sorted().last())

    val productos= mapOf<String, Float>(
        Pair("galleta",5.899f),
        Pair("gaseosa",5.899f),
        Pair("papas",5.899f),
        Pair("lacteos",5.899f)
    )
    productos.forEach{
        val key=it.key
        val value=it.value
        println("$key:$value")
    }
}