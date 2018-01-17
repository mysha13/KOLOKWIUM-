package com.example.elasz.leki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by elasz on 17.01.2018.
 */

public class Main2Activity  extends AppCompatActivity {

    @BindView(R.id.recycler)
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ButterKnife.bind(this);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        ArrayList<Lekarz> lekarze = new ArrayList<>();
        lekarze.add(new Lekarz("Jak Kowalkski", "dermatolog"));
        lekarze.add(new Lekarz("Stefan Nowak", "karddiolog"));
        lekarze.add(new Lekarz("Zuzanna nowak", "ortopeda"));
        lekarze.add(new Lekarz("Kamil Kowalski", "neurolog"));


        lekarzAdapter lekarzAdapter = new lekarzAdapter(lekarze);
        recyclerView.setAdapter(lekarzAdapter);
    }
}
