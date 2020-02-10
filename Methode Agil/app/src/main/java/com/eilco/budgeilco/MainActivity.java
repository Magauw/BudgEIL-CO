package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    private List<Categorie> categorieList ;
    private TextView budgetValue;
    private Button ajoutDep;
    private Button ajoutBud;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        budgetValue = findViewById(R.id.textViewValueB);


        String depense = getIntent().getStringExtra("montant");

        //Definition des catégorie
        Categorie cat1 = new Categorie("Alimentation","0.0");
       /* Categorie cat2 = new Categorie("Loyer",0.0);
        Categorie cat3 = new Categorie("Loisir",0.0);

        List<Categorie> categorieList = new ArrayList<>();

        categorieList.add(cat1);
        categorieList.add(cat2);
        categorieList.add(cat3);*/

      // double dep = Double.valueOf(depense);
        Depense depense1 = new Depense(depense,cat1);
       List<Depense> depenseList= new ArrayList<>();
       depenseList.add(depense1);

        //Definition de l'adapter recycler view
        RecyclerView myRecyclerView = findViewById(R.id.myRecyclerViewB);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerView.setAdapter( new DepenseAdapter(depenseList));

        String Budget =  getIntent().getStringExtra("montantB");
        budgetValue.setText(Budget);

        //Definition du bouton ajout dépenses
        ajoutDep=findViewById(R.id.buttonAjoutD);
        ajoutDep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentD = new Intent(getApplicationContext() , ajoutDepenseActivity.class);
                startActivity(intentD);
            }
    });
        //Definition du bouton ajout budget
        ajoutBud=findViewById(R.id.buttonAjoutB);
        ajoutBud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentB = new Intent(getApplicationContext() , ajoutBudgetActivity.class);
                startActivity(intentB);
            }

        });
    }

    }
