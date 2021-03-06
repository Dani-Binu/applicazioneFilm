package com.example.applicazionefilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ListView lvfilm;
        Button btnEsci;
        String film[] = {"Spiderman: Far from home", "Red Notice", "Free Guy"};

            lvfilm = (ListView)findViewById(R.id.lvFilm);
            ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, film);
            lvfilm.setAdapter(aaFilm);
        }

        @Override
        public boolean onOptionsItemSelected(MenuItem item) {
            switch (item.getItemId()) {
                case android.R.id.home:
                    this.finish();
                    return true;
            }
            return super.onOptionsItemSelected(item);
        }
}