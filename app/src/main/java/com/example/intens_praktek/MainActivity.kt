package com.example.intens_praktek

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val id:Int=5
    val language:String="PRABOWO"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //button untuk mengirim data ke activitykedua.kt
        btn_klik.setOnClickListener(){
            intent=Intent(this,ActivityKedua::class.java)
            intent.putExtra("id_value",id)
            intent.putExtra("language_value",language)
            startActivity(intent)
        }
    }
}
