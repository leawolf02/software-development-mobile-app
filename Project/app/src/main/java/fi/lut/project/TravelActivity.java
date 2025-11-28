package fi.lut.project;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class TravelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel);

        ListView listView = findViewById(R.id.listActivities);

        String[] items = {
                "Baptism",
                "Sitz",
                "Sauna",
                "ESN Overalls",
                "Swimming in the lake",
                "Ice Hockey",
                "Porvoo Trip",
                "Hiking",
                "Pumpkin caving",
                "Finnish bakery",
                "Trying finnish food",
                "Singing Karaoke",
                "Visit Sweden",
                "Pirates of the Baltic Sea Cruise",
                "Visit Riga",
                "Visit Tallinn",

        };
        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                items
        );

        listView.setAdapter(adapter);
        listView.setOnItemClickListener((parent, view, position, id) -> {
            Intent intent = new Intent(TravelActivity.this, DetailActivity.class);
            intent.putExtra("fi.lut.ITEM_INDEX", position);
            startActivity(intent);
        });

    }
}
