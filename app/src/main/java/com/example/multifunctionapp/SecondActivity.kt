package com.example.multifunctionapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val spinnerOptions = findViewById<Spinner>(R.id.spinnerOptions)
        val buttonAction = findViewById<Button>(R.id.buttonAction)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)

        // Create the ArrayAdapter outside the 'also' block
        val adapter = ArrayAdapter.createFromResource(
            this,
            R.array.options_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            spinnerOptions.adapter = adapter
        }

        // Retrieve and set the spinner to the value from intent if available
        val selectedOption = intent.getStringExtra("selectedOption")
        if (selectedOption != null) {
            val spinnerPosition = adapter.getPosition(selectedOption)
            spinnerOptions.setSelection(spinnerPosition)
        }

        // Action button listener
        buttonAction.setOnClickListener {
            val selected = spinnerOptions.selectedItem.toString()
            textViewResult.text = "Selected Option: $selected"
        }
    }
}
