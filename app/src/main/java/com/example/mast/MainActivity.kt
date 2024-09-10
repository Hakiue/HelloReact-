package com.example.mast

import android.graphics.Color
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val colorEditText: EditText = findViewById(R.id.colorEditText)

        colorEditText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                val userColor = s.toString().trim()

                try {

                    colorEditText.setTextColor(Color.parseColor(userColor))
                } catch (e: IllegalArgumentException) {

                    colorEditText.setTextColor(Color.BLACK)
                }
            }

            override fun afterTextChanged(s: Editable?) {

            }
        })
    }
}