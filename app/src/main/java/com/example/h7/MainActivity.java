package com.example.h7;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this.testFunction();
        text = (TextView) findViewById(R.id.textView);
    }




    public void testFunction (View v) {
        System.out.println("Hello World!");
        text.setText("Morjesta pöytään maailma!");

    }
}