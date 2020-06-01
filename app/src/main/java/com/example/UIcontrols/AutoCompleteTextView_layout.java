package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class AutoCompleteTextView_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_auto_complete_text_view_layout );

        String ar[] = {"Satish","Virat","Rohit","John","Bob","Steve","sandesh","sady","sandip"};

        AutoCompleteTextView autoCompleteTextView = findViewById ( R.id.autocompletetextview );
        autoCompleteTextView.setThreshold ( 1 );

        ArrayAdapter<String> adapter = new ArrayAdapter<String> ( this,R.layout.custom_text,ar );
        autoCompleteTextView.setAdapter ( adapter );

    }
}
