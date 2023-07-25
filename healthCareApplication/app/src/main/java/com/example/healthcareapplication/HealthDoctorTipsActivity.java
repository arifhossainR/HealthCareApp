package com.example.healthcareapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class HealthDoctorTipsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health_doctor_tips);

        CardView walking = findViewById(R.id.cardWalking);
        walking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HealthDoctorTipsActivity.this, HealthDoctorWalkingActivity.class));
            }
        });

        CardView covid = findViewById(R.id.cardCovid);
        covid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HealthDoctorTipsActivity.this, HealthDoctorCovidActivity.class));
            }
        });

        CardView smoking = findViewById(R.id.cardSmoking);
        smoking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HealthDoctorTipsActivity.this, HealthDoctorSmokingActivity.class));
            }
        });

        CardView healthyGut = findViewById(R.id.cardHealthyGut);
        healthyGut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(HealthDoctorTipsActivity.this, HealthDoctorHealthyGutActivity.class));
            }
        });

    }
}