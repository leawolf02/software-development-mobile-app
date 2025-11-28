package fi.lut.project;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class BestMomentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bestmoments);

        ImageView img1 = findViewById(R.id.img1);
        ImageView img2 = findViewById(R.id.img2);
        ImageView img3 = findViewById(R.id.img3);
        ImageView img4 = findViewById(R.id.img4);
        ImageView img5 = findViewById(R.id.img5);
        ImageView img6 = findViewById(R.id.img6);
        ImageView img7 = findViewById(R.id.img7);
        ImageView img8 = findViewById(R.id.img8);

        img1.setImageResource(R.drawable.aurora);
        img2.setImageResource(R.drawable.rigaphoto);
        img3.setImageResource(R.drawable.esn);
        img4.setImageResource(R.drawable.pelicans);
        img5.setImageResource(R.drawable.sewing);
        img6.setImageResource(R.drawable.sunset);
        img7.setImageResource(R.drawable.fair);
        img8.setImageResource(R.drawable.snow);
    }
}
