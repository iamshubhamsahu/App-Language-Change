package com.example.applanguagechange

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_english: Button = findViewById(R.id.btn_eng)
        val btn_hindi: Button = findViewById(R.id.btn_hin)
        val btn_russian: Button = findViewById(R.id.btn_rus)

        btn_english.setOnClickListener {
            LocaleHelper.setLocale(this, "en")
            recreate()
        }

        btn_hindi.setOnClickListener {
            LocaleHelper.setLocale(this, "hi")
            recreate()
        }

        btn_russian.setOnClickListener {
            LocaleHelper.setLocale(this, "ru")
            recreate()
        }

    }
}