package com.nasreldinaid.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView LoginName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginName = (EditText) findViewById(R.id.LoginName);
    }

    public void btnLoginonClick(View v) {
        Log.i("Click", "Button wes clicked!");
        Log.i("Click", LoginName.getText().toString());
        Toast.makeText(this, "Welcome to Caasera, We have succesfuly Logged in.", Toast.LENGTH_LONG).show();
    }
}
