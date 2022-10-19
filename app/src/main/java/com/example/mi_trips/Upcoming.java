package com.example.mi_trips;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Upcoming extends AppCompatActivity {
    DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_upcoming );
        mDrawerLayout = findViewById ( R.id.drawer_layout );
//        NavigationView navigationView = findViewById ( R.id.na )

    }
    public void ClickMenu( View view){
        openDrawer(mDrawerLayout);
    }

    public static void openDrawer ( DrawerLayout drawerLayout ) {
        drawerLayout.openDrawer ( GravityCompat.START );

    }
    public void ClickLogo( View view ){
        closeDrawer(mDrawerLayout);
    }

    public static void closeDrawer ( DrawerLayout drawerLayout ) {
        if (drawerLayout.isDrawerOpen ( GravityCompat.START )){
            drawerLayout.closeDrawer ( GravityCompat.START );
        }
    }

    public void ClickUpcoming ( View view){
        recreate ();
    }

    public void ClickHistory ( View view){
        redirectActivity(this,History.class);
    }
    public void ClickHistoryMap ( View view){
        redirectActivity ( this,HistoryMap.class);
    }
    public void ClickSignout ( View view){
        Signout (this);
    }

    public static void Signout ( Activity activity ) {
        AlertDialog.Builder builder = new AlertDialog.Builder ( activity );
        builder.setTitle ( "Signout" );
        builder.setMessage ( "Are You Sure You Want To Sign out ?" );
        builder.setPositiveButton ( "Yes", new DialogInterface.OnClickListener () {
            @Override
            public void onClick ( DialogInterface dialog, int which ) {
                activity.finishAffinity ();
                System.exit ( 0 );
            }
        } );
        builder.setNegativeButton ( "No", new DialogInterface.OnClickListener () {
            @Override
            public void onClick ( DialogInterface dialog, int which ) {
                dialog.dismiss ();
            }
        } );
        builder.show ();
    }

    public static void redirectActivity ( Activity activity,Class aClass  ) {
        Intent intent = new Intent (activity,aClass);
        intent.setFlags ( Intent.FLAG_ACTIVITY_NEW_TASK );
        activity.startActivity ( intent );
    }

    @Override
    protected void onPause ( ) {
        super.onPause ();
        closeDrawer ( mDrawerLayout );
    }

//    @Override
//    public boolean onOptionsItemSelected ( @NonNull MenuItem item ) {
//        return super.onOptionsItemSelected (  );
//    }
}