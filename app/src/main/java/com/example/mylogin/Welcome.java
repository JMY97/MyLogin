package com.example.mylogin;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Welcome extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        Bundle extras = getIntent().getExtras();

        if (extras != null){
            String User = extras.getString("Username");

            textView = findViewById(R.id.textView);
            textView.setText("Welcome "+ User);
        }
    }
}
