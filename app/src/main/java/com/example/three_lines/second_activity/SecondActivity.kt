package com.example.three_lines.second_activity

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.three_lines.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {

    companion object{
        private const val ARG_TEXT_KEY = "ARG_TEXT_KEY"

        fun createIntent(context : Context,text: String) = Intent(context,SecondActivity::class.java).apply {
            putExtra(ARG_TEXT_KEY,text)
        }
    }
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val text = intent.extras?.getString(ARG_TEXT_KEY)
        binding.textView.text = text
    }

}