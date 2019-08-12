package com.example.samuellucas97.myapplication

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

        var frase = ""

        if(v?.id == R.id.buttonAlterarAltura){

            frase = "Altura:"
            var intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("frase", frase)

            startActivity(intent)

        }
        if(v?.id == R.id.buttonAlterarPeso){
            frase = "Peso:"
            var intent = Intent(this, Main2Activity::class.java)

            intent.putExtra("frase", frase)

            startActivity(intent)
        }
        if(v?.id == R.id.buttonCalcular){

            try {
                var peso = txtPeso.text.toString().toDouble()
                var altura = (txtAltura.text.toString().toDouble())/100

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
