package com.nasreldinaid.caasera;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Toast;

/**
 * Created by nasre on 2/6/2017.
 */

public class BaseActivity extends AppCompatActivity {
  public GestureDetectorCompat gestureObject;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    gestureObject = new GestureDetectorCompat(this, new MBIActivity.LearnGesture());
  }

  @Override
  public boolean onTouchEvent(MotionEvent event) {
    this.gestureObject.onTouchEvent(event);
    return super.onTouchEvent(event);
  }

  public void Toastlt(String message) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show();
  }

  class LearnGesture extends GestureDetector.SimpleOnGestureListener {
    @Override
    public boolean onFling(MotionEvent event1, MotionEvent event2, float velocityX, float velocityY) {
      Log.i("BMI", "X: " + event1.getX() + "Y: " + event1.getY());
      Log.i("BMI", "X: " + event2.getX() + "Y: " + event2.getY());
      Log.i("BMI", "VelocityX: " + velocityX);
      Log.i("BMI", "VelocityY: " + velocityY);
      if (event2.getX() > event1.getX()) {
        //   startActivity(new Intent(new Intent(MBIActivity.this, MainActivity.class)));
      } else if (event2.getX() < event1.getX()) {
        // finish();
        //  startActivity(new Intent(MBIActivity.this, Landing.class));

      }
      return true;
    }
  }

}

