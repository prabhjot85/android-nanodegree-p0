package com.example.prabh.appportfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void spotifyStreamLauncher(View view) {
        Toast.makeText(getApplicationContext(), R.string.spotifyMessage, Toast.LENGTH_SHORT).show();
    }

    public void scoresAppLauncher(View view) {
        Toast.makeText(getApplicationContext(), R.string.scoreAppMessage, Toast.LENGTH_SHORT).show();
    }

    public void xyzReaderLauncher(View view) {
        Toast.makeText(getApplicationContext(), R.string.xyzReaderMessage, Toast.LENGTH_SHORT).show();
    }

    public void capstoneLauncher(View view) {
        Toast.makeText(getApplicationContext(), R.string.capstoneMessage, Toast.LENGTH_SHORT).show();
    }

    public void libraryAppLauncher(View view) {
        Toast.makeText(getApplicationContext(), R.string.libraryMessage, Toast.LENGTH_SHORT).show();
    }

    public void buildBiggerLauncher(View view) {
        Toast.makeText(getApplicationContext(), R.string.buildBiggerMessage, Toast.LENGTH_SHORT).show();
    }
}
