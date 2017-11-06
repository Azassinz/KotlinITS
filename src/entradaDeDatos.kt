/**
 * Created by david on 05/11/2017.
 */
fun main(args: Array<String>){
    //Les muestro una manera sencilla para la entrada de datos, la cual necesitaran para el ejercicio de repaso
    //leer Strings
    println("Dame tu nombre:")
    var nombre = readLine().toString()
    println(nombre)
    //leer Int
    println("Dame tu edad:")
    var entero = readLine()!!.toInt()
    println(entero)
    //leer Double
    println("Escribe 5.5")
    var doble = readLine()!!.toDouble()
    println(doble)

}