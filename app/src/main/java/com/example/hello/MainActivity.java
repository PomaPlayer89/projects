package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Click Click = new Click();
        Button RedButton = findViewById(R.id.BRed);
        Button YellowButton = findViewById(R.id.BYellow);
        Button GreenButton = findViewById(R.id.BGreen);

        RedButton.setOnClickListener(Click);
        YellowButton.setOnClickListener(Click);
        GreenButton.setOnClickListener(Click);
    }

    private class Click implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            if (v.getId() == R.id.BRed) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.Line);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.red));
                Button myButton_1 = (Button) v;
                myButton_1.setTextColor(Color.YELLOW);
                Log.d("Click", "Clicked RED button");
                Toast.makeText(getApplicationContext(), "You pressed the RED button", Toast.LENGTH_LONG).show();
            } else if (v.getId() == R.id.BYellow) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.Line);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.yellow));
                Button myButton_2 = (Button) v;
                myButton_2.setTextColor(Color.GREEN);
                Log.d("Click", "Clicked YELLOW button");
                Toast.makeText(getApplicationContext(), "You pressed the YELLOW button", Toast.LENGTH_LONG).show();
            } else if (v.getId() == R.id.BGreen) {
                LinearLayout linearLayout = (LinearLayout) findViewById(R.id.Line);
                linearLayout.setBackgroundColor(getResources().getColor(R.color.green));
                Button myButton_3 = (Button) v;
                myButton_3.setTextColor(Color.RED);
                Log.d("Click", "Clicked GREEN button");
                Toast.makeText(getApplicationContext(), "You pressed the GREEN button", Toast.LENGTH_LONG).show();
            }
        }
    }
}
