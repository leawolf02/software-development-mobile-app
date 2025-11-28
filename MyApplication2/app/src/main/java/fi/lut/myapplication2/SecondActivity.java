package fi.lut.myapplication2;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        if(getIntent().hasExtra("org.mentorschools.quicklauncher.SOMETHING")){
            TextView tv = (TextView) findViewById(R.id.textView);
            String text = getIntent().getExtras().getString("org.mentorschools.quicklauncher.SOMETHING");
            tv.setText(text);

        }
    }
}