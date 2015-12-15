package com.dam.examples.multipledevices;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TextoFragment extends Fragment {

    TextView texto;
    // Parametros necesarios para rellenar la noticia
    static final String ARG_TEXTO = "texto";

    private String tTexto="";

    public TextoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            tTexto = getArguments().getString(ARG_TEXTO);
        }
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=inflater.inflate(R.layout.fragment_texto, container, false);
        texto = (TextView) v.findViewById(R.id.tTexto);
        if(tTexto.length()>0) texto.setText(tTexto);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    //Metodo para cambiar el texto del TextView
    public void setTexto(String t){
        this.texto.setText(t);
    }



}
