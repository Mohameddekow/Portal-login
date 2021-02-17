   package com.example.demoui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.demoui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        handleActions()
//        setContentView(R.layout.activity_main)
    }
    private fun handleActions(){
        binding?.login?.setOnClickListener {
            val inputs = arrayOf(
                binding?.person, binding?.password
            )
            inputs.forEach { inputs ->
                if (inputs?.text.toString().isEmpty()) {
                    inputs?.error = "Required"
                }

            }
        }
    }
}