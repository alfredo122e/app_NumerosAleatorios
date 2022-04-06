package com.example.numerosaleatorios

import android.app.AlertDialog
import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    var contador: Int = 0

    fun SortearNumero(view: View) {

        val aleatorio = Random().nextInt(10)
        val aleatorio2 = Random().nextInt(10)
        val aleatorio3 = Random().nextInt(10)
        var nr1 = findViewById<TextView>(R.id.txt1)
        var nr2 = findViewById<TextView>(R.id.txt2)
        var nr3 = findViewById<TextView>(R.id.txt3)
        var button = findViewById<Button>(R.id.btnGenerar)

        if (contador == 3) {
            Toast.makeText(this, "Lo siento, has agotado tus intentos.", Toast.LENGTH_SHORT).show()

            nr1.setText("")
            nr2.setText("")
            nr3.setText("")
            button.setEnabled(false)
            contador = 0
        } else {
            if (aleatorio == 7 && aleatorio2 == 7 && aleatorio3 == 7) {
                nr1.text = "$aleatorio"
                nr2.text = "$aleatorio2"
                nr3.text = "$aleatorio3"

                Toast.makeText(this, "¡Felicidades, has ganado!", Toast.LENGTH_SHORT).show()
                contador = 0

                nr1.setText("")
                nr2.setText("")
                nr3.setText("")
            } else {
                nr1.text = "$aleatorio"
                nr2.text = "$aleatorio2"
                nr3.text = "$aleatorio3"
                contador = contador + 1
            }
        }
    }
}
