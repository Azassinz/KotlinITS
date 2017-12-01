package com.example.android.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.AbsSavedState
import android.view.View
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.math.*
import javax.xml.transform.dom.DOMLocator

class MainActivity : AppCompatActivity() {
    var pant: TextView? = null
    var operan1: Double = 0.toDouble()
    var operan2: Double = 0.toDouble()
    var res: Double = 0.toDouble()
    var ope: Int = 0
    var anterior : String = ""
    var guardar : Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        pant=findViewById<ListView>(R.id.resultado) as TextView
    }

    fun bt1(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "1"
        pant?.setText(cap)
        anterior += "1"
    }
    fun bt2(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "2"
        pant?.setText(cap)
        anterior += "2"
    }
    fun bt3(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "3"
        pant?.setText(cap)
        anterior += "3"
    }
    fun bt4(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "4"
        pant?.setText(cap)
        anterior += "4"
    }
    fun bt5(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "5"
        pant?.setText(cap)
        anterior += "5"
    }
    fun bt6(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "6"
        pant?.setText(cap)
        anterior += "6"
    }
    fun bt7(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "7"
        pant?.setText(cap)
        anterior += "7"
    }
    fun bt8(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "8"
        pant?.setText(cap)
        anterior += "8"
    }
    fun bt9(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "9"
        pant?.setText(cap)
        anterior += "9"
    }
    fun bt0(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "0"
        pant?.setText(cap)
        anterior += "0"
    }
    fun btP(v: View) {
        var cap = pant?.getText().toString()
        cap = cap + "."
        pant?.setText(cap)
        anterior += "."
    }
     fun suma(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
         anterior += "+"
        pant?.setText("")
        ope=1
    }
    fun resta(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
        anterior += "-"
        pant?.setText("")
        ope=2
    }
    fun multiplicacion(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
        anterior += "x"
        pant?.setText("")
        ope=3
    }
    fun division(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
        anterior += "/"
        pant?.setText("")
        ope=4
    }
    fun raiz(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
        anterior += "√"
        pant?.setText(" v(" + operan1+")")
        ope=5
    }
    fun factorial(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
        anterior += "!"
        pant?.setText("")
        ope=6
    }
    fun seno(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
        anterior += "sin"
        pant?.setText("Sin(" + operan1+")")
        ope=7
    }
    fun coseno(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
        anterior += "cos"
        pant?.setText("Cos(" + operan1+")")
        ope=8
    }
    fun tangente(v: View){
        try {
            var aux1: String = pant?.text.toString()
            operan1 = java.lang.Double.valueOf(aux1)
        }catch (nfe : NumberFormatException){ }
        anterior += "tan"
        pant?.setText("Tan(" + operan1+")")
        ope=9
    }
    fun igual(v:View){
        try {
            var aux2: String = pant?.text.toString()
            operan2 = java.lang.Double.valueOf(aux2)
        }catch (nfe : NumberFormatException){ }
        pant?.setText("")
        when(ope){
            1-> res = operan1 + operan2
            2-> res = operan1 - operan2
            3-> res = operan1 * operan2
            4-> {
                if (operan2==0.0){
                    pant?.setText("No se puede dividir entre 0")
                }else {
                    res = operan1 / operan2
                }
            }
            5-> res = java.lang.Math.sqrt(operan1)
            6-> {
                res = 1.0
                for (i in operan1.toInt() downTo 1) {
                    res = res * i
                }
            }
            7-> {
                var rad : Double = java.lang.Math.toRadians(operan1)
                res = java.lang.Math.sin(rad)
            }
            8-> {
                var rad : Double = java.lang.Math.toRadians(operan1)
                res = java.lang.Math.cos(rad)
            }
            9-> {
                var rad : Double = java.lang.Math.toRadians(operan1)
                res = java.lang.Math.tan(rad)
            }
        }
        pant?.setText(anterior + "\n" +res)
        operan1=res
        guardar = res
    }

    fun clear(v:View){
        pant?.setText("")
        operan1 = 0.0
        operan2 = 0.0
        res = 0.0
        anterior = ""
    }

    fun borrar(v:View){
        if (!pant?.text.toString().equals("")){
            pant?.setText(pant?.text?.subSequence(0,pant!!.text.lastIndex))
        }
    }
}
