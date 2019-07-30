package com.example.atividade1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)

    }

    fun nextTres(view : View){

        val intent = Intent(this, Main3Activity::class.java)
        startActivity(intent)
    }
}
