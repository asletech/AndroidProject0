package com.example.android.androidproject0;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String BUTTON_TEXT_PREFIX = "This button will launch my ";
    private static final String BUTTON_TEXT_SUFFIX =  " app!";
    private static final String HELP_TEXT = "Please Click a Button";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
    * Processes a button click event and display's a customized message based on the Text of the button
     *  @param v default view object
     * */
    public void onClick(View v){
        if(v instanceof Button) {
            Button b = (Button) v;
            String buttonText = b.getText().toString();
            buttonText = BUTTON_TEXT_PREFIX + buttonText + BUTTON_TEXT_SUFFIX;
            Toast.makeText(MainActivity.this, buttonText, Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this,HELP_TEXT , Toast.LENGTH_SHORT).show();
        }
    }
}