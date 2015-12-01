package com.dam.examples.listviewproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //En primer lugar definimos el Array de Strings y lo convertimos a una Lista, en este caso ArrayList
        //DATOS
        String[] sistemasOperativos = new String[] { "Android", "iPhone", "WindowsMobile",
                "Blackberry", "WebOS", "Ubuntu", "Windows7", "Max OS X",
                "Linux", "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux",
                "OS/2", "Ubuntu", "Windows7", "Max OS X", "Linux", "OS/2",
                "Android", "iPhone", "WindowsMobile" };
        ArrayList<String> listaSO = new ArrayList<String>(Arrays.asList(sistemasOperativos));

        //En segundo lugar enchufamos la lista al Adaptador
        //ArrayAdapter<String> adapter =  new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaSO);

        //Utilizamos nuestro Adapter customizado
        MenuAdapter adapter =  new MenuAdapter(this,listaSO);

        //Por último enchufamos el adaptador a la Vista que es el LsitView
        //INTERFAZ o la VISION
        final ListView listview = (ListView) findViewById(R.id.listview);
        listview.setAdapter(adapter);



        //INTERACTUANDO
        listview.setOnItemClickListener(new nuestroListener());
    }

    //Implementamos el listener para nuestro listView
    //INNER CLASS
    private class nuestroListener implements AdapterView.OnItemClickListener{
        public void onItemClick (AdapterView<?> parent, View view, int position, long id){
            //String de la posicion clickada
            String item = (String) parent.getItemAtPosition(position);
            //Toast.makeText(MainActivity.this,item,Toast.LENGTH_LONG).show();
            //Paso de informacion
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            intent.putExtra("so", item);
            startActivity(intent);
        }
    }
}
