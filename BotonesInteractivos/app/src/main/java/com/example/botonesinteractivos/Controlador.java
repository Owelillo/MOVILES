package com.example.botonesinteractivos;

import static android.view.View.*;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class Controlador implements OnClickListener {
    private Context context;

    public Controlador(Context c) {
        this.context = c;
    }

    @Override
    public void onClick(View view) {
        Toast.makeText(context, "", Toast.LENGTH_SHORT).show();
    }
}
