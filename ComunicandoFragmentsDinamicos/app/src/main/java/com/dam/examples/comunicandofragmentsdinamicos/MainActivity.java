package com.dam.examples.comunicandofragmentsdinamicos;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Boton 1
        Button b1 = (Button) findViewById(R.id.bArt1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creamos una nueva noticia
                NoticiaFragment noticia = new NoticiaFragment();
                Bundle args = new Bundle();
                args.putString(NoticiaFragment.ARG_CABECERA, "Noticia 1");
                args.putString(NoticiaFragment.ARG_NOTICIA, "Este sería el desarrollo de la noticia 1");
                noticia.setArguments(args);
                //CApturamos el cargador dináamico
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Reemplazamos la noticia
                transaction.replace(R.id.fragment_container, noticia);
                transaction.addToBackStack(null);
                // REalizamos el reemplazo
                transaction.commit();
            }
        });
        //Boton 2
        Button b2 = (Button) findViewById(R.id.bArt2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creamos una nueva noticia
                NoticiaFragment noticia = new NoticiaFragment();
                Bundle args = new Bundle();
                args.putString(NoticiaFragment.ARG_CABECERA, "Noticia 2");
                args.putString(NoticiaFragment.ARG_NOTICIA, "Este sería el desarrollo de la noticia 2");
                noticia.setArguments(args);
                //CApturamos el cargador dináamico
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Reemplazamos la noticia
                transaction.replace(R.id.fragment_container, noticia);
                transaction.addToBackStack(null);
                // REalizamos el reemplazo
                transaction.commit();
            }
        });
        //Boton 3
        Button b3 = (Button) findViewById(R.id.bArt3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Creamos una nueva noticia
                NoticiaFragment noticia = new NoticiaFragment();
                Bundle args = new Bundle();
                args.putString(NoticiaFragment.ARG_CABECERA, "Noticia 3");
                args.putString(NoticiaFragment.ARG_NOTICIA, "Este sería el desarrollo de la noticia 3");
                noticia.setArguments(args);
                //CApturamos el cargador dináamico
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                // Reemplazamos la noticia
                transaction.replace(R.id.fragment_container, noticia);
                transaction.addToBackStack(null);
                // REalizamos el reemplazo
                transaction.commit();
            }
        });
    }
}
