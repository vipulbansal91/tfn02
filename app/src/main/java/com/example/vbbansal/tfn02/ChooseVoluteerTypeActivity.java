package com.example.vbbansal.tfn02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ChooseVoluteerTypeActivity extends AppCompatActivity {

    static String VOLUNTEER_NAME = "VOLUNTEER_NAME";
    static String VOLUNTEER_CONTACT_NUMBER = "VOLUNTEER_CONTACT_NUMBER";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_voluteer_type);
    }

    public void showHospitalityVoluteerInfo(View view) {
        Intent intent = new Intent(this, DisplayVolunteerInfoActivity.class);
        intent.putExtra(VOLUNTEER_NAME, "Sridhar");
        intent.putExtra(VOLUNTEER_CONTACT_NUMBER, "123456789");
        startActivity(intent);
    }
}
