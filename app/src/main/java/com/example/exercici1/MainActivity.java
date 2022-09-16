package com.example.exercici1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        boto=findViewById(R.id.boton1);
        boto.SetOnClickListener(new View.OnClickListener(){
            public void onClick(View vista){
                Context context=getApplicationContext();
                CharSequence texto="Primera prova";
                int duracio= Toast.LENGTH_LONG;

                Toast tostada=Toast.makeText(context, texto, duracio);
            }
        });



    }
}