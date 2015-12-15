package com.dam.examples.multipledevices;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity implements MenuFragment.ListFragmentListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Checkamos si estamos en un dispositivo grande o no
        if (findViewById(R.id.fragment_container) != null) {
            setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            // Cargamos el fragment del texto
            TextoFragment texto = new TextoFragment();
            //CApturamos el cargador dinámico
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Reemplazamos la noticia
            transaction.replace(R.id.fragment_container, texto);
            transaction.addToBackStack(null);
            // REalizamos el reemplazo
            transaction.commit();
        }
    }


    @Override
    public void onListSelected(int position, String item) {
        //Checkamos si estamos en un dispositivo grande o no
        if (findViewById(R.id.fragment_container) != null) {
            // Cargamos el fragment del texto
            TextoFragment texto = new TextoFragment();
            Bundle args = new Bundle();
            args.putString(TextoFragment.ARG_TEXTO, item);
            texto.setArguments(args);
            //CApturamos el cargador dinámico
            FragmentTransaction transaction = getFragmentManager().beginTransaction();
            // Reemplazamos el texto
            transaction.replace(R.id.fragment_container, texto);
            transaction.addToBackStack(null);
            // REalizamos el reemplazo
            transaction.commit();


        }else{//Dispositivo pequeño
            Intent mainIntent = new Intent(this,
                    MainActivity2.class);
            mainIntent.putExtra("item", item);
            startActivity(mainIntent);
        }
    }

}
