package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

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
        Intent intent = new Intent();
        String Budget =  intent.getStringExtra("montantB");
        budgetValue.setText(Budget);
        ajoutBud=findViewById(R.id.buttonAjoutB);
        ajoutBud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentB = new Intent(getApplicationContext() , ajoutBudgetActivity.class);
                startActivity(intentB);

        Categorie cat1 = new Categorie("Alimentation",0.0);
        Categorie cat2 = new Categorie("Loyer",0.0);
        Categorie cat3 = new Categorie("Loisir",0.0);
        ajoutDep=findViewById(R.id.buttonAjoutD);
        ajoutDep.setOnClickListener(new View.OnClickListener() {
            @Override
                Intent intentD = new Intent(getApplicationContext() , ajoutDepenseActivity.class);
                startActivity(intentD);
    }
});
            public void onClick(View v) {
            }
        });

        List<Categorie> categorieList = new ArrayList<>();

        categorieList.add(cat1);
        categorieList.add(cat2);
        categorieList.add(cat3);
        RecyclerView myRecyclerView = findViewById(R.id.myRecyclerViewB);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerView.setAdapter( new CategorieAdapter(categorieList));

    }
}