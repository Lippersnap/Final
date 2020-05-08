package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.LevelListDrawable;
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
        if (level == 0) battery.setImageLevel(0);
        if (level == 1) battery.setImageLevel(1);
        if (level == 2) battery.setImageLevel(2);
        if (level == 3) battery.setImageLevel(3);
        if (level == 4) battery.setImageLevel(4);
        if (level == 5) battery.setImageLevel(5);
        if (level == 6) battery.setImageLevel(6);
        if (level > 6) {
            level = 6;
            setLevel();
        }
    }
}
