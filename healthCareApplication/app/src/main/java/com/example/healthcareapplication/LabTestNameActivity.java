package com.example.healthcareapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class LabTestNameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab_test_name);

        CardView bloodtest = findViewById(R.id.cardBloodTest);
        bloodtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestNameActivity.this, DetailsBloodTestResultActivity.class));
            }
        });

        CardView urinetest = findViewById(R.id.cardUrineTest);
        urinetest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestNameActivity.this, DetailsUrineTestResultActivity.class));
            }
        });

        CardView xraytest = findViewById(R.id.cardXrayTest);
        xraytest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestNameActivity.this, DetailsXrayTestResultActivity.class));
            }
        });

        CardView skintest = findViewById(R.id.cardSkinTest);
        skintest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LabTestNameActivity.this, DetailsSkinTestResultActivity.class));
            }
        });

    }
}