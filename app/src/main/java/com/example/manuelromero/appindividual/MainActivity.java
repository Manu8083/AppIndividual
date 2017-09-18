package com.example.manuelromero.appindividual;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    Button siguiente, salir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        siguiente = (Button)findViewById(R.id.BtnSiguiente);

        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                Intent siguiente = new Intent(MainActivity.this,  Main2Activity.class);
                startActivity(siguiente);
            }
        });

        salir = (Button)findViewById(R.id.BtnSalir);

        salir.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v){
                finish();
                System.exit(0);
            }
        });
    }
}
