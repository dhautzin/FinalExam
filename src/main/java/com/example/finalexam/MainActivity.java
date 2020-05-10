package com.example.finalexam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView battery;
    int charge = 6;
    String plusMessage = "The battery is at full charge";
    String minusMessage = "The battery cannot go lower";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        battery = findViewById(R.id.battery);
    }

    public void increaseCharge(View view)
    {
        if(charge == 6)
        {
            Toast.makeText(getApplicationContext(), plusMessage, Toast.LENGTH_SHORT);
        }
        else
        {
            charge = charge + 1;
            battery.setImageLevel(charge);
        }
    }

    public void decreaseCharge(View view)
    {
        if(charge == 0)
        {
            Toast.makeText(getApplicationContext(), minusMessage, Toast.LENGTH_SHORT);
        }
        else
        {
            charge = charge - 1;
            battery.setImageLevel(charge);
        }
    }
}
