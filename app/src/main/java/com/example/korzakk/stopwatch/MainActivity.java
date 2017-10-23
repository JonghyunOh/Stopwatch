package com.example.korzakk.stopwatch;

import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Chronometer mChrono = null;
    private Button mStartBtn = null;
    private Button mStopBtn = null;
    private Button mResetBtn = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mChrono = (Chronometer)findViewById(R.id.chrono);
        mStartBtn = (Button)findViewById(R.id.startBtnID);
        mStopBtn = (Button)findViewById(R.id.stoptBtnID);
        mResetBtn = (Button)findViewById(R.id.resetBtnID);

        mStartBtn.setOnClickListener(this);
        mStopBtn.setOnClickListener(this);
        mResetBtn.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.startBtnID:
                mChrono.setBase(SystemClock.elapsedRealtime());
                mChrono.start();
                break;
            case R.id.stoptBtnID:
                mChrono.stop();
                break;
            case R.id.resetBtnID:
                mChrono.stop();
                mChrono.setBase(SystemClock.elapsedRealtime());
                break;
        }
    }
}
