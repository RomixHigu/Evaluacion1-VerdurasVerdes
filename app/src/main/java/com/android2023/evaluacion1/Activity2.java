package com.android2023.evaluacion1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class Activity2 extends AppCompatActivity {

    EditText Verdura,Hectarea;
    Button Calcular,Limpiar;
    TextView Resultado;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        Verdura = findViewById(R.id.verdura);
        Hectarea = findViewById(R.id.hectarea);
        Calcular = findViewById(R.id.btnCalcular);
        Limpiar = findViewById(R.id.btnLimpiar);
        Resultado = findViewById(R.id.Resultado);

        Calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String verStr = Verdura.getText().toString();
                String hecStr = Hectarea.getText().toString();

                int v = Integer.parseInt(verStr);
                int h = Integer.parseInt(hecStr);
                int r = v * h;

                Intent intent2 = new Intent(Activity2.this, Activity3.class);
                intent2.putExtra("Resultado",r);
                startActivity(intent2);
            }
        });

        Limpiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Verdura.setText("");
                Hectarea.setText("");
            }
        });

    }
}