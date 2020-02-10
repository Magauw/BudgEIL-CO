package com.eilco.budgeilco;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ajoutDepenseActivity extends AppCompatActivity  {

    private Button ajoutBouton;

    public EditText montant ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajout_depense);

        this.ajoutBouton = findViewById(R.id.buttonAjoutD);
        this.montant = findViewById(R.id.editTextMontantD);

        ajoutBouton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String montantSaisi = montant.getText().toString();
                Intent intent = new Intent(getApplicationContext() , DepenseActivity.class);
                intent.putExtra("montant", montantSaisi);
                startActivity(intent);
            }
        });

    }

}
