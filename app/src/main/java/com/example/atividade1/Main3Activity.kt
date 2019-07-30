package com.example.atividade1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
    }

    fun nextQuatro(view : View){
        val intent = Intent(this, Main4Activity::class.java )
        startActivity(intent)
    }

}
