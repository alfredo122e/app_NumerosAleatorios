package com.example.numerosaleatorios

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

            fun SortearNumero(view: View){

                var contador:Int=0
                val aleatorio = Random().nextInt(10)
                val aleatorio2 = Random().nextInt(10)
                val aleatorio3 = Random().nextInt(10)
            var nr1 = findViewById<TextView>(R.id.txt1)
            var nr2 = findViewById<TextView>(R.id.txt2)
            var nr3= findViewById<TextView>(R.id.txt3)

            if (contador==3)
            {
                var message = AlertDialog.Builder(this)
                message.setTitle("Lo siento. Has agotado tus intentos.")
                message.setMessage("¿Deseas jugar nuevamente?")
                message.setPositiveButton("Si") { dialogInterface: DialogInterface, i: Int ->
                    contador = 0

                    nr1.setText("")
                    nr2.setText("")
                    nr3.setText("")
    }
                message.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
                    finish()
                }
                message.show()
            }
            else
            {
                if (nr1.equals("7")&&nr2.equals("7")&&nr3.equals("7"))
                {
                    nr1.text= "$aleatorio"
                    nr2.text= "$aleatorio2"
                    nr3.text= "$aleatorio3"


                    var message = AlertDialog.Builder(this)
                    message.setTitle("¡Felicidades, has ganado!")
                    message.setMessage("¿Quieres jugar nuevamente?")
                    message.setPositiveButton("SI") { dialogInterface: DialogInterface, i: Int ->
                        contador = 0

                        nr1.setText("")
                        nr2.setText("")
                        nr3.setText("")
                    }
                    message.setNegativeButton("No") { dialogInterface: DialogInterface, i: Int ->
                        finish()
                    }
                    message.show()
                }
                else
                {
                    nr1.text= "$aleatorio"
                    nr2.text= "$aleatorio2"
                    nr3.text= "$aleatorio3"
                    contador=contador+1
                }
            }
        }
    }
