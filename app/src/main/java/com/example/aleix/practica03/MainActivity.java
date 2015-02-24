package com.example.aleix.practica03;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.SeekBar;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void changeActivity(View v){

        EditText nom = (EditText) findViewById(R.id.nom_id);
        EditText cognom = (EditText) findViewById(R.id.cognom_id);
        RadioGroup radio = (RadioGroup) findViewById(R.id.radio_id);
        CheckBox treballa = (CheckBox) findViewById(R.id.treballa_id);
        CheckBox estudia = (CheckBox) findViewById(R.id.estudia_id);
        Switch estudis = (Switch) findViewById(R.id.estudis_switch);
        SeekBar pes = (SeekBar) findViewById(R.id.pes_id);
        EditText data = (EditText) findViewById(R.id.data_id);


        String nom = name.getText().toString();
        String cognom = surname.getText().toString();

        String data = date.getText().toString();


        if (treballa.isChecked()){
            treballa="treballa";
        }
        else{
            treballa="no treballa";
        }

        if (estudia.isChecked()){
            estudia="estudia";
        }
        else{
            estudia="no estudia";
        }

        Intent i = new Intent(this, activity_main_activity2.class);

        i.putExtra("nom",nom);
        i.putExtra("cognom",cognom);
        i.putExtra("sexe",radio);

        i.putExtra(estudia,estudia);
        i.putExtra(treballa,treballa);
        i.putExtra("estudis",estudis);
        i.putExtra("pes",pes);
        i.putExtra("data",data);

        startActivity(i);

    }

}
