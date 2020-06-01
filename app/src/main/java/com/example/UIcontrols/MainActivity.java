package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button textview,edittext,autotext,button,imgbutton,checkboxn,togglebutton,radiogroup,progressbr,spinner,timepick,datepick;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        textview = findViewById ( R.id.textview );
        edittext = findViewById ( R.id.edittext );
        autotext = findViewById ( R.id.autocompletetextview );
        button = findViewById ( R.id.button );
        imgbutton = findViewById ( R.id.imagebutton );
        checkboxn= findViewById ( R.id.checkbox);
        togglebutton = findViewById ( R.id.togglebutton );
        radiogroup = findViewById ( R.id.radiogroup );
        progressbr = findViewById ( R.id.progressbar );
        spinner = findViewById ( R.id.spinner );
        timepick = findViewById ( R.id.timepicker );
        datepick = findViewById ( R.id.datepicker );

        textview.setOnClickListener ( this );
        edittext.setOnClickListener ( this );
        autotext.setOnClickListener ( this );
        button.setOnClickListener ( this );
        imgbutton.setOnClickListener ( this );
        checkboxn.setOnClickListener ( this );
        togglebutton.setOnClickListener ( this );
        radiogroup.setOnClickListener ( this );
        progressbr.setOnClickListener ( this );
        spinner.setOnClickListener ( this );
        timepick.setOnClickListener ( this );
        datepick.setOnClickListener ( this );

    }

    @Override
    public void onClick(View view) {

        switch(view.getId ())
        {
            case R.id.textview:
                startActivity ( new Intent ( getApplicationContext (),Textview_layout.class ) );
                break;

            case R.id.edittext:
                startActivity ( new Intent ( getApplicationContext (),Edittext_layout.class ) );
                break;
            case R.id.autocompletetextview:
                startActivity ( new Intent ( getApplicationContext (),AutoCompleteTextView_layout.class ) );
                break;
            case R.id.button:
                startActivity ( new Intent ( getApplicationContext (),Button_layout.class ) );
                break;
            case R.id.imagebutton:
                startActivity ( new Intent ( getApplicationContext (),Imagebtn.class ) );
                break;
            case R.id.checkbox:
                startActivity ( new Intent ( getApplicationContext (),Checkbox_layout.class ) );
                break;
            case R.id.togglebutton:
                startActivity ( new Intent ( getApplicationContext (),ToggleButton_layout.class ) );
                break;
            case R.id.radiogroup:
                startActivity ( new Intent ( getApplicationContext (),Radiogroup.class ) );
                break;
            case R.id.progressbar:
                startActivity ( new Intent ( getApplicationContext (),Progrssbar.class ) );
                break;
            case R.id.spinner:
                startActivity ( new Intent ( getApplicationContext (),Spinner_layout.class ) );
                break;
            case R.id.timepicker:
                startActivity ( new Intent ( getApplicationContext (), TimePicker_layout.class ) );
                break;
            case R.id.datepicker:
                startActivity ( new Intent ( getApplicationContext (), Datepicker.class ) );
                break;

        }

    }
}
