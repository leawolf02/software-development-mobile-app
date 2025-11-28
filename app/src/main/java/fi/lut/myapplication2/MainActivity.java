package fi.lut.myapplication2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Button secondActivityBtn = (Button) findViewById(R.id.secondActivityBtn);
        secondActivityBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent startIntent = new Intent(getApplicationContext(), SecondActivity.class);
                startIntent.putExtra("org.mentorschools.quicklauncher.SOMETHING", "HELLO WORLD!");
                startActivity(startIntent);
            }
        });
        //Attempt to launch an acitivity outside our app
        Button googleBtn = (Button) findViewById(R.id.googleBtn);
        googleBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String google = "https://www.google.com";
                Uri webaddress = Uri.parse(google);

                Intent gotoGoogle = new Intent(Intent.ACTION_VIEW, webaddress);
                if(gotoGoogle.resolveActivity(getPackageManager()) != null){
                    startActivity(gotoGoogle);

                }
            }
        });

    }
}