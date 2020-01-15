package com.example.drawingwithandroid;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

public class MainMenu extends AppCompatActivity {
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
        if (id == R.id.joc) {
            Intent intent = new Intent(this, MyViewObjectActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.joc_touch) {
            Intent intent = new Intent(this, MyCanvasActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.joc_bola) {
            Intent intent = new Intent(this, MyBallActivity.class);
            startActivity(intent);
            return true;
        }


        return super.onOptionsItemSelected(item);
    }
}
