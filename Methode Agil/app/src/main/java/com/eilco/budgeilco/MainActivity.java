package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Categorie> categorieList ;
    private TextView budgetValue;
    private Button ajoutDep;
    private Button ajoutBud;
    public String nom;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        budgetValue = findViewById(R.id.textViewValueB);
        Button addB = findViewById(R.id.addB);
        final List<Depense> DepenseList = new ArrayList<>();


        final RecyclerView myRecyclerView = findViewById(R.id.myRecyclerViewB);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        myRecyclerView.setAdapter( new DepenseAdapter(DepenseList));

        String Budget =  getIntent().getStringExtra("montantB");
        budgetValue.setText(Budget);

        //Definition du bouton ajout budget
        ajoutBud=findViewById(R.id.buttonAjoutB);
        ajoutBud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentB = new Intent(getApplicationContext() , ajoutBudgetActivity.class);
                startActivity(intentB);
            }

        });

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
