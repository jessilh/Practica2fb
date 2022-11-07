package com.example.practica2fb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadoraa extends AppCompatActivity implements View.OnClickListener {
    EditText et1, et2;
    TextView tv1;
    Button btnsumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadoraa);
        et1 = (EditText)findViewById(R.id.txt1);
        et2 = (EditText)findViewById(R.id.txt2);
        tv1 = (TextView) findViewById(R.id.txtv_resultado);
        btnsumar = (Button)findViewById(R.id.btn_suma);
        btnsumar.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        float n1, n2, res;
        n1=Float.parseFloat(et1.getText().toString());
        n2=Float.parseFloat(et2.getText().toString());
        res = n1 + n2;
        tv1.setText(""+ res);
    }
}