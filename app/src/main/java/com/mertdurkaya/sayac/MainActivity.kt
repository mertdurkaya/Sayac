package com.mertdurkaya.sayac

import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import android.view.View.OnFocusChangeListener
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var girilenSayi : Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun baslat(view: View) {
        girilenSayi = editText.text.toString().toLong()
        println(girilenSayi)
        object : CountDownTimer(girilenSayi * 1000, 1000) {
            override fun onTick(p0: Long) {
                button.setEnabled(false)
                textView.text = "Kalan : ${p0 / 1000}"
            }
            override fun onFinish() {
                button.setEnabled(true)
                textView.text = "Kalan : -"
            }
        }.start()
    }
}
