package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// recuperar os componentes
        // criar variavel e adicionar componente no <edttext>

        val edt_peso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edt_altura = findViewById<TextInputEditText>(R.id.edt_altura)
        val Btncalcular = findViewById<Button>(R.id.btn_calcular)


        // componente botão

        Btncalcular.setOnClickListener {

            val pesostr: String = edt_peso.text.toString()
            val alturastr: String = edt_altura.text.toString()

            if (pesostr == "" || alturastr == "") {

                // mostrar msg ao usuario

                Snackbar
                    .make(
                    edt_peso,
                    "Por favor, preencha todos os campos",
                    Snackbar.LENGTH_LONG

                ) . show()

            } else {

                val peso= pesostr.toFloat()
                val altura= alturastr.toFloat()

                // calcular imc

                val alturaQ2 = altura * altura
                val resultado = peso / alturaQ2

                println(" miguel ação do botão" + resultado)
            }


        }


    }
}