package com.example.greenstore19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

    }

    public void btn_signUp(View view) {
        Toast.makeText(signup.this, "Signup Sucessfull", Toast.LENGTH_SHORT).show();
    }
}
