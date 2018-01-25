package com.example.vbbansal.tfn02;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showChooseVoluteerType(View view) {
        Intent intent = new Intent(this, ChooseVoluteerTypeActivity.class);
        startActivity(intent);
    }

    public void showDayOneInfo(View view) {
        Intent intent = new Intent(this, ShowDayInfoActivity.class);
        startActivity(intent);
    }
}
