package dev.jane.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fourth : AppCompatActivity() {
    lateinit var btnGoback5: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        btnGoback5=findViewById(R.id.btnGoback5)

        btnGoback5.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)


        }

    }
}