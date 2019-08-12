package com.example.samuellucas97.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        /// Recebendo o atributo que modificará o placehold X
        val frase =  intent.getStringExtra("frase")
        txtAlturaOuPeso.text = frase


        btnAlterar.setOnClickListener(this)
        buttonCancelar.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

        if( v?.id == R.id.btnAlterar){



        }

        if( v?.id == R.id.buttonCancelar){

//            var intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//         Eu acho que não precisa


            finish()
        }


    }
}
