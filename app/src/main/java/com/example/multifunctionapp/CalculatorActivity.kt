package com.example.multifunctionapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CalculatorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)

        val numberOneField = findViewById<EditText>(R.id.editTextNumberOne)
        val numberTwoField = findViewById<EditText>(R.id.editTextNumberTwo)
        val resultDisplay = findViewById<TextView>(R.id.textViewResult)
        val addButton = findViewById<Button>(R.id.buttonAdd)
        val subtractButton = findViewById<Button>(R.id.buttonSubtract)
        val multiplyButton = findViewById<Button>(R.id.buttonMultiply)
        val divideButton = findViewById<Button>(R.id.buttonDivide)

        // Retrieve data from intent
        val num1 = intent.getIntExtra("numberOne", 0)
        val num2 = intent.getIntExtra("numberTwo", 0)

        // Set the retrieved values to the EditText fields
        numberOneField.setText(num1.toString())
        numberTwoField.setText(num2.toString())

        // Operation listeners
        addButton.setOnClickListener { performOperation(numberOneField, numberTwoField, resultDisplay, '+') }
        subtractButton.setOnClickListener { performOperation(numberOneField, numberTwoField, resultDisplay, '-') }
        multiplyButton.setOnClickListener { performOperation(numberOneField, numberTwoField, resultDisplay, '*') }
        divideButton.setOnClickListener { performOperation(numberOneField, numberTwoField, resultDisplay, '/') }
    }

    private fun performOperation(num1Field: EditText, num2Field: EditText, display: TextView, operation: Char) {
        val num1 = num1Field.text.toString().toDoubleOrNull() ?: 0.0
        val num2 = num2Field.text.toString().toDoubleOrNull() ?: 0.0
        val result = when (operation) {
            '+' -> num1 + num2
            '-' -> num1 - num2
            '*' -> num1 * num2
            '/' -> if (num2 != 0.0) num1 / num2 else "Division by zero error"
            else -> "Invalid operation"
        }
        display.text = result.toString()
    }
}
