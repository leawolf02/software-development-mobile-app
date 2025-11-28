package fi.lut.project;

import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FoodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        Switch recipeToggle = findViewById(R.id.recipeToggle);
        TextView recipeText = findViewById(R.id.recipeText);

        // Toggle listener
        recipeToggle.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if (isChecked) {
                recipeText.setVisibility(TextView.VISIBLE);
            } else {
                recipeText.setVisibility(TextView.GONE);
            }
        });

}
}
