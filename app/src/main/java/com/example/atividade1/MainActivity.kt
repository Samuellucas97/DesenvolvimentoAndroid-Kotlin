package com.example.atividade1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun nextDois(view: View){
        val intent = Intent(this, Main2Activity::class.java)
        startActivity(intent)
    }

    fun nextTres(view : View ){
        val intent = Intent( this, Main3Activity::class.java)
        startActivity(intent)
    }

}
