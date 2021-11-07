package com.rofik.mppl_p6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

lateinit var BtnLogin : Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //inisialisasi
        BtnLogin = findViewById(R.id.BtnLogin)

        //Memberi aksi pada tombol
        BtnLogin.setOnClickListener {
            val intent = Intent(this,secondActivity::class.java)

            //jalankan
            startActivity(intent)
        }

    }
}