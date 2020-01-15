package com.example.drawingwithandroid;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;

public class MyCanvasActivity extends MainMenu {
    CanvasExampleView drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        drawView = new CanvasExampleView(this);
        drawView.setBackgroundColor(Color.WHITE);
        setContentView(drawView);
    }

}
