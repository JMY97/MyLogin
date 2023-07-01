package com.example.mylogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button submit;
    EditText username, password;
    TextView error;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.editTextUsername);
        password = findViewById(R.id.editTextPassword);
        submit = findViewById(R.id.button);
        error = findViewById(R.id.textViewError);
        error.setVisibility(View.GONE);

        if(savedInstanceState != null){
            CharSequence savedText = savedInstanceState.getCharSequence("Username");
            username.setText(savedText);
            CharSequence savedPass = savedInstanceState.getCharSequence("Password");
            password.setText(savedPass);
        }

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    if(username.getText().toString().equals("batman") && password.getText().toString().equals("Joker")){
                        //Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                        String User = username.getText().toString().trim();
                        Bundle extras = new Bundle();
                        extras.putString("Username",User);
                        Intent redirect = new Intent(MainActivity.this,Welcome.class);
                        redirect.putExtras(extras);
                        startActivity(redirect);
                    }else if (username.getText().toString().equals("catwoman") && password.getText().toString().equals("Joker")){
                        //Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
                        String User = username.getText().toString().trim();
                        Bundle extras = new Bundle();
                        extras.putString("Username",User);
                        Intent redirect = new Intent(MainActivity.this,Welcome.class);
                        redirect.putExtras(extras);
                        startActivity(redirect);
                    }else{
                        Toast.makeText(getApplicationContext(), "Wrong Credentials. Try again",Toast.LENGTH_SHORT).show();
                    }

            }
            protected void onSaveInstanceState (Bundle outState){
                MainActivity.super.onSaveInstanceState(outState);
                outState.putCharSequence("Username",username.getText().toString());
                outState.putCharSequence("Password",password.getText().toString());
            }
            protected void onRestoreInstanceState (Bundle savedInstanceState){
                MainActivity.super.onRestoreInstanceState(savedInstanceState);
            }

        });
    }
}