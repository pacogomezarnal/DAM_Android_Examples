package com.dam.examples.ciudad;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class CiudadActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ciudad);

        //Obtener el contexto de la activity
        Context contexto= this;
        Log.i("CONTEXT INFO","El contexto de la activity es: "+contexto);

        ImageView image = (ImageView) findViewById(R.id.imageView);
        image.setImageDrawable(getResources().getDrawable(R.drawable.letrero, null));

        //Obtener el contexto dentro de una iiner class
        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i("CONTEXT INFO","El contexto de la activity dentro de un inner class: "+CiudadActivity.this);
            }

        });

        //Obtener el context a partir del view
        Log.i("CONTEXT INFO","El contexto de la activity dentro de un inner class: "+image.getContext());

        //Obtener el contexto de Aplicacion
        Log.i("CONTEXT INFO","El contexto de la aplicacion es: "+getApplicationContext());
    }
}
