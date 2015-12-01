package com.dam.examples.comunicandofragmentsdinamicos;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link NoticiaFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link NoticiaFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class NoticiaFragment extends Fragment {

    // Parametros necesarios para rellenar la noticia
    static final String ARG_CABECERA = "cabecera";
    static final String ARG_NOTICIA = "noticia";

    private String cabecera;
    private String noticia;

    private OnFragmentInteractionListener mListener;

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment NoticiaFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static NoticiaFragment newInstance(String param1, String param2) {
        NoticiaFragment fragment = new NoticiaFragment();
        Bundle args = new Bundle();
        args.putString(ARG_CABECERA, param1);
        args.putString(ARG_NOTICIA, param2);
        fragment.setArguments(args);
        return fragment;
    }

    public NoticiaFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            cabecera = getArguments().getString(ARG_CABECERA);
            noticia = getArguments().getString(ARG_NOTICIA);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_noticia, container, false);
        TextView tCabecera = (TextView) v.findViewById(R.id.tCabecera);
        tCabecera.setText(cabecera);
        TextView tNoticia = (TextView) v.findViewById(R.id.tContenido);
        tNoticia.setText(noticia);
        return v;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        public void onFragmentInteraction(Uri uri);
    }

}
