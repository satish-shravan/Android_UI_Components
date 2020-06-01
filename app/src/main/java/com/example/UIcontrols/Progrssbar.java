package com.example.UIcontrols;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

public class Progrssbar extends AppCompatActivity {

    public int progressStatus = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_progrssbar );

        final ProgressBar progressBar = findViewById ( R.id.progressbar );
        Button start = findViewById ( R.id.btn );
        final Handler handler = new Handler (  );

        start.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View view) {
                new Thread ( new Runnable () {
                    @Override
                    public void run() {
                        while(progressStatus < 100)
                        {
                            progressStatus +=10;

                            handler.post ( new Runnable () {
                                @Override
                                public void run() {
                                    progressBar.setProgress ( progressStatus );
                                    if(progressStatus == 100)
                                    {
                                        progressBar.setProgress ( progressStatus );
                                        Toast.makeText ( Progrssbar.this, "Download Complete", Toast.LENGTH_SHORT ).show ();
                                    }
                                }
                            } );

                            try {
                                Thread.sleep ( 1000 );
                            } catch (InterruptedException e) {
                                e.printStackTrace ();
                            }
                        }
                    }
                } ).start ();
            }
        } );
    }
}
