package com.gis.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class cal extends AppCompatActivity {
    private EditText et1;
    private EditText et2;
    private EditText et3;
    private EditText et4;
    private EditText et5;
    private TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);

        et1 = (EditText)findViewById(R.id.txt_matematicas);
        et2 = (EditText) findViewById(R.id.txt_fisica);
        et3 = (EditText) findViewById(R.id.txt_quimica);
        et4 = (EditText) findViewById(R.id.txt_fisica2);
        et5 = (EditText) findViewById(R.id.txt_quimica2);
        tv1 = (TextView) findViewById(R.id.tv_estatus);

    }

    public void estatus(View view) {
        String Matematicas_String = et1.getText().toString();
        String Fisica_String = et2.getText().toString();
        String Quimica_String = et3.getText().toString();
        String Fisica2_String = et4.getText().toString();
        String Quimica2_String = et5.getText().toString();

        int Matematicas_int = Integer.parseInt(Matematicas_String);
        int Fisica_int = Integer.parseInt(Fisica_String);
        int Quimica_int = Integer.parseInt(Quimica_String);
        int Fisica2_int = Integer.parseInt(Fisica2_String);
        int Quimica2_int = Integer.parseInt(Quimica2_String);

        int promedio=(Matematicas_int + Fisica_int + Quimica_int + Fisica2_int + Quimica2_int)/5;

        if(promedio>= 70){
            tv1.setText("Estatus Aprobado con " + promedio);
        } else if(promedio<70){
            tv1.setText("Estatus Reprobado con "+ promedio);
        }
    }

}
