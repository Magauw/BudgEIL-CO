package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class DepenseActivity extends AppCompatActivity {

    public String nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depense);

        Button addB = findViewById(R.id.addB);
        final List<Depense> DepenseList = new ArrayList<>();



        final RecyclerView myRecyclerView = findViewById(R.id.myRec);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        myRecyclerView.setAdapter( new DepenseAdapter(DepenseList));
        final Spinner spinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.categorie, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        addB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nom = spinner.getSelectedItem().toString();
                EditText depenseEditText = findViewById(R.id.depenseEditText);
                String montantSaisi = depenseEditText.getText().toString();

                Categorie cat1 = new Categorie(nom);
                Depense depense = new Depense(Double.valueOf(montantSaisi),cat1);
                DepenseList.add(depense);
                myRecyclerView.setAdapter( new DepenseAdapter(DepenseList));
            }
        });

    }
}
