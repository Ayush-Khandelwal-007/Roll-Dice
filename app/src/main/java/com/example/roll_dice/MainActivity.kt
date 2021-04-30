package com.example.roll_dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }

        val countUpButton: Button = findViewById(R.id.count_up)
        countUpButton.setOnClickListener { countUp() }

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = getString(R.string.hello_text)

    }

    private fun rollDice() {
        val randomInt = (1..6).random()

        val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = randomInt.toString()

        Toast.makeText(this, "Dice Rolled",
            Toast.LENGTH_SHORT).show()
    }

    private fun countUp() {
        val resultText: TextView = findViewById(R.id.result_text)

        if(resultText.text.toString() ==getString(R.string.hello_text)){
//            resultText.text = "1"
            Toast.makeText(this, "Please start playing first to cheat.", Toast.LENGTH_SHORT).show()
        }

        else {
            var resultInt = resultText.text.toString().toInt()

            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
            else{
                Toast.makeText(this, "It's already maximum , please have little patience.", Toast.LENGTH_SHORT).show()
            }
        }

    }
}
