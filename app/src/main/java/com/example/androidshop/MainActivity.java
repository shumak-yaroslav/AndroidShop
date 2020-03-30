package com.example.androidshop;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView bnv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bnv = (BottomNavigationView)findViewById(R.id.bottomNavigationView3);
        bnv.setOnNavigationItemSelectedListener(getBottomNavigationListener());
        bnv.setSelectedItemId(R.id.action_user);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener getBottomNavigationListener() {
        return new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.action_home:
                        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                        startActivity(intent);
                        break;
                }
                return true;
            }
        };


    }
}
