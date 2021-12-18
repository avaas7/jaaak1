package com.example.architecturepatternmvp.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.architecturepatternmvp.AppPresenter;
import com.example.architecturepatternmvp.AppView;
import com.example.architecturepatternmvp.R;
import com.example.architecturepatternmvp.util.myModel;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    Button Button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button = findViewById(R.id.button1);
        textView =  findViewById(R.id.textView1);

        Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                textView.setText("Kritisha");

            }
        });




    }

}