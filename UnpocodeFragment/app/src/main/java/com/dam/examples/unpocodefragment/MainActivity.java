package com.dam.examples.unpocodefragment;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends Activity implements ListFragment.ListFragmentListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onListSelected(int position,String item){
        Log.i("FRAGENT", "Llego");
        //Toast.makeText(this,"TExto elegida: "+item,Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        intent.putExtra("so", item);
        startActivity(intent);

    }
}
