fun main (args: Array<String> ) {
    //mostrar mensaje
    println("Hola mundo")
    /**
     * 4. Variables, valores
     */
    //manera explicita
    var dato: Int
    var data: String = "Jose"
    //Implicito
    var dato2 = 5
    val dato3 = 3 //valor
    //Long, double, Float, Boolean, String, Char, Int, Short
    /**
     * 5. if, else y when
     */
    var nombre = "Jose"
    if (nombre == "Jose") {
        println("Son iguales")
    } else {
        println("No son iguales")
    }
    var resultado = if (nombre == "Josefa") {
        "Son iguales"
    } else {
        "No son iguales"
    }
    println(resultado)

    //sentencia when
    var x = 5
    when (x) {
        1 -> println("X vale 1")
        2, 3, 4 -> println("X vale 2 o 3 o 4")
        in 6..10 -> println("X esta entre 6 y 10")
        else -> println("X no es valido")
    }
    /**
     * 6. Funciones del "String2 y Rangos
     */
    var ascendente = 1..5 //1,2,3,4,5
    println("Ascendete: ")
    for (x in ascendente) {
        println("Valor: ${x}")
    }
    var descendente = 5 downTo 1 step 2//5,4,3,2,1
    println("Descendete: ")
    for (x in descendente) {
        println("Valor: ${x}")
    }
    var rango = 10.downTo(1) step 2 //10,8,6,4,2
    println("Descendete con saltos: ")
    for (x in rango) {
        println("Valor: ${x}")
    }
    println("Descendete con saltos invertido: ")
    for (x in rango.reversed()) {
        println("Valor ${x}")
    }
    //funcinones del string
    //equals
    var name = "David"
    if (name.equals("david")) {
        println("True")
    } else {
        println("False")
    }
    if (name.equals("david", true)) {
        println("True")
    } else {
        println("False")
    }
    var cade: String = "Kotlin"
    println("El tamaño de la cadena es de ${cade.length}")

    cade = "Esto es kotlin"
    println("Cadena: ${cade.substring(0..13)}")
    /**
     * 7. Ciclos en kotlin (For, while y do-while)
     */
    //Ciclos
    for (i in 1..10) {
        println(i)
    }
    for (i in 1..10 step 2) {
        println(i)
    }
    for (i in 10 downTo 1) {
        println(i)
    }
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
    var nombres = listOf("Luis", "David", "Lopez", "Valdes")
    for (mostrar in nombres) {
        println(mostrar)
    }
    var n = 1
    while (n < 10) {
        println(n)
        n++
    }
    n = 1
    do {
        println(n)
        n++
    } while (n <= 10)
    /**
     * 8.	Clases, Objetos,manejo de Nulos y Funciones con expresiones
     */
    //Objeto de la clase Estudiante
    var e1 = Estudiante()
    println("Name: ${e1.nombre}")
    println("No Control: ${e1.noControl}")
    e1.asignar("David", 1)
    e1.imprimir()
    e1.asignar(nC = 2, n = "Luis")
    e1.imprimir()

    data class Customer(val name: String, val email: String)

    var customer = Customer("David", "correo@dominio.com")
    println(customer.email)
    //manejo de nulos o null-safety
    var nulo: String? = null //cuando un valor puede ser nulo se tiene que marcar explicitamente con el operador "?"
    fun obtenerTamañoString(objeto: Any): Int? {
        if (objeto is String) { // el operador "is" checa si la expresión es instancia del tipo, es decir, si es un String
            // objeto se "castea" automaticamente a String
            return objeto.length
        }
        // objeto sigue siendo de tipo "Any" fuera de la comprobación del "if"
        return null
    }
    println("El tamaño es de ${obtenerTamañoString("cinco")}")
    //funciones con expresiones
    var c = 3
    var d = 5
    fun suma(c: Int, d: Int): Int {
        return c + d
    }
    println("Suma uno: ${suma(c, d)}")

    fun suma2(c: Int, d: Int): Int = c + d
    println("Suma dos: ${suma2(c, d)}")

    fun printSuma(c: Int, d: Int): Unit {
        println("La Kotlin.suma de $c y $d es ${c + d}")
    }
    printSuma(c, d)

    fun printSumaDos(c: Int, d: Int) {
        println("La Kotlin.suma de $c y $d es ${c + d}")
    }
    printSumaDos(c, d)
    /**
     * 9. Funciones Infix y Extension
     */

}