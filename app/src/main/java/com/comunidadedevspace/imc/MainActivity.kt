package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edt_peso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edt_altura = findViewById<TextInputEditText>(R.id.edt_altura)
        val Btncalcular = findViewById<Button>(R.id.btn_calcular)




        Btncalcular.setOnClickListener {

            val pesostr: String = edt_peso.text.toString()
            val alturastr: String = edt_altura.text.toString()

            if (pesostr == "" || alturastr == "") {


                Snackbar
                    .make(
                        edt_peso,
                        "Por favor, preencha todos os campos",
                        Snackbar.LENGTH_LONG

                    ).show()

            } else {

                val peso = pesostr.toFloat()
                val altura = alturastr.toFloat()


                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2


                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESULT_IMC, resultado)
                startActivity(intent)


            }


        }


    }
}