package com.example.interviewhunt.activities;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.interviewhunt.R;

public class ThreadDemoActivity extends AppCompatActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(ThreadDemoActivity.this, "Running thread is daemon.....", Toast.LENGTH_SHORT).show();


        DaemonThread daemonThread1 = new DaemonThread("t1");
        DaemonThread daemonThread2 = new DaemonThread("t2");
        DaemonThread daemonThread3 = new DaemonThread("t3");

        daemonThread1.setDaemon(false); //Setting User thread  t1 to daemon
        daemonThread1.start();

        // Starting first 2 threads
        daemonThread2.start();

        //Setting user thread t3 to Daemon
        daemonThread3.setDaemon(true);
        daemonThread3.start();
    }
}

class DaemonThread extends Thread {

    public DaemonThread(String name) {
        super(name);
    }

    public void run() {

        if (Thread.currentThread().isDaemon()) {
            System.out.println(getName() + " is Daemon thread");
        } else {
            System.out.println(getName() + " is User thread");
        }
    }
}