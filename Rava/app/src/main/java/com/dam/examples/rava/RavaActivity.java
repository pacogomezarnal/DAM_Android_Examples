package com.dam.examples.rava;


import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.Log;

public class RavaActivity extends Activity implements BotonesFragment.OnFragmentBotonListener {
    LetrasFragment lFragment;
    PuntuacionFragment pFragment;
    BotonesFragment bFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rava);

        lFragment = (LetrasFragment)
                getFragmentManager().findFragmentById(R.id.letras_fragment);
        pFragment = (PuntuacionFragment)
                getFragmentManager().findFragmentById(R.id.puntuacion_fragment);
        bFragment = (BotonesFragment)
                getFragmentManager().findFragmentById(R.id.botones_fragment);
    }

    @Override
    public void onFragmentInteraction(int color) {
        //Comprobacion con el color del fragment de las letras
        if(lFragment.checkColor(color)) pFragment.addPuntuacion();
        //Barajamos colores y letra indipendientemente del resultado
        bFragment.barajarColores();
        //Cambiamos letras
        lFragment.cambiaLetras();

    }
}
