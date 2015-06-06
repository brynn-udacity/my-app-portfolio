package com.example.android.myappportfolio;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.content.Context;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    /** Called when the user touches button 1*/
    public void displayToast(View view, CharSequence textShort) {
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        CharSequence text = "This button will launch my " + textShort + " app!";
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void displayToast1(View view){
        CharSequence text = "Spotify Streamer";
        displayToast(view, text);
    }

    public void displayToast2(View view){
        CharSequence text = "Scores";
        displayToast(view, text);
    }

    public void displayToast3(View view){
        CharSequence text = "Library";
        displayToast(view, text);
    }

    public void displayToast4(View view){
        CharSequence text = "Build It Bigger";
        displayToast(view, text);
    }

    public void displayToast5(View view){
        CharSequence text = "XYZ Reader";
        displayToast(view, text);
    }

    public void displayToast6(View view){
        CharSequence text = "Capstone";
        displayToast(view, text);
    }

}
