package com.santiago.formulariocontacto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    DatePicker fecha;
    TextInputEditText nombre;
    TextInputEditText telefono;
    TextInputEditText email;
    TextInputEditText descripcion;
    Button siguiente;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nombre = (TextInputEditText) findViewById(R.id.textInputEditTextNombre);
        fecha = (DatePicker) findViewById(R.id.datePicker1);
        telefono = (TextInputEditText) findViewById(R.id.textInputEditTextTelefono);
        email = (TextInputEditText) findViewById(R.id.textInputEditTextEmail);
        descripcion = (TextInputEditText) findViewById(R.id.textInputEditTextDescripcion);
        siguiente = (Button) findViewById(R.id.button);



        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int dia  = fecha.getDayOfMonth();
                int mes  = fecha.getMonth();
                int anio = fecha.getYear();

                final String fechaAux = dia + "/" + mes + "/" + anio;

                Intent intent = new Intent(MainActivity.this, ConfirmarDatos.class);
                intent.putExtra(getResources().getString(R.string.texto_nombre), nombre.getText().toString());
                intent.putExtra(getResources().getString(R.string.texto_telefono), telefono.getText().toString());
                intent.putExtra(getResources().getString(R.string.texto_email), email.getText().toString());
                intent.putExtra(getResources().getString(R.string.texto_descripcion), descripcion.getText().toString());
                intent.putExtra(getResources().getString(R.string.texto_fecha), fechaAux);
                startActivity(intent);
            }
        });

    }
}