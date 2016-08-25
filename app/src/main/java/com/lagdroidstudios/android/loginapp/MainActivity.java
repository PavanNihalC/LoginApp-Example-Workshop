package com.lagdroidstudios.android.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button submit = (Button) findViewById(R.id.button);
        submit.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.editText);
                EditText password = (EditText)findViewById(R.id.editText2);
                if(username.getText().toString().equals("name")&&password.getText().toString().equals("password"))
                {
                    Toast.makeText(getApplicationContext(),"Works",Toast.LENGTH_LONG).show();
                    Intent myIntent = new Intent(MainActivity.this, DataBaseActivity.class);
                    //myIntent.putExtra("key", value); //Optional parameters
                    MainActivity.this.startActivity(myIntent);
                }
            }
        });
    }
}
