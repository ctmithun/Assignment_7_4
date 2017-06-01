package com.billionman.com.assignment_7_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AfterLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);
        Intent intent = getIntent();
        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("Welcome " + intent.getStringExtra("userName")) ;
    }
}
