package com.billionman.com.assignment_7_4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void login(android.view.View view) {
        EditText username = (EditText) findViewById(R.id.editText);
        EditText psw = (EditText) findViewById(R.id.editText2);
        System.out.println("----------------" + username.getText().toString() + "------------psw--" + psw.getText().toString());
        if("".equals(username.getText().toString()) || "".equals(psw.getText().toString())) {
            Toast.makeText(getApplicationContext(),"Username/psw is mandatory",Toast.LENGTH_LONG).show();
        } else {
            String userNameData = String.valueOf(username.getText());
            Intent intent = new Intent(MainActivity.this, AfterLoginActivity.class);
            intent.putExtra("userName", userNameData);
            intent.setAction(Intent.ACTION_SEND);
            intent.setType("type/plain");
            this.startActivity(intent);
        }
    }
}
