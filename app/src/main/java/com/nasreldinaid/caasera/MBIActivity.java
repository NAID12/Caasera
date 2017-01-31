package com.nasreldinaid.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MBIActivity extends AppCompatActivity {
  EditText edtWeight, edtHeight;
  TextView lblBMI;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_mbi);
    edtWeight = (EditText) findViewById(R.id.edtWeight);
    edtHeight = (EditText) findViewById(R.id.edtHeight);
    lblBMI = (TextView) findViewById(R.id.lblMBI);
  }
  public void ClaculateOnClick(View v){
    Log.i("BMI", "Calculate Button was clicked");
    double height = Double.parseDouble(edtHeight.getText().toString());
    double weight  = Double.parseDouble(edtWeight.getText().toString());
    double bmi = (weight / (height * height)) * 703.0;
    lblBMI.setText(String.format("%.2f", bmi));
  }
  public void saveResultsOnClick(View v){
    Log.i("Bmi", "Saving Results.....");
  }

}
