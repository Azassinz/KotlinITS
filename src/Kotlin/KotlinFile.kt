@file:JvmName("MetodosDeKotlin")

package Kotlin

import Java.JavaClass

fun main (ars: Array<String>){

    var area = JavaClass.calculaArea(2,2)
    println("Imprimiendo Kotlin.area desde Kotlin: ${area}")

    area(altura = 2.0, base = 1)
}

fun suma(a:Int, b:Int):Int{
    return a+b
}
/**
 * public class KotlinFileKt{
 *
 *  public static void Kotlin.Kotlin.main(String[]args){
 *
 *  }
 *  public static int Kotlin.Kotlin.suma(int a, int b){
 *  return a+b;
 *  }
 *
 */

fun area(base:Int, altura: Double):Int{
    return (base*altura).toInt()
}