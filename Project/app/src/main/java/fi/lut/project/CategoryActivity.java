package fi.lut.project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        Button btnLanguage = findViewById(R.id.btnLanguage);

        btnLanguage.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, FinnishActivity.class);
            startActivity(intent);
        });

        Button btnActivities = findViewById(R.id.btnActivities);
        btnActivities.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, TravelActivity.class);
            startActivity(intent);
        });

        Button btnFood = findViewById(R.id.btnFood);
        btnFood.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, FoodActivity.class);
            startActivity(intent);
        });
        Button btnMoments = findViewById(R.id.btnMoments);
        btnMoments.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, BestMomentsActivity.class);
            startActivity(intent);
        });
        Button btnTips = findViewById(R.id.btnTips);
        btnTips.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, TipsActivity.class);
            startActivity(intent);
        });



    }
}
