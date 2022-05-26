package dev.jane.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class first : AppCompatActivity() {
    lateinit var btnGoback1: Button
    lateinit var btnGonext1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)
        btnGoback1 = findViewById(R.id.btnGoback1)
        btnGonext1 = findViewById(R.id.btnGonext1)

        btnGoback1.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        btnGonext1.setOnClickListener {
            val intent= Intent(this,second::class.java)
            startActivity(intent)

        }
    }
}

