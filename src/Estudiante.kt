/**
 * Created by david on 03/09/2017.
 */
class Estudiante {
    var nombre: String = ""
    var noControl: Int = 0
    constructor()
    fun imprimir(){
        println("Name: ${nombre}")
        println("No Control: ${noControl}")
    }
    fun asignar(n: String, nC : Int){
        nombre = n
        noControl = nC
    }

    constructor(nombre2:String, noControl2:Int): this(){
        this.nombre = nombre2
        this.noControl = noControl2
    }
}