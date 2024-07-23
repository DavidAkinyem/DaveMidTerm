package com.example.multifunctionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        findViewById<Button>(R.id.btnLaunchCalculatorWithData).setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java).apply {
                putExtra("numberOne", 10)  // Example fixed data
                putExtra("numberTwo", 20)
            }
            startActivity(intent)
        }

        findViewById<Button>(R.id.btnLaunchSecondActivityWithData).setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java).apply {
                putExtra("selectedOption", "Option 2")  // Example fixed data
            }
            startActivity(intent)
        }
    }
}
