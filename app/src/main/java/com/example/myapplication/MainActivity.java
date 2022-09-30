package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void m1(View view) {
        Toast.makeText(this,"click3",Toast.LENGTH_SHORT).show();
        Toast.makeText(this,"click2",Toast.LENGTH_SHORT).show();
    }
}
