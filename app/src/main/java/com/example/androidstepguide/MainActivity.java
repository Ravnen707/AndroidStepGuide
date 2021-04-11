package com.example.androidstepguide;

import androidx.appcompat.app.AppCompatActivity;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);


    }


    @SuppressLint("WrongConstant")
    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
        mCount++;
        if(mShowCount != null)
            mShowCount.setText(Integer.toString(mCount)); //Made it so you can count with the toast or without the toast. just cuz i wanted too.
                                                            // - Andreas K. Ravn

        ImageView iv = (ImageView) findViewById(R.id.pointup);
        iv.setVisibility(view.VISIBLE);
        ImageView iv1 = (ImageView) findViewById(R.id.pointdown);
        iv1.setVisibility(view.VISIBLE);

        ImageView iv2 = (ImageView) findViewById(R.id.pointleft);
        iv2.setVisibility(view.INVISIBLE);
        ImageView iv3 = (ImageView) findViewById(R.id.pointright);
        iv3.setVisibility(view.INVISIBLE);
        // Just had the urge to play with pictures and the counting and wanted too see how it worked
        // in android studioes. Compared to showing specific pictures on one click and other on another click
        // - Andreas K. Ravn
    }

//      try {        toast.show();
  //          Thread.sleep(1500);
  //      } catch (InterruptedException e) {
  //          e.printStackTrace();
  //      }
  //    Wanted to see if Threading worked the same in inteliJ as in here, and it did as expected.
    // - Andreas K. Ravn



    public void countUp(View view) {
        mCount++;
        if(mShowCount != null)
                        mShowCount.setText(Integer.toString(mCount));
        // IT WORKS YAY
        // - Andreas K. Ravn

        ImageView iv = (ImageView) findViewById(R.id.pointleft);
        iv.setVisibility(view.VISIBLE);
        ImageView iv1 = (ImageView) findViewById(R.id.pointright);
        iv1.setVisibility(view.VISIBLE);

        ImageView iv2 = (ImageView) findViewById(R.id.pointup);
        iv2.setVisibility(view.INVISIBLE);
        ImageView iv3 = (ImageView) findViewById(R.id.pointdown);
        iv3.setVisibility(view.INVISIBLE);
        // Just had the urge to play with pictures and the counting and wanted too see how it worked
        // in android studioes. Compared to showing specific pictures on one click and other on another click
        // - Andreas K. Ravn
    }
}