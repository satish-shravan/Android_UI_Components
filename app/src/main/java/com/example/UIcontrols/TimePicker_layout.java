package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class TimePicker_layout extends AppCompatActivity {

    private TimePicker timePicker,timePickerspinner;
    private TextView showt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_time_picker_layout );

         timePicker = findViewById ( R.id.timepicker );
         timePickerspinner = findViewById ( R.id.timepickerspinner );
         showt = findViewById ( R.id.showtime );

         int hour = Calendar.getInstance ().get ( Calendar.HOUR_OF_DAY );
         int min = Calendar.getInstance ().get ( Calendar.MINUTE );

         showTime ( hour,min );

         getTime ( timePicker );
         getTime ( timePickerspinner );



    }

    void getTime(TimePicker timePicker)
    {
        timePicker.setOnTimeChangedListener ( new TimePicker.OnTimeChangedListener () {
            @Override
            public void onTimeChanged(TimePicker timePicker, int i, int i1) {

                int hour = timePicker.getCurrentHour ();
                int min = timePicker.getCurrentMinute ();
                showTime(hour,min);
            }
        } );

    }
    public void showTime(int h,int min)
    {
        String format ="";

        if(h==0)
        {
            h+=12;
            format="AM";
        }
        else if(h==12)
        {
            format="PM";
        }
        else if(h >= 12)
        {
            h =h-12;
            format ="PM";
        }
        else
        {
            format="AM";
        }

        showt.setText ( new StringBuilder ( ).append ( h ).append ( " ").append ( ": " ).append ( min ).append ( " " ).append ( format ));
    }
}
