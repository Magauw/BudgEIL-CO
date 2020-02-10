package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;


public class DepenseActivity extends AppCompatActivity {
    private Button buton;
    private List<Depense> listDepense;
    private EditText insert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_depense);
        createList();
        Categorie dault = new Categorie("Aliement","0.0");

        String montant =  getIntent().getStringExtra("montant");
        String cat  = getIntent().getStringExtra("catD");
        Categorie cat1 = new Categorie(cat);

        Depense depense = new Depense(montant, cat1);



        insert=findViewById(R.id.editText);
        buton = findViewById(R.id.button2);
        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int position = Integer.parseInt(insert.getText().toString());
                Intent intentD = new Intent(getApplicationContext() , ajoutDepenseActivity.class);
                startActivity(intentD);
                String montant =  getIntent().getStringExtra("montant");
                String cat  = getIntent().getStringExtra("catD");
                Categorie cat1 = new Categorie(cat);
                insetItem(position,montant,cat1);

            }
        });

        RecyclerView myRecyclerView = findViewById(R.id.myRecyclerView);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        myRecyclerView.setAdapter( new DepenseAdapter(listDepense));
    }

        public void createList(){
       listDepense= new ArrayList<>();

        }
    public void insetItem(int position,String montant ,Categorie cat1){
        listDepense.add(position,new Depense(montant,cat1));
    }
}
