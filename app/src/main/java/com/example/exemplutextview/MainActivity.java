package com.example.exemplutextview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int contor=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView simpleTextView = (TextView) findViewById(R.id.TextView);
        Button changeText = (Button) findViewById(R.id.btnChangeText);
        changeText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (contor%2==0) {simpleTextView.setText("După schimbare");}
                else{simpleTextView.setText("Tekwill în fiecare școală!");}
                contor++;
            }
        });
    }



}