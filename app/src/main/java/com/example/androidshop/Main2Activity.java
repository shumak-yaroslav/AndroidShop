package com.example.androidshop;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {


    private  String[] citys = {"Los Angeles","New-York"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_spinner_item,citys);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);


        Spinner spinner = (Spinner)findViewById(R.id.spCity);

        spinner.setAdapter(arrayAdapter);



    }

}
