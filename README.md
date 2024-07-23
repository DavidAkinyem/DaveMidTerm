# MultifunctionApp
MultifunctionalApp
activity_main
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="16dp"
    tools:context=".MainActivity">

    <Button
        android:id="@+id/btnOpenCalculator"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Open Calculator"
        android:layout_marginBottom="10dp"/>

    <Button
        android:id="@+id/btnOpenSecondActivity"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Open Second Activity"
        android:layout_marginBottom="10dp"/>

    <Button
        android:id="@+id/btnOpenThirdActivity"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:text="Open Third Activity"
        android:layout_marginBottom="10dp"/>
</LinearLayout>


MainActivity
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


