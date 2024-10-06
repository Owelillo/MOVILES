package com.example.botonesinteractivos;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import android.view.View;
import android.widget.Button; // Importación de Button
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;


public class MainActivity extends AppCompatActivity {
    private Button botonIzquierda;
    private Button botonDerecha;
    private TextView txt;
    private TextInputEditText txtEscribir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txt = findViewById(R.id.textoCambiante);
        txtEscribir = findViewById(R.id.escribirTexto);

        Controlador ctr = new Controlador(txt, txtEscribir);

        botonIzquierda=findViewById(R.id.BotonGuardar);
        botonIzquierda.setOnClickListener(ctr);


        botonDerecha=findViewById(R.id.BotonBorrar);
        botonDerecha.setOnClickListener(ctr);
    }
}