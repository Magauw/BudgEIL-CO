package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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


        String Budget =  getIntent().getStringExtra("montantB");
        budgetValue.setText(Budget);

        ajoutBud=findViewById(R.id.buttonAjoutB);
        ajoutBud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentB = new Intent(getApplicationContext() , ajoutBudgetActivity.class);
                startActivity(intentB);

    }
});
        ajoutDep=findViewById(R.id.buttonAjoutD);
        ajoutDep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentD = new Intent(getApplicationContext() , ajoutDepenseActivity.class);
                startActivity(intentD);
            }
        });

    }
}