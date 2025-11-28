package fi.lut.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ImageView lightsImg = findViewById(R.id.lights);
        ImageView overallImg = findViewById(R.id.overall);
        ImageView porvooImg = findViewById(R.id.porvoo);
        ImageView reindeerImg = findViewById(R.id.reindeer);

        lightsImg.setImageResource(R.drawable.lights);
        overallImg.setImageResource(R.drawable.overall);
        porvooImg.setImageResource(R.drawable.porvoo);
        reindeerImg.setImageResource(R.drawable.reindeer);
        
        Button btnStart = findViewById(R.id.startBtn);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
        });

    }

}