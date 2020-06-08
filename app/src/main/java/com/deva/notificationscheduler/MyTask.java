package com.deva.notificationscheduler;

import android.os.AsyncTask;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.lang.ref.WeakReference;
import java.util.Random;

public class MyTask extends AsyncTask<Void, Integer, Void> {
    private int SLEEP_TIME;

    MyTask() {
    }


    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        SLEEP_TIME = 5000;
    }

    @Override
    protected Void doInBackground(Void... params) {
        try {
            int seconds = SLEEP_TIME/1000;
            for (int i = 1; i <= seconds; i++){
                Thread.sleep(1000);
                publishProgress(i);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);

    }

    protected void onPostExecute(Void result) {
    }
}
