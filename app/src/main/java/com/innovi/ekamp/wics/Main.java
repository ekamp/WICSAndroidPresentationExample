package com.innovi.ekamp.wics;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main extends Activity {

    private TextView counter;
    private Button increment, reset;
    private int currentCount = 0;

    /**
     * Function that inflates and sets the content view for the main activity for this application.
     *
     * @param savedInstanceState instance bundle passed in to preserve state.
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        counter = (TextView) findViewById(R.id.counter_view);
        increment = (Button) findViewById(R.id.incrementing_button);
        reset = (Button) findViewById(R.id.reset_button);
        setListener();
    }

    /**
     * Binds the Button to its corresponding onClick listener.
     */
    private void setListener() {
        if (increment != null) {
            increment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    incrementCounter();
                }
            });
        }
        if (reset != null) {
            reset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    resetCounter();
                }
            });
        }
    }

    /**
     * Helper function used to increment the counter and counter TextView
     */
    private void incrementCounter() {
        if (counter != null) {
            currentCount++;
            counter.setText(Integer.toString(currentCount));
        }
    }

    /**
     * Helper function used to reset the counter and the counter TextView
     */
    private void resetCounter() {
        if (counter != null) {
            currentCount = 0;
            counter.setText(Integer.toString(currentCount));
        }
    }
}
