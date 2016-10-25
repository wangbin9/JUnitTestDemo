package com.feicuiedu.junittestdemo.espressoTest;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.feicuiedu.junittestdemo.R;

public class EspressoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_espresso);
    }

    public void sayHello(View v){
        TextView textView = (TextView) findViewById(R.id.textView);
        EditText editText = (EditText) findViewById(R.id.editText);
        textView.setText("Hello, " + editText.getText().toString() + "!");
    }
}
