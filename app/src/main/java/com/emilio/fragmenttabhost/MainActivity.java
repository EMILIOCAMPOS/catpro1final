package com.emilio.fragmenttabhost;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText et_valor1, et_valor2;
    private RadioButton rb_sum, rb_rest, rb_mul, rb_div;
    private TextView tv_result;
    Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_valor1 = (EditText) findViewById(R.id.txt_valor1);
        et_valor2 = (EditText) findViewById(R.id.txt_valor2);
        rb_sum = (RadioButton) findViewById(R.id.rb_sumar);
        rb_rest = (RadioButton) findViewById(R.id.rb_restar);
        rb_mul = (RadioButton) findViewById(R.id.rb_producto);
        rb_div = (RadioButton) findViewById(R.id.rb_division);
        tv_result = (TextView) findViewById(R.id.tv_resultado);
        btncalcular = findViewById(R.id.button);
        btncalcular.setOnClickListener(new View.OnClickListener() {

            public void onClick(View view) {
                String valor1_string = et_valor1.getText().toString();
                String valor2_string = et_valor2.getText().toString();

                int valor1_int = Integer.parseInt(valor1_string);
                int valor2_int = Integer.parseInt(valor2_string);

                if (rb_sum.isChecked() == true) {
                    int suma = valor1_int + valor2_int;
                    String resultado = String.valueOf(suma);
                    tv_result.setText(resultado);
                }else if (rb_rest.isChecked() == true) {
                    int resta = valor1_int - valor2_int;
                    String resultado = String.valueOf(resta);
                    tv_result.setText(resultado);
                }else if (rb_mul.isChecked() == true) {
                    int multiplicacion = valor1_int * valor2_int;
                    String resultado = String.valueOf(multiplicacion);
                    tv_result.setText(resultado);
                }else if(rb_div.isChecked() == true){

                    if(valor2_int != 0){
                        int division = valor1_int / valor2_int;
                        String resultado = String.valueOf(division);
                        tv_result.setText(resultado);
                    } else {

                    }


                }

            }
        });


    }
}