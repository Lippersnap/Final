package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    public int level = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void batteryUp(View view) {
        level++;
        setLevel();
    }

    public void batteryDown(View view) {
        level--;
        setLevel();
    }

    public void setLevel() {
        ImageView battery = findViewById(R.id.imageView);

        if (level < 0) level = 0;
        if (level == 0) battery.setImageResource(R.drawable.ic_battery_20_black_24dp);
        if (level == 1) battery.setImageResource(R.drawable.ic_battery_30_black_24dp);
        if (level == 2) battery.setImageResource(R.drawable.ic_battery_50_black_24dp);
        if (level == 3) battery.setImageResource(R.drawable.ic_battery_60_black_24dp);
        if (level == 4) battery.setImageResource(R.drawable.ic_battery_80_black_24dp);
        if (level == 5) battery.setImageResource(R.drawable.ic_battery_90_black_24dp);
        if (level == 6) battery.setImageResource(R.drawable.ic_battery_full_black_24dp);
        if (level > 6) {
            level = 6;
            setLevel();
        }
    }
}
