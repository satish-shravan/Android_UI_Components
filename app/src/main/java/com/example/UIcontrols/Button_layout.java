package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Button_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_button_layout );

        Button btn = findViewById ( R.id.btn );
        btn.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                Toast.makeText ( Button_layout.this, "You clicked me :)", Toast.LENGTH_SHORT ).show ();
            }
        } );


    }
}
