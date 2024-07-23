package com.example.multifunctionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnOpenCalculator).setOnClickListener {
            startActivity(Intent(this, CalculatorActivity::class.java))
        }

        findViewById<Button>(R.id.btnOpenSecondActivity).setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java))
        }

        findViewById<Button>(R.id.btnOpenThirdActivity).setOnClickListener {
            startActivity(Intent(this, ThirdActivity::class.java))
        }
    }
}
