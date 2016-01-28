package com.nano.kunal.portfolio;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        /*
        The six buttons are assigned touch handlers below,
        this can be done using arrays to store references to button and iterating over a for loop,
        but they are done separately to allow addition of different code to each listener
        like using intents to start an app in the future.
         */

        //Add toast to the spotify button
        Button spotifyButton = (Button) findViewById(R.id.spotifyButton);
        spotifyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.spotify_streamer_toast, Toast.LENGTH_SHORT).show();
            }
        });

        //Add toast to Football Scores Button
        Button scoresButton = (Button) findViewById(R.id.scoresButton);
        scoresButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.scores_button_toast, Toast.LENGTH_SHORT).show();
            }
        });

        //Add toast to Library App Button
        Button libraryButton = (Button) findViewById(R.id.libraryButton);
        libraryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.library_app_toast, Toast.LENGTH_SHORT).show();
            }
        });

        //Add toast to Bigger App
        Button biggerButton = (Button) findViewById(R.id.buildButton);
        biggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.build_it_bigger_app_toast, Toast.LENGTH_SHORT).show();
            }
        });

        //Add toast to XYZ Reader
        Button readerButton = (Button) findViewById(R.id.readerButton);
        readerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.xyz_reader_toast, Toast.LENGTH_SHORT).show();
            }
        });

        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);
        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, R.string.capstone_app_toast, Toast.LENGTH_SHORT).show();
            }
        });
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
}
