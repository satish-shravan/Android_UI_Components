package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Radiogroup extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_radiogroup );

        final RadioButton male = findViewById ( R.id.male );
        final RadioButton female = findViewById ( R.id.female );

        RadioGroup radioGroup = findViewById ( R.id.radiogroup );
        
        radioGroup.setOnCheckedChangeListener ( new RadioGroup.OnCheckedChangeListener () {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                
                if(male.isChecked ())
                {
                    Toast.makeText ( Radiogroup.this, "You are MALE", Toast.LENGTH_SHORT ).show ();
                }
                else if(female.isChecked ())
                {
                    Toast.makeText ( Radiogroup.this, "You are FEMALE", Toast.LENGTH_SHORT ).show ();
                }
            }
        } );




    }
}
