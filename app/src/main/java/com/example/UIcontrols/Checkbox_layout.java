package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class Checkbox_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_checkbox_layout );

         final LinearLayout ly = findViewById ( R.id.ly );


        final CheckBox yellow = findViewById ( R.id.yellow_check );



        yellow.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                if(yellow.isChecked ())
                {
                    ly.setBackgroundColor ( Color.YELLOW );
                }
                else
                {
                    ly.setBackgroundColor ( Color.TRANSPARENT );
                }
            }
        } );
    }
}
