package com.example.applicazionefilm;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView lvfilm;
    Button buttonEsci;
    String film[] = {"Spiderman", "Batman", "Titanic"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //assegno l'oggetto lv alla ListView
        lvfilm = (ListView)findViewById(R.id.lvFilm);

        //Creo l'array adapter associando l'array
        ArrayAdapter<String> aaFilm = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, film);
        //Popolo la listView con l'Arrayadapter
        lvfilm.setAdapter(aaFilm);

        //Assegno il Button
        buttonEsci = (Button)findViewById(R.id.buttonEsci);
        //Creo l'ascoltatore del button
        buttonEsci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),
                        "Vuoi Uscire", Toast.LENGTH_LONG).show();
            }
        });





    }
}