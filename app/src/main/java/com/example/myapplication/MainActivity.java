package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addBtn = (Button) findViewById(R.id.addBtn);
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText firstNumEditTect = (EditText) findViewById(R.id.firstNumEditText);
                EditText seNumEditTect = (EditText) findViewById(R.id.secNumEditText);
                TextView resultTextView = (TextView) findViewById(R.id.resultTextView);

                int num1 = Integer.parseInt(firstNumEditTect.getText().toString());
                int num2 = Integer.parseInt(seNumEditTect.getText().toString());
                int res = num1+num2;
                resultTextView.setText(res+"");
            }
        });
    }
}
