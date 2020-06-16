package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;
    private TextView tv1;
    private EditText et_trigonometrica;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.et1);
        et2=(EditText)findViewById(R.id.et2);
        tv1=(TextView)findViewById(R.id.tv1);
        et_trigonometrica=(EditText)findViewById(R.id.et_trigonometrica);



    }
    /*OPERACIONES BASICAS SUMA, RESTA MULTIPLICACION, DIVISION*/
    public void Sumar(View view ){
    String valor1=et1.getText().toString();
    String valor2=et2.getText().toString();
    int n1=Integer.parseInt(valor1);
    int n2=Integer.parseInt(valor2);
    int total=n1+n2;
    String res=String.valueOf(total);
    tv1.setText(res);
    }

    public void resta(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int total=n1-n2;
        String res=String.valueOf(total);
        tv1.setText(res);

    }

    public void multi(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        int total=n1*n2;
        String res=String.valueOf(total);
        tv1.setText(res);

    }

    public void division(View view){
        String valor1=et1.getText().toString();
        String valor2=et2.getText().toString();
        int n1=Integer.parseInt(valor1);
        int n2=Integer.parseInt(valor2);
        float total=n1/n2;
        String res=String.valueOf(total);
        tv1.setText(res);
    }
        /*OPERACIONES TRIGONOMETRICAS*/

    public void sen(View view){

            String valor3=et_trigonometrica.getText().toString();
            int angulo=Integer.parseInt(valor3);
            //double res=Math.sin(angulo*Math.PI/180);
            double res=Math.sin(angulo*2.0*Math.PI/360.0);
            String total=String.valueOf(res);
            tv1.setText(total);
        }

    public void cos(View view){

        String valor3=et_trigonometrica.getText().toString();
        int angulo=Integer.parseInt(valor3);
        double res=Math.cos(angulo*2.0*Math.PI/360.0);
        String total=String.valueOf(res);
        tv1.setText(total);
    }


    public void tan(View view){

        String valor3=et_trigonometrica.getText().toString();
        int angulo=Integer.parseInt(valor3);
        //double res=(Math.tan(angulo*Math.PI/180))/(Math.cos(angulo*2.0*Math.PI/360));
        double res=Math.tan(angulo*2.0*Math.PI/360.0);
        String total=String.valueOf(res);
        tv1.setText(total);

    }


}