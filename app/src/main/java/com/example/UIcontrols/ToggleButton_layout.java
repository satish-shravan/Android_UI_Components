package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;
import android.widget.ToggleButton;

public class ToggleButton_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_toggle_button_layout );

        final LinearLayout ly = findViewById ( R.id.ly );

        ly.setBackgroundColor ( Color.TRANSPARENT );

        final ToggleButton btn = findViewById ( R.id.btn );



        btn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                if(btn.isChecked ())
                {
                    ly.setBackgroundColor ( Color.GREEN );
                    Toast.makeText ( ToggleButton_layout.this, "Toggle Button : ON", Toast.LENGTH_SHORT ).show ();
                }
                else
                {
                    ly.setBackgroundColor ( Color.TRANSPARENT );
                    Toast.makeText ( ToggleButton_layout.this, "Toggle Button : OFF", Toast.LENGTH_SHORT ).show ();
                }
            }
        } );
    }
}
