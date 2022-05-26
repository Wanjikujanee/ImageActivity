package dev.jane.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class third : AppCompatActivity() {
    lateinit var btnGoback4: Button
    lateinit var btnGonext4: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btnGoback4=findViewById(R.id.btnGoback4)
        btnGonext4 = findViewById(R.id.btnGonext4)

        btnGoback4.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        btnGonext4.setOnClickListener {
            val intent= Intent(this,fourth::class.java)
            startActivity(intent)

        }
    }
    }
