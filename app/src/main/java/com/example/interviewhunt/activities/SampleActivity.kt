package com.example.interviewhunt.activities

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.interviewhunt.User

class SampleActivity : AppCompatActivity() {

    var str : String? = null

    lateinit var yug: String

    val Sanatan : String by lazy { "" }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        str = "null"

        show(str)

        var name = "Shri Ram"
        println("I am learning from $name")

        initialized()
    }

    private fun initialized() {
     print("Initialization:" + this::yug.isInitialized)
        yug = "Kalyug"
        print("Initialization:" + this::yug.isInitialized)
    }

    fun show(name: String?) {
        Log.e("Show", name?.length.toString() ?: "0")


        var user1 = User("Pri", 30)
        var user2 = User("Pri", 30)



        if(user1.equals(user2)) println("Same")
        else println("Not sasme")
    }

}