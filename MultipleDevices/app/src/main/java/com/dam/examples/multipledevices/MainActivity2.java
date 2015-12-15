package com.dam.examples.multipledevices;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextoFragment tFragment = (TextoFragment)
                getFragmentManager().findFragmentById(R.id.fTexto);

        // Recogemos los datos del primer activity
        Bundle extras = getIntent().getExtras();
        tFragment.setTexto(extras.getString("item"));
    }
}
