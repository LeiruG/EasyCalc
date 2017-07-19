package com.gelves.uriel.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add,subtract,clear,multiply,divide,exit;
    TextView result;
    EditText boxA,boxB;

    float resultV; int numA,numB;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result = (TextView)findViewById(R.id.result);

        boxA = (EditText)findViewById(R.id.numA);
        boxB = (EditText)findViewById(R.id.numB);

        add = (Button)findViewById(R.id.btnadd);
        subtract = (Button)findViewById(R.id.btnsubtract);
        clear = (Button)findViewById(R.id.btnclear);
        multiply = (Button)findViewById(R.id.btnmultiply);
        divide = (Button)findViewById(R.id.btndivide);
        exit = (Button)findViewById(R.id.btnexit);

        if(boxA.getText().toString().length()==0) {
            boxA.setError("Input is required.");
        };
        if(boxB.getText().toString().length()==0) {
            boxB.setError("Input is required.");
        };


        add.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numA = Integer.parseInt(boxA.getText().toString());
                numB = Integer.parseInt(boxB.getText().toString());
                resultV = numA + numB;
                result.setText(String.valueOf(resultV));

            }});
        subtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numA = Integer.parseInt(boxA.getText().toString());
                numB = Integer.parseInt(boxB.getText().toString());
                resultV = numA - numB;
                result.setText(String.valueOf(resultV));

            }});
        multiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numA = Integer.parseInt(boxA.getText().toString());
                numB = Integer.parseInt(boxB.getText().toString());
                resultV = numA * numB;
                result.setText(String.valueOf(resultV));

            }});
        divide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numA = Integer.parseInt(boxA.getText().toString());
                numB = Integer.parseInt(boxB.getText().toString());
                resultV = numA / numB;
                result.setText(String.valueOf(resultV));

            }});
        clear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                boxA.setText(String.valueOf(""));
                boxB.setText(String.valueOf(""));
                result.setText(String.valueOf(0));
            }});
        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                moveTaskToBack(true);
                android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);
            }});
    }


}
