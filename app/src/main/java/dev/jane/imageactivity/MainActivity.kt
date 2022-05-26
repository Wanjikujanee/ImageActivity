package dev.jane.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnGoback:Button
    lateinit var btnGonext:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnGonext = findViewById(R.id.btnGonext)



        btnGonext.setOnClickListener {
            val intent= Intent(this,first::class.java)
            startActivity(intent)

        }
}
       }