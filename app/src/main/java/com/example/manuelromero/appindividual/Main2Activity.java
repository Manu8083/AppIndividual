package com.example.manuelromero.appindividual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button GuardarDatos;

        GuardarDatos = (Button)findViewById(R.id.BtnSendData);

        GuardarDatos.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){

                EditText InputNombre,InputApellido,InputEmail,InputEdad, InputAdicional;
                String nombre,apellido, email,edad, msjSexo = "" ,adicional;
                int sexo;
                RadioGroup InputSexo;


                InputSexo = (RadioGroup)findViewById(R.id.RadioOptions);
                System.out.println(InputSexo);
                sexo = InputSexo.getCheckedRadioButtonId();
                switch (sexo){
                    case R.id.radioFemale: msjSexo="Mujer";
                        break;
                    case R.id.radioMale: msjSexo="Hombre";
                        break;
                }



                InputNombre = (EditText)findViewById(R.id.CampoNombre);
                nombre = InputNombre.getText().toString();

                InputApellido = (EditText)findViewById(R.id.CampoApellido);
                apellido = InputApellido.getText().toString();

                InputEmail = (EditText)findViewById(R.id.CampoEmail);
                email = InputEmail.getText().toString();

                // InputSexo = (EditText)findViewById(R.id.CampoSexo);
                //sexo = InputNombre.getText().toString();

                InputEdad = (EditText)findViewById(R.id.CampoEdad);
                edad = InputEdad.getText().toString();

                InputAdicional = (EditText)findViewById(R.id.CampoAdicional);
                adicional = InputAdicional.getText().toString();

                Intent guardarDatos = new Intent(Main2Activity.this,  Main3Activity.class);
                guardarDatos.putExtra("nombre", nombre);
                guardarDatos.putExtra("apellido", apellido);
                guardarDatos.putExtra("email", email);
                guardarDatos.putExtra("sexo", msjSexo);
                guardarDatos.putExtra("edad", edad);
                guardarDatos.putExtra("adicional", adicional);
                startActivity(guardarDatos);
            }
        });
    }
}
