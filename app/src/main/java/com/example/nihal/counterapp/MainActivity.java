package com.example.nihal.counterapp;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvCount;
    int counter=0;
    Button plus,minus,reset;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        tvCount=findViewById(R.id.tvCount);

    }

    /*public void change(View view) {
//        Log.d(TAG, "text change ");
        *//*Log.e(TAG, "change: text" );*//*

        tv = findViewById(R.id.tv);
        tv.setText("world");

        
    }*/
    public void increment(View view){

        counter++;
        plus = findViewById(R.id.plus);
        tvCount.setText(String.valueOf(counter));

    }
    public void decrement(View view){

        counter--;
        minus =findViewById(R.id.minus);
        tvCount.setText(String.valueOf(counter));

    }
    public void reset(View view){

        counter=0;
        reset = findViewById(R.id.reset);
        tvCount.setText(String.valueOf(counter));

    }

}
