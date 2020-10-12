package com.santiago.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class ConfirmarDatos extends AppCompatActivity {

    private TextView tvNombre;
    private TextView tvTelefono;
    private TextView tvEmail;
    private TextView tvDescripcion;
    private TextView tvFecha;
    Button editar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmar_datos);

        Bundle parametros  = getIntent().getExtras();
        String nombre      = parametros.getString(getResources().getString(R.string.texto_nombre));
        String telefono    = parametros.getString(getResources().getString(R.string.texto_telefono));
        String email       = parametros.getString(getResources().getString(R.string.texto_email));
        String descripcion = parametros.getString(getResources().getString(R.string.texto_descripcion));
        String fechaAux    = parametros.getString(getResources().getString(R.string.texto_fecha));

        tvNombre      = (TextView) findViewById(R.id.tvNombre);
        tvTelefono    = (TextView) findViewById(R.id.tvTelefono);
        tvEmail       = (TextView) findViewById(R.id.tvEmail);
        tvDescripcion = (TextView) findViewById(R.id.tvDescripcion);
        tvFecha       = (TextView) findViewById(R.id.tvFecha);

        tvNombre.setText(nombre);
        tvTelefono.setText(telefono);
        tvEmail.setText(email);
        tvDescripcion.setText(descripcion);
        tvFecha.setText(fechaAux);

        editar = (Button) findViewById(R.id.buttonEditar);

        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ConfirmarDatos.this, MainActivity.class);
                //intent.putExtra(getResources().getString(R.string.texto_nombre), nombre.getText().toString());
                //intent.putExtra(getResources().getString(R.string.texto_telefono), telefono.getText().toString());
                //intent.putExtra(getResources().getString(R.string.texto_email), email.getText().toString());
                //intent.putExtra(getResources().getString(R.string.texto_descripcion), descripcion.getText().toString());
                //intent.putExtra(getResources().getString(R.string.texto_fecha), fechaAux);
                startActivity(intent);
            }
        });


        Button editar = (Button) findViewById(R.id.buttonEditar);
        editar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });


    }
}