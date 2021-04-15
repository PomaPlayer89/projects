package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        try {
            Thread.sleep(6000);
        } catch (InterruptedException x) {
            x.printStackTrace();
        }
        Intent inte = new Intent(this, MainActivity.class);
        startActivity(inte);
        finish();
    }
}