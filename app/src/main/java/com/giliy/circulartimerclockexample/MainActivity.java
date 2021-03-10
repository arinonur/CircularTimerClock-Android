package com.giliy.circulartimerclockexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import giliy.com.circulartimerclock.CircularSliderView;
import giliy.com.circulartimerclock.CircularTimerClock;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CircularTimerClock clock = (CircularTimerClock) findViewById(R.id.circular_clock);
        clock.setStartHour(20);
        clock.setEndHour(23);

        System.out.println("startT: " + clock.getStartHour());
        System.out.println("endd: " + clock.getEndHour());
        clock.getOnFocusChangeListener();
        clock.scrollTo(10,10);
        CircularSliderView circularSliderView = new CircularSliderView(this, attrs, defStyleAttr);
        circularSliderView.setStartHourAngle();
        clock.setOnTimeChangedListener(new CircularTimerClock.ontTimeChanged() {
            @Override
            public void onStartTimeChange(String time, int hour, int minutes, boolean isAM) {
                Log.d("start time: ",""+time);
            }

            @Override
            public void onEndTimeChange(String time, int hour, int minutes, boolean isAM) {
                Log.d("end time: ",""+time);
            }
        });

    }
}
