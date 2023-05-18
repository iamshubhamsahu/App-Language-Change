package com.example.applanguagechange

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.LocaleManagerCompat
import com.example.applanguagechange.utils.changeLanguage
import java.util.Locale

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_english: Button = findViewById(R.id.btn_eng)
        val btn_hindi: Button = findViewById(R.id.btn_hin)
        val btn_russian: Button = findViewById(R.id.btn_rus)

        btn_english.setOnClickListener(this)
        btn_hindi.setOnClickListener(this)

        btn_russian.setOnClickListener(this)

    }


    override fun onClick(p0: View?) {
        when (p0?.id) {
            R.id.btn_eng -> {
                changeLanguage(
                    this, "en"
                )
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
        }
    }
}