package com.dam.examples.fragmentproject;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link ListaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link ListaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class ListaFragment extends Fragment {


    public ListaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lista, container, false);


    }


    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }
    @Override
    public void onActivityCreated (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        //En primer lugar definimos el Array de Strings y lo convertimos a una Lista, en este caso ArrayList
        //DATOS
        String[] sistemasOperativos = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" };
        ArrayList<String> listaSO = new ArrayList<String>(Arrays.asList(sistemasOperativos));
        //En segundo lugar enchufamos la lista al Adaptador
        ArrayAdapter<String> adapter =  new ArrayAdapter<String>(getActivity(),android.R.layout.simple_list_item_1,listaSO);

        //Por último enchufamos el adaptador a la Vista que es el LsitView
        //INTERFAZ o la VISION
        final ListView listview = (ListView) getView().findViewById(R.id.listview);
        listview.setAdapter(adapter);
    }
    @Override
    public void onDetach() {
        super.onDetach();
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
