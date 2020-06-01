package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Spinner_layout extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_spinner_layout );

        Spinner spinner = (Spinner) findViewById ( R.id.spinner );


       spinner.setOnItemSelectedListener ( this );

        List<String> list = new ArrayList<String> ();

        list.add ( "C" );
        list.add ( "C++" );
        list.add ( "JAVA" );
        list.add ( "ANDROID" );

        ArrayAdapter<String> adapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_dropdown_item,list);

        adapter.setDropDownViewResource ( android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter ( adapter );



    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText ( adapterView.getContext (), "Selected: "+ String.valueOf ( adapterView.getItemAtPosition ( i ) ), Toast.LENGTH_SHORT ).show ();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
