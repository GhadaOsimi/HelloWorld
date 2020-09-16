package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     Button b ;
     EditText e ;
     TextView textView8 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b = (Button) findViewById(R.id.bv);
        e = (EditText) findViewById(R.id.pn);
        textView8 = (TextView) findViewById(R.id.textView2);

        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String s = e.getText().toString();
                textView8.setText("hello; " + s);
            }
        });


    }


}