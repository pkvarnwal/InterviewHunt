package com.example.interviewhunt.worker;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

public class MyWorker extends Worker {

    public MyWorker(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
        displayNotification("My Worker", "Namskar Maine apna karya samapt kar liya");
        return null;
    }

    private void displayNotification(String title, String task) {

    }
}
