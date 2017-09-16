package com.nelctech.funfacts;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class FunFactsActivity extends AppCompatActivity {

    // Declare our view variables
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private TextView mFactTextView;
    private Button mShowFactButton;
    private RelativeLayout relativeLayout;
    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel = new ColorWheel();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Assign to Views from the layout files to the corresponding variables
        this.mFactTextView = (TextView) findViewById(R.id.factTextView);
        this.mShowFactButton = (Button) findViewById(R.id.showFactButton);
        this.relativeLayout = (RelativeLayout) findViewById(R.id.funFactRelativeLayout);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactBook.getFact();

                // update the screen with our new fact
                mFactTextView.setText(fact);

                int color = mColorWheel.getColor();

                relativeLayout.setBackgroundColor(color);
                mShowFactButton.setTextColor(color);
            }
        };

        mShowFactButton.setOnClickListener(listener);

//        Toast.makeText(this, "Yay! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We are logging from the onCreate() method!");

    }

}
