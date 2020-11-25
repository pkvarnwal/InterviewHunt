package com.example.interviewhunt.activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.interviewhunt.R
import com.example.interviewhunt.model.SampleViewModel

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var  textResult : TextView
    lateinit var buttonIn : Button
    lateinit var buttonDe : Button
    lateinit var viewModel: SampleViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonIn = findViewById(R.id.button_increase)
        buttonDe = findViewById(R.id.button_decrease)

        textResult = findViewById(R.id.text_result)

        buttonIn.setOnClickListener(this)
        buttonDe.setOnClickListener(this)

        viewModel = ViewModelProvider(this).get(SampleViewModel::class.java)

        viewModel.getValue().observe(this, Observer {
            display(it)
        })
    }

    override fun onClick(v: View) {

        when(v.id) {
            R.id.button_increase -> {
//                i = i + 1
//                display(i)
                viewModel.add()
               // display(viewModel.i)
                startActivity(Intent(this, SecondActivity::class.java))
            }
            R.id.button_decrease -> {
//                i = i - 1
//                display(i)
                viewModel.reduce()
                //display(viewModel.i)
            }
        }
    }

    fun display(i: Int) {
        textResult.setText(i.toString())
        Log.e("Count: ", i.toString())
    }
}