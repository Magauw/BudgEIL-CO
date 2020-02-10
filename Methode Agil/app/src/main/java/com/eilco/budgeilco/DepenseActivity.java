package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DepenseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depense);



        String montant =  getIntent().getStringExtra("montant");
        String cat  = getIntent().getStringExtra("catD");
        Categorie cat1 = new Categorie(cat);

        Depense depense = new Depense(montant, cat1);

        List<Depense> depenseList = new ArrayList<>();

        depenseList.add(depense);


        RecyclerView myRecyclerView = findViewById(R.id.myRecyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerView.setAdapter( new DepenseAdapter(depenseList));
    }
}
