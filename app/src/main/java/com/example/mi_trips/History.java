package com.example.mi_trips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class History extends AppCompatActivity {
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_history );
        mDrawerLayout = findViewById ( R.id.drawer_layout );

    }
    public void ClickMenu( View view){
        Upcoming.openDrawer(mDrawerLayout);
    }
    public void ClickLogo(View view){
        Upcoming.closeDrawer ( mDrawerLayout );
    }
    public void ClickUpcoming(View view){
        Upcoming.redirectActivity ( this,Upcoming.class);
    }
    public void ClickHistory(View view){
        recreate ();
    }
    public void ClickHistoryMap(View view){
        Upcoming.redirectActivity ( this,HistoryMap.class );
    }
    public void ClickSignout(View view){
        Upcoming.Signout ( this );
    }

    @Override
    protected void onPause ( ) {
        super.onPause ();
        Upcoming.closeDrawer ( mDrawerLayout );
    }
}