package dev.jane.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class second : AppCompatActivity() {
    lateinit var btnGoback3: Button
    lateinit var btnGonext3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        btnGoback3=findViewById(R.id.btnGoback3)
        btnGonext3 = findViewById(R.id.btnGonext3)

        btnGoback3.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)

        }
        btnGonext3.setOnClickListener {
            val intent= Intent(this,third::class.java)
            startActivity(intent)

        }
    }
}