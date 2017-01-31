package com.nasreldinaid.caasera;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


  TextView LoginName;
  CheckBox chBoxStayLoggedin;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    LoginName = (EditText) findViewById(R.id.LoginName);
    chBoxStayLoggedin = (CheckBox) findViewById(R.id.chBoxStayLoggedin);
  }

  public void btnLoginonClick(View v) {
    Log.i("Click", "Button wes clicked!");
    Log.i("Click", LoginName.getText().toString());
    Toast.makeText(this, "Welcome to Caasera, We have succesfuly Logged in." +
        LoginName.getText().toString() + " " +
        chBoxStayLoggedin.getText().toString(), Toast.LENGTH_LONG).show();
    startActivity(new Intent(this, Landing.class));
  }
  public void btnCancelOnClick(View v){
    Log.e("Click", "Login was Canceled!");
  }

  public void SwitchToBmiOncClick(View v) {
    startActivity(new Intent(this, MBIActivity.class));
  }
}
