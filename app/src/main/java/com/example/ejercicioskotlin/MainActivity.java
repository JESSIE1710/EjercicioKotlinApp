package com.example.ejercicioskotlin;

import android.os.Bundle;
import android.view.View;
import android.widget.Button; // <-- 1. IMPORTA LA CLASE BUTTON
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button boton; // Variable para el botón

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 2. Enlaza la variable con el botón del layout
        boton = findViewById(R.id.boton);

        // 3. Configura el listener para un CLIC NORMAL
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Esta es la acción que se ejecuta al hacer clic
                Toast.makeText(MainActivity.this, "Pulsación normal (escrito en Java)", Toast.LENGTH_SHORT).show();
            }
        }); // <-- 4. El punto y coma va aquí, al final de la instrucción.
    }
}
