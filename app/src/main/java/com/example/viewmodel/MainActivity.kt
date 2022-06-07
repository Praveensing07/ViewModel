package com.example.viewmodel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class MainActivity : AppCompatActivity() {

    lateinit var textview:TextView
    lateinit var viewmodel:Myviewmodel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewmodel=ViewModelProvider(this).get(Myviewmodel::class.java)
        textview=findViewById(R.id.value)
        settext()
       var button =findViewById<Button>(R.id.Increase)
        button.setOnClickListener {
            viewmodel.increment()
            settext()
        }
    }

    private fun settext() {
        textview.text=viewmodel.count.toString()
    }
}