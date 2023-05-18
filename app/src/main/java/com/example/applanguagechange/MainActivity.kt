package com.example.applanguagechange

import android.app.Activity
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.applanguagechange.utils.changeLanguage

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getLocal()
        setContentView(R.layout.activity_main)

        val btn_english: Button = findViewById(R.id.btn_eng)
        val btn_hindi: Button = findViewById(R.id.btn_hin)
        val btn_russian: Button = findViewById(R.id.btn_rus)
        val go: Button = findViewById(R.id.go)

        btn_english.setOnClickListener(this)
        btn_hindi.setOnClickListener(this)
        btn_russian.setOnClickListener(this)
        go.setOnClickListener(this)
    }

    private fun getLocal() {
        val sharedPreferences : SharedPreferences = getSharedPreferences("settings", Activity.MODE_PRIVATE)
        val laguage : String? = sharedPreferences.getString("My_Language","")
        changeLanguage(this,laguage)
     }


    override fun onClick(p0: View?) {

        when (p0?.id) {

            R.id.btn_eng -> {
                changeLanguage(this, "en")
                recreate()
            }

            R.id.btn_hin -> {
                changeLanguage(this, "hi")
                recreate()
            }

            R.id.btn_rus -> {
                changeLanguage(this, "ru")
                recreate()
            }

            R.id.go -> {
                startActivity(Intent(this,Details::class.java))
            }

        }
    }
}