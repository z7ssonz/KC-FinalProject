package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ArrayList<Burger>burgersList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        requestWindowFeature(getWindow().FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();


        Burger mac = new Burger("MacDonald's", R.drawable.mcdonalds);
        Burger burgerKing = new Burger("Burger King", R.drawable.king);


        burgersList.add(mac);
        burgersList.add(burgerKing);

        burgerAdapter burgerAdapter = new burgerAdapter(this, 0,burgersList);

        ListView listView =findViewById(R.id.burgerListView);
        listView.setAdapter(burgerAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

            Burger currntBurger = burgersList.get(i);


            Intent intent = new Intent(SecondActivity.this, MenuActivity.class);
            intent.putExtra("Burger", currntBurger);
            startActivity(intent);
            }
        });



    }
}