package com.example.interviewhunt

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity :AppCompatActivity() {

    private var mDelayHandler : Handler? = null
    private val runnable : () -> Unit = {}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val runnable  = Runnable {
            if (!isFinishing) {
                val intent = Intent(applicationContext, MainActivity::class.java)
                startActivity(intent)
                finish()
            }
        }


        mDelayHandler = Handler()
        mDelayHandler!!.postDelayed(runnable, 3000)

    }

    override fun onDestroy() {
        if (mDelayHandler != null) {
            mDelayHandler!!.removeCallbacks(runnable)
        }
        super.onDestroy()
    }

}

