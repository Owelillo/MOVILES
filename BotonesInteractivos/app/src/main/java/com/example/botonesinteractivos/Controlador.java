package com.example.botonesinteractivos;

import static android.view.View.*;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class Controlador implements OnClickListener {

    private TextView txt;
    private TextInputEditText txtEscribir;

    public Controlador(TextView txt, TextInputEditText txtEscribir) {
        this.txt = txt;
        this.txtEscribir = txtEscribir;
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.BotonGuardar){
            String textoEscrito = txtEscribir.getText().toString();
            txt.setText(textoEscrito);
        }
        if(view.getId() == R.id.BotonBorrar){
            txtEscribir.setText(" ");
            txt.setText(" ");
        }
    }
}
