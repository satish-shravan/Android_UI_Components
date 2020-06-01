package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Edittext_layout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_edittext_layout );
        final EditText editText = findViewById ( R.id.edit_name );
        final TextView textView = findViewById ( R.id.txtn );



        editText.addTextChangedListener ( new TextWatcher () {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                        textView.setText ( "" );
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                textView.setText ( "Hello  " +  editText.getText ().toString () );
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        } );






    }
}
