package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

// recuperar os componentes
        // criar variavel e adicionar componente no <edttext>

        val edt_Peso = findViewById<TextInputEditText>(R.id.edt_peso)
        val edt_Altura = findViewById<TextInputEditText>(R.id.edt_altura)
        val Btncalcular = findViewById<Button>(R.id.btn_calcular)


        // componente botão

        Btncalcular.setOnClickListener {
            val peso = edt_Peso.text
            val altura = edt_Altura.text
            println(" miguel ação do botão" + peso)
            println(" miguel ação do botão" + altura)
        }


    }
}