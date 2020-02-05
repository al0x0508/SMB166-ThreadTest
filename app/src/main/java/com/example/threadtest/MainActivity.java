package com.example.threadtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button asynctaskButton = (Button) findViewById(R.id.asyncbutton);

        asynctaskButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new TestAsyncTask().execute();
            }
        });
    }

    private class TestAsyncTask extends AsyncTask<Void, Void, Void> {
        @Override
        protected void onPreExecute() {
            super.onPreExecute();
        }

        @Override
        protected void onPostExecute(Void s) {
            super.onPostExecute(s);
        }

        @Override
        protected void onProgressUpdate(Void... values) {
            super.onProgressUpdate(values);
        }

        @Override
        protected Void doInBackground(Void... strings) {
            Log.d("****", "doInBackGround: START");
            try {
                Thread.sleep(10_000);
            } catch (InterruptedException e){
                    e.printStackTrace();
            };
            Log.d("****", "doInBackGround: END");
            return null;
        }
    }
    private void runAsyncTask() {

    }
}
