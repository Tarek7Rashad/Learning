package com.example.mi_trips;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class add_trip extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    private Spinner mSpinner;
    Button mButton;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_add_trip );
         getDrawable ( R.drawable.animation );
         mSpinner = findViewById ( R.id.spinner );
         mButton = findViewById ( R.id.signupbutton );
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource ( this, R.array.directions, android.R.layout.simple_spinner_item );
         adapter.setDropDownViewResource ( android.R.layout.simple_spinner_item );
         mSpinner.setAdapter ( adapter );
         mSpinner.setOnItemSelectedListener ( this );

         mButton.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick ( View v ) {
                Intent intent = new Intent (add_trip.this,
                        Upcoming.class);
                startActivity ( intent );
            }
        } );
    }

    @Override
    public void onItemSelected ( AdapterView<?> parent, View view, int i, long id ) {
//        String choise = adapterView.getItemAtPosition(i).toStaring();
//        Toast.makeText (getApplicationContext (),choise,Toast.LENGTH_LONG).show ();
    }

    @Override
    public void onNothingSelected ( AdapterView<?> parent ) {

    }
}