package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;

public class Datepicker extends AppCompatActivity {

    DatePicker datePicker;
    TextView  showdate;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_datepicker );

        datePicker =  findViewById ( R.id.datepicker );

        showdate = findViewById ( R.id.showdate );

        Calendar calendar = Calendar.getInstance ();

        showdate.setText ( new StringBuilder (  ).append ( calendar.get ( Calendar.DAY_OF_MONTH ))
                .append ( " / " )
                .append (( calendar.get(Calendar.MONTH)) + 1 )
                .append ( " / " )
                .append ( calendar.get(Calendar.YEAR) ));


        datePicker.init ( calendar.get ( Calendar.YEAR ), calendar.get ( Calendar.MONTH ), calendar.get ( Calendar.DAY_OF_MONTH ), new DatePicker.OnDateChangedListener () {
            @Override
            public void onDateChanged(DatePicker datePicker, int i, int i1, int i2) {
                showdate.setText ( new StringBuilder (  ).append ( datePicker.getDayOfMonth ())
                        .append ( " / " )
                .append (datePicker.getMonth () )
                .append ( " / " )
                .append ( datePicker.getYear () ));
            }
        } );

    }
}
