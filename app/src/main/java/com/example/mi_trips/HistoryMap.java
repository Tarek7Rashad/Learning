package com.example.mi_trips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.view.View;

public class HistoryMap extends AppCompatActivity {
    DrawerLayout mDrawerLayout;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_history_map );
        mDrawerLayout = findViewById ( R.id.drawer_layout );
    }
    public void ClickMenu( View view){
        Upcoming.openDrawer(mDrawerLayout);
    }
    public void ClickLogo(View view){
        Upcoming.closeDrawer ( mDrawerLayout );
    }
    public void ClickHome(View view){
        Upcoming.redirectActivity ( this,Upcoming.class);
    }
    public void ClickDashboard(View view){
        Upcoming.redirectActivity ( this,HistoryMap.class );

    }
    public void ClickAboutUs(View view){
        recreate ();

    }
    public void ClickLogout(View view){
        Upcoming.logout ( this );
    }

    @Override
    protected void onPause ( ) {
        super.onPause ();
        Upcoming.closeDrawer ( mDrawerLayout );
    }
}