package com.example.aleix.practica03;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity2Activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        intent i = getIntent();
        String nom = i.getStringExtra("nom");
        String nom = i.getStringExtra("cognom");
        String nom = i.getStringExtra("sexe");
        String nom = i.getStringExtra("estat");
        String nom = i.getStringExtra("estudis");
        String nom = i.getStringExtra("pes");
        String nom = i.getStringExtra("data");


        setContentView(R.layout.activity_main_activity2);

        TextView nom = (TextView) findViewById(R.id.nom_result_id);
        nom.setText(nom);

        TextView cognom = (TextView) findViewById(R.id.cognom_result_id);
        cognom.setText(cognom);

        TextView sexe = (TextView) findViewById(R.id.sexe_result_id);
        sexe.setText(sexe);

        TextView estat = (TextView) findViewById(R.id.estat_result_id);
        estat.setText(estat);

        TextView estudis = (TextView) findViewById(R.id.estudis_result_id);
        estudis.setText(estudis);

        TextView pes = (TextView) findViewById(R.id.pes_result_id);
        pes.setText(pes);

        TextView data = (TextView) findViewById(R.id.data_result_id);
        data.setText(data);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity2, menu);
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
}
