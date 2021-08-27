package com.example.anew;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView counterTV;
    Button tapButton;
    Button resButton;
    Counter counter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        counterTV = findViewById(R.id.textView);
        tapButton = findViewById(R.id.button);
        resButton = findViewById(R.id.button2);
        counter = new Counter();
    }

    public void increaseValue(View view) {
        counter.increaseValue();
        counterTV.setText(counter.getValue().toString());

    }
    public void decreaseValue(View view) {
        counter.decreaseValue();
        counterTV.setText(counter.getValue().toString());
    }

}