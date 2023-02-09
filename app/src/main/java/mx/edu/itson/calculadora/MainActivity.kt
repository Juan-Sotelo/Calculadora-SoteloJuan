package mx.edu.itson.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titulo: TextView= findViewById(R.id.titulo)
        val arriba: TextView= findViewById(R.id.barraArriba)
        val abajo: TextView= findViewById(R.id.barraAbajo)
        val btnCero: Button= findViewById(R.id.btnCero)
        val btnUno: Button= findViewById(R.id.btnUno)
        val btnDos: Button= findViewById(R.id.btnDos)
        val btnTres: Button= findViewById(R.id.btnTres)
        val btnCuatro: Button= findViewById(R.id.btnCuatro)
        val btnCinco: Button= findViewById(R.id.btnCinco)
        val btnSeis: Button= findViewById(R.id.btnSeis)
        val btnSiete: Button= findViewById(R.id.btnSiete)
        val btnOcho: Button= findViewById(R.id.btnOcho)
        val btnNueve: Button= findViewById(R.id.btnNueve)
        val btnResultado: Button= findViewById(R.id.btnResultado)
        val btnBorrar: Button= findViewById(R.id.btnBorrar)
        val btnSuma: Button= findViewById(R.id.btnSuma)
        val btnResta: Button= findViewById(R.id.btnResta)
        val btnMultiplicacion: Button= findViewById(R.id.btnMultiplicacion)
        val btnDivision: Button= findViewById(R.id.btnDivision)
        var resultado:Double=0.0
        var num1:Double=0.0

        btnCero.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"0")
        }

        btnUno.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"1")
        }

        btnDos.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"2")
        }

        btnTres.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"3")
        }

        btnCuatro.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"4")
        }

        btnCinco.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"5")
        }

        btnSeis.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"6")
        }

        btnSiete.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"7")
        }

        btnOcho.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"8")
        }

        btnNueve.setOnClickListener {
            var numero:String= abajo.getText().toString()
            abajo.setText(numero+"9")
        }

        btnResultado.setOnClickListener {
            if(!(arriba.text.toString().equals(""))){
                val tipoOperacion:Char= arriba.text.get(arriba.length()-1)

                if(!(abajo.text.toString().equals(""))){
                    if(tipoOperacion.equals('+')){
                        resultado= num1+ (abajo.text.toString().toInt()+0.0)
                    }else if(tipoOperacion.equals('-')){
                        resultado= num1- (abajo.text.toString().toInt()+0.0)
                    }else if(tipoOperacion.equals('*')){
                        resultado= num1* (abajo.text.toString().toInt()+0.0)
                    }else{
                        resultado= num1/ (abajo.text.toString().toInt()+0.0)
                    }

                    arriba.setText(resultado.toString())
                    abajo.setText("")
                    resultado=0.0
                    num1=0.0
                }
            }
        }

        btnBorrar.setOnClickListener {
            arriba.setText("")
            abajo.setText("")
            resultado=0.0
            num1=0.0
        }

        btnSuma.setOnClickListener {
            if(!(abajo.text.toString().equals(""))){
                num1= abajo.text.toString().toInt()+0.0
                arriba.setText(abajo.text.toString()+"+")
                abajo.setText("")
            }
        }

        btnResta.setOnClickListener {
            if(!(abajo.text.toString().equals(""))){
                num1= abajo.text.toString().toInt()+0.0
                arriba.setText(abajo.text.toString()+"-")
                abajo.setText("")
            }
        }

        btnMultiplicacion.setOnClickListener {
            if(!(abajo.text.toString().equals(""))){
                num1= abajo.text.toString().toInt()+0.0
                arriba.setText(abajo.text.toString()+"*")
                abajo.setText("")
            }
        }

        btnDivision.setOnClickListener {
            if(!(abajo.text.toString().equals(""))){
                num1= abajo.text.toString().toInt()+0.0
                arriba.setText(abajo.text.toString()+"/")
                abajo.setText("")
            }
        }

    }
}