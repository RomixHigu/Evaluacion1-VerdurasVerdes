package com.android2023.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Activity3 extends AppCompatActivity {
    TextView Resultado2;
    Button Volver;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_3);
        int resultadoRecibido = getIntent().getIntExtra("Resultado",0);

        Resultado2 = findViewById(R.id.Resultado);
        Resultado2.setText("$"+ String.valueOf(resultadoRecibido));

        Volver = findViewById(R.id.btnVolver);
        Volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Activity3.this, Activity2.class);
                startActivity(intent3);
                finish();
            }
        });
    }

}