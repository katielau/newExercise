package com.example.katie1.exercisenew2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText firstNumber;
    EditText secondNumber;
    TextView addResult;
    Button btnAdd;

    double num1,num2,sum;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstNumber = (EditText)findViewById(R.id.num1);
        secondNumber = (EditText)findViewById(R.id.num2);
        addResult = (TextView)findViewById(R.id.textView);
        btnAdd = (Button)findViewById(R.id.button);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // code will be here
                    num1 = Double.parseDouble(firstNumber.getText().toString());
                    num2 = Double.parseDouble(secondNumber.getText().toString());
                    sum = num1 - num2;
                    addResult.setText(Double.toString(sum));
                }
        });
    }
}
