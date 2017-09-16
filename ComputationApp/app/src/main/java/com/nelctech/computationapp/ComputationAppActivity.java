package com.nelctech.computationapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class ComputationAppActivity extends AppCompatActivity {

    private Computation computation = new Computation();

    private EditText mFirstNumEditText;
    private EditText mSecondNumEditText;
    private EditText mThirdNumEditText;
    private TextView mDisplayResult;
    private Button mButtonCompute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_computation_app);

        mFirstNumEditText = (EditText) findViewById(R.id.firstNumEditText);
        mSecondNumEditText = (EditText) findViewById(R.id.secondNumEditText);
        mThirdNumEditText = (EditText) findViewById(R.id.thirdNumEditText);
        mDisplayResult = (TextView) findViewById(R.id.displayResultViewText);

        mButtonCompute = (Button) findViewById(R.id.computeButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a = Integer.parseInt(mFirstNumEditText.getText().toString());
                int b = Integer.parseInt(mSecondNumEditText.getText().toString());
                int c = Integer.parseInt(mThirdNumEditText.getText().toString());

                String result = computation.add(a, b, c);

                mDisplayResult.setText(result);

            }
        };

        mButtonCompute.setOnClickListener(listener);

    }
}
