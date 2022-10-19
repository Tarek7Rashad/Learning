package com.example.mi_trips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView havenotaccount;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        TextView havenotaccount = findViewById ( R.id.havenotaccount );
        havenotaccount.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent (MainActivity.this,
                        Register1.class);
                startActivity ( intent );
            }
        } );
    }
}