package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ajoutBudgetActivity extends AppCompatActivity {

    private EditText montantBudget;
    private Button btnEnvoieBudget;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_budget);
        montantBudget =findViewById(R.id.editTextMontantB);
        btnEnvoieBudget=findViewById(R.id.buttonAjoutB);
        btnEnvoieBudget.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               String BudgetSaisi= montantBudget.getText().toString();
                Intent intent = new Intent(getApplicationContext() , MainActivity.class);
                intent.putExtra("montantB", BudgetSaisi);
                startActivity(intent);
            }
        });

    }
}
