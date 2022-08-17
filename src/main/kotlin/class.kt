fun main() {
    //lamda trata de resumir una funcion aun formato facil
    //
    val suma ={x: Int, y: Int -> x+y}//es una funcion variable de tipo funcion
    //dos formas de imprimir
    //Imvoke
    println(suma.invoke(5,6))
    //imprecion  mas resumida
    println(suma(4,6))
    //se pude definir una variable indicando la esgtructura de la funcion que quieres usar
    //firma de la funcion=lo hace uniqco a la funcion
    //en la forma de funcion lamda(tipo de datos de los parametros)-> int
    //firma de funcion lamda
    //it= es la variabale entera
    //it solo funciona con un parametro
    val agregarSieteVeces:(Int)->Int={
        it*7//variable =5 ---5*7
    }
    println(OperacionesAritmeticas(2,4,::sumer))
    println(OperacionesAritmeticas(2,4,::restar))
    //OTRO EJEMPLO DE FUNCIONES DE ORDEN SUPERIOR
}
//AL definir com parametro la funcion podrias usar el formato de la firma de la funcion
fun OperacionesAritmeticas(num1:Int,numero2:Int, fn:(Int, Int)->Int):Int{
    return fn(num1, numero2)
}

fun sumer(x:Int,y:Int)=x+y
fun restar(x:Int,y:Int)=x-y