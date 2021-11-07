package com.rofik.mppl_p6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

lateinit var itemDua : CardView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        itemDua = findViewById(R.id.itemDua)

        itemDua.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}