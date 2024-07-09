package com.example.krisaproject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;


import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class ColorChange extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_color_change);
        Toolbar toolbar = findViewById(R.id.tool); // Initialize the Toolbar
        setSupportActionBar(toolbar);

        Intent myintent = getIntent();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater  m = getMenuInflater();
        m.inflate(R.menu.minemenu, menu);

        MenuItem redItem = menu.findItem(R.id.action_red);
        redItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                onOptionsItemSelected(item);
                return true;
            }
        });
        MenuItem greenItem = menu.findItem(R.id.action_green);
        greenItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                onOptionsItemSelected(item);
                return true;
            }
        });

        MenuItem yellowItem = menu.findItem(R.id.action_yellow);
        yellowItem.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                onOptionsItemSelected(item);
                return true;
            }
        });
        return true;

        }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_red) {
            changeLayoutColor(Color.RED);
            return true;
        } else if (id == R.id.action_green) {
            changeLayoutColor(Color.GREEN);
            return true;
        } else if (id == R.id.action_yellow) {
            changeLayoutColor(Color.YELLOW);
            return true;
        } else {
            return super.onOptionsItemSelected(item);
        }
    }
    private void changeLayoutColor(int color) {
        View view = findViewById(R.id.ChangeColor);
        view.setBackgroundColor(color);
    }
}