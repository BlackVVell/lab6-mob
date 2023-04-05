package it_school.sumdu.edu.ua.battery;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView batteryImageView;
    private int batteryLevel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        batteryImageView = findViewById(R.id.battery_image_view);
        batteryLevel = 0;
    }

    public void decreaseBatteryLevel(View view) {
        if (batteryLevel > 0) {
            batteryLevel--;
            batteryImageView.setImageLevel(batteryLevel);
        }
    }

    public void increaseBatteryLevel(View view) {
        if (batteryLevel < 6) {
            batteryLevel++;
            batteryImageView.setImageLevel(batteryLevel);
        }
    }
}
