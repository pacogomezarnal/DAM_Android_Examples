package com.dam.examples.comunicandofragments;


import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity implements IzquierdaFragment.OnFragmentInteractionListener,DerechaFragment.OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onFragmentInteraction(int pos,String mensage) {
        Log.i("MENSAJE FRAGMENT: ",mensage);
        //Cambiamos mensaje de la dercha
        if(pos==0){
            DerechaFragment derecha = (DerechaFragment)
                    getFragmentManager().findFragmentById(R.id.drcha_fragment);
            derecha.onText(mensage);
        }else{
            IzquierdaFragment izqda = (IzquierdaFragment)
                    getFragmentManager().findFragmentById(R.id.izda_fragment);
            izqda.onText(mensage);
        }
    }
}
