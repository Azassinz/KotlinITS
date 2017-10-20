package Java;

import Kotlin.MetodosDeKotlin;

public class JavaClass {
    public static void main (String[]args){

        int suma = MetodosDeKotlin.suma(4,3);
        System.out.println("Imprimiendo Kotlin.suma desde Java" + suma);


    }

    public static int calculaArea(int base, int altura){
        return base*altura;
    }
}