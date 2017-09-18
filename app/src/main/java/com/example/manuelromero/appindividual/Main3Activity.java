package com.example.manuelromero.appindividual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    Bundle data;
    String nombre,apellido,email,sexo,edad, adicional;
    TextView printNombre, printApellidos, PrintEmail,PrintSexo,PrintEdad, PrintAdicional;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        printNombre = (TextView)findViewById(R.id.DataNombre);
        printApellidos = (TextView)findViewById(R.id.DataApellido);
        PrintEmail = (TextView)findViewById(R.id.DataEmail);
        PrintSexo = (TextView)findViewById(R.id.DataSexo);
        PrintEdad = (TextView)findViewById(R.id.DataEdad);
        PrintAdicional = (TextView)findViewById(R.id.DataAdicional);


        data = getIntent().getExtras();

        nombre = data.getString("nombre");
        apellido = data.getString("apellido");
        email = data.getString("email");
        sexo = data.getString("sexo");
        edad = data.getString("edad");
        adicional = data.getString("adicional");

        printNombre.setText(nombre);
        printApellidos.setText(apellido);
        PrintEmail.setText(email);
        PrintSexo.setText(sexo);
        PrintEdad.setText(edad);
        PrintAdicional.setText(adicional);

        Button salir = (Button)findViewById(R.id.btnFinal);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
    }

}
