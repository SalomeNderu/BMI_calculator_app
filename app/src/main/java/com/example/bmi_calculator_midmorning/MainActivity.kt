package com.example.bmi_calculator_midmorning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var display_text:TextView
    private lateinit var edit_weight:EditText
    private lateinit var edit_height:EditText
    private lateinit var compute_bmi_button:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        display_text = findViewById(R.id.text_display)
        edit_weight = findViewById(R.id.edit_weight)
        edit_height = findViewById(R.id.edit_height)
        compute_bmi_button = findViewById(R.id.compute_button)

        compute_bmi_button.setOnClickListener {

            var first_num = edit_weight.text.toString().trim()
            var second_num = edit_height.text.toString().trim()

            if (first_num.isEmpty() || second_num.isEmpty()) {
                Toast.makeText(this, "Please enter a valid number", Toast.LENGTH_SHORT).show()
            } else {
                var result = first_num.toDouble() / (second_num.toDouble() * second_num.toDouble())
                display_text.text = result.toString()

            }

        }

    }
}
