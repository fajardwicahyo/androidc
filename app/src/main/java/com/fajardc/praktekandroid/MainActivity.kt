package com.fajardc.praktekandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        val textView1 = findViewById <TextView>(R.id.textView1)
//        val button1 = findViewById <Button>(R.id.button1)


        textView1.setOnClickListener {
            Toast.makeText(this, "hai",Toast.LENGTH_LONG).show()
        }

        button1.setOnClickListener {
            val intent = Intent (this@MainActivity,HitungActivity::class.java)
            startActivity(Intent)
        }
    }
}
