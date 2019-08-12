package com.example.calculadoraimc

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonAlterarAltura.setOnClickListener(this)
        buttonAlterarPeso.setOnClickListener(this)
        buttonCalcular.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        if(v?.id == R.id.buttonAlterarAltura){

            var altura = "altura"
            var intent = Intent(this, SegundaActivity::class.java)

            intent.putExtra("altura", altura)

            startActivity(intent)

        }
        if(v?.id == R.id.buttonAlterarPeso){
            var peso = "peso"
            var intent = Intent(this, SegundaActivity::class.java)

            intent.putExtra("peso", peso)

            startActivity(intent)
        }
        if(v?.id == R.id.buttonCalcular){

            try {
                var peso = txtPeso.toString().toDouble()
                var altura = txtAltura.toString().toDouble()

                var imc = peso / (altura*altura)

                when{
                    imc < 16 ->{
                       txtResultado.text = "Magreza grave"
                    }
                     imc >= 16 && imc < 17 ->{
                        txtResultado.text = "Magreza moderada"
                    }
                    imc >= 17 && imc < 18.5 ->{
                        txtResultado.text = "Magreza leve"
                    }
                    imc >= 18.5 && imc < 25 ->{
                        txtResultado.text = "Saudável"
                    }
                    imc >= 25 && imc < 30 ->{
                        txtResultado.text = "Sobrepeso"
                    }
                    imc >= 30 && imc < 35 ->{
                        txtResultado.text = "Obesidade grau I"
                    }
                    imc >= 35 && imc < 40 ->{
                        txtResultado.text = "Obesidade grau II (severa)"
                    }
                    imc > 40 ->{
                        txtResultado.text = "Obesidade grau III (móbida)"
                    }
                }
            }catch (th: Throwable ){
                Toast.makeText(this, "Problema no cálculo", Toast.LENGTH_LONG).show()
            }

        }


    }


}
