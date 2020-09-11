package com.estate.realestate;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class facilities extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facilities);
        this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        getSupportActionBar().setTitle("   Facilities by Us ");
        getSupportActionBar().setHomeButtonEnabled(true);
        //Toast.makeText(this, "Fcailities ", Toast.LENGTH_SHORT).show();
    }
}
