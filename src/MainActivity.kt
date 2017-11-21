package com.example.android.calculadora

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.accessibility.AccessibilityManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var numero1: EditText? = null
    var numero2:EditText? = null
    var resultado: TextView? = null
    var suma: Button?= null
    var resta: Button?= null
    var division: Button?= null
    var multiplicacion: Button?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        numero1 = findViewById(R.id.numero1)
        numero2 = findViewById(R.id.numero2)

        resultado = findViewById(R.id.Resultado)

        suma = findViewById(R.id.botonSuma)
        resta = findViewById(R.id.botonResta)
        multiplicacion = findViewById(R.id.botonMultiplicacion)
        division = findViewById(R.id.botonDivision)

        suma!!.setOnClickListener{
            if(numero1?.text?.length != 0 && numero2?.text?.length != 0){
                var n1: Double = (numero1 as EditText).text.toString().toDouble()
                var n2: Double = (numero2 as EditText).text.toString().toDouble()
                var res : Double = n1 + n2
                (resultado as TextView).text = res.toString()
            }else{
                Toast.makeText(this,"Por favorescribe un numero",Toast.LENGTH_SHORT).show()
            }
        }

        resta!!.setOnClickListener{
            if(numero1?.text?.length != 0 && numero2?.text?.length != 0){
                var n1: Double = (numero1 as EditText).text.toString().toDouble()
                var n2: Double = (numero2 as EditText).text.toString().toDouble()
                var res : Double = n1 - n2
                (resultado as TextView).text = res.toString()
            }else{
                Toast.makeText(this,"Por favorescribe un numero",Toast.LENGTH_SHORT).show()
            }
        }

        multiplicacion!!.setOnClickListener{
            if(numero1?.text?.length != 0 && numero2?.text?.length != 0){
                var n1: Double = (numero1 as EditText).text.toString().toDouble()
                var n2: Double = (numero2 as EditText).text.toString().toDouble()
                var res : Double = n1 * n2
                (resultado as TextView).text = res.toString()
            }else{
                Toast.makeText(this,"Por favorescribe un numero",Toast.LENGTH_SHORT).show()
            }
        }

        division!!.setOnClickListener{
            if(numero1?.text?.length != 0 && numero2?.text?.length != 0){
                var n1: Double = (numero1 as EditText).text.toString().toDouble()
                var n2: Double = (numero2 as EditText).text.toString().toDouble()
                var res : Double = n1 / n2
                (resultado as TextView).text = res.toString()
            }else{
                Toast.makeText(this,"Por favorescribe un numero",Toast.LENGTH_SHORT).show()
            }
        }

    }
}
