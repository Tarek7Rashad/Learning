package com.example.mi_trips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Register1 extends AppCompatActivity {
    TextView haveEmal;
    Button mButton;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_register1 );
        TextView textView = findViewById ( R.id.haveEmail );
        mButton = findViewById ( R.id.signupbutton );
        textView.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent (Register1.this,
                        MainActivity.class);
                startActivity ( intent );
            }
        } );
        mButton.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent (Register1.this,
                        add_trip.class);
                startActivity ( intent );
            }
        } );
    }

}