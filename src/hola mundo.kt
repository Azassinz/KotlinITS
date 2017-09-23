fun main (args: Array<String> ){
    //mostrar mensaje
    println("Hola mundo")
    /**
     * 4. Variables, valores
     */
    //manera explicita
    var dato : Int
    var data : String = "Jose"
    //Implicito
    var dato2 = 5
    val dato3 =3 //valor
    //Long, double, Float, Boolean, String, Char, Int, Short
    /**
     * 5. if, else y when
     */
    var nombre = "Jose"
    if(nombre == "Jose"){
        println("Son iguales")
    }else{
        println("No son iguales")
    }
    var resultado =if(nombre == "Josefa"){
        "Son iguales"
    }else{
        "No son iguales"
    }
    println(resultado)

    //sentencia when
    var x=5
    when(x){
        1 -> println("X vale 1")
        2,3,4 -> println("X vale 2 o 3 o 4")
        in 6..10 -> println("X esta entre 6 y 10")
        else -> println("X no es valido")
    }
    /**
     * 6. Funciones del "String2 y Rangos
     */
    var ascendente = 1..5 //1,2,3,4,5
    println("Ascendete: ")
    for (x in ascendente){
        println("Valor: ${x}")
    }
    var descendente = 5 downTo 1 step 2//5,4,3,2,1
    println("Descendete: ")
    for (x in descendente){
        println("Valor: ${x}")
    }
    var rango= 10.downTo(1) step 2 //10,8,6,4,2
    println("Descendete con saltos: ")
    for (x in rango){
        println("Valor: ${x}")
    }
    println("Descendete con saltos invertido: ")
    for (x in rango.reversed()){
        println("Valor ${x}")
    }
    //funcinones del string
    //equals
    var name = "David"
    if (name.equals("david")){
        println("True")
    }else{
        println("False")
    }
    if (name.equals("david",true)){
        println("True")
    }else{
        println("False")
    }
    var cade : String = "Kotlin"
    println("El tamaño de la cadena es de ${cade.length}")

    cade = "Esto es kotlin"
    println("Cadena: ${cade.substring(0..13)}")
}