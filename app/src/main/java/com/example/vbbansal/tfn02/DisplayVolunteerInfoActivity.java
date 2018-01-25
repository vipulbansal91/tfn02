package com.example.vbbansal.tfn02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayVolunteerInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_volunteer_info);

        Intent intent = getIntent();
        String volunteerName = intent.getStringExtra(ChooseVoluteerTypeActivity.VOLUNTEER_NAME);
        String volunteerContactNumber = intent.getStringExtra(ChooseVoluteerTypeActivity.VOLUNTEER_CONTACT_NUMBER);

        TextView nameTextView = findViewById(R.id.textView);
        nameTextView.setText(volunteerName);

        TextView contactNumberTextView = findViewById(R.id.textView2);
        contactNumberTextView.setText(volunteerContactNumber);

    }
}
