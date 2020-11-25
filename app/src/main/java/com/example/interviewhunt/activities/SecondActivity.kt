package com.example.interviewhunt.activities

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.interviewhunt.R
import com.example.interviewhunt.SecondAdapter

class SecondActivity : AppCompatActivity() {

     var result1: Int = 1
    lateinit var recycle : RecyclerView
    private lateinit var adapter: SecondAdapter
    val list: ArrayList<String> = ArrayList<String>()
    val numbers: IntArray = intArrayOf(10, 20, 30, 40)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        recycle = findViewById(R.id.recycle_view)


        checkingPrimeNumber()
        printingFibonacciSeries()

        setRecycleAdapter()
    }

    private fun setRecycleAdapter() {
        adapter = SecondAdapter(list)
        val layoutManager = LinearLayoutManager(applicationContext)
        recycle.layoutManager = layoutManager
        recycle.adapter = adapter

        prepareYug()
    }

    private fun prepareYug() {
        list.add("Satyug")
        list.add("Tretayug")
        list.add("Dwaparyug")
        list.add("Kalyug")
        list.add("Satyug")
        list.add("Tretayug")
        list.add("Dwaparyug")
        list.add("Kalyug")

        adapter.notifyDataSetChanged()
    }

    private fun checkingPrimeNumber() {
        val num = 29
        var flag = false

        if (num < 2) flag = false
        for (i in 2.toLong()..num/2) {
            if (num % i == 0.toLong()) {
                println("$num is not prime number")
            }
        }
        println("$num is prime number")
    }

    private fun printingFibonacciSeries() {
        var count1 = 0
        var count2 = 1

        for (i in 1..10) {
            println("$count1")

            result1 = count1 + count2
            count1 = count2
            count2 = result1
        }
    }


}