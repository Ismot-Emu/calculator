package edu.bd.ewu.cse489_quiz1_calculator;


import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {

    TextView textTV1;
    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn_dot;
    Button btn_sum, btn_sub, btn_mul, btn_div, btn_clear, btn_delete;
    boolean newOp=true;

    ////private TextView display;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @SuppressLint("SetTextI18n")
    public void btnClick(View view) {

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn_dot = findViewById(R.id.btn_dot);
        btn_sum = findViewById(R.id.btn_sum);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mul = findViewById(R.id.btn_mul);
        btn_div = findViewById(R.id.btn_div);
        textTV1 = findViewById(R.id.texTV1);
        btn_clear = findViewById(R.id.btn_clear);
        btn_delete = findViewById(R.id.btn_delete);

        if(newOp) {
            textTV1.setText("");
            newOp = false;

            btn0.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "0"));
            btn1.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "1"));
            btn2.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "2"));
            btn3.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "3"));
            btn4.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "4"));
            btn5.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "5"));
            btn6.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "6"));
            btn7.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "7"));
            btn8.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "8"));
            btn9.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "9"));
            btn_sum.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "+"));
            btn_sub.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "-"));
            btn_mul.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "x"));
            btn_div.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "/"));
            btn_dot.setOnClickListener(v -> textTV1.setText(textTV1.getText() + "."));
            btn_clear.setOnClickListener(v -> textTV1.setText(textTV1.getText()));
            btn_delete.setOnClickListener(v -> textTV1.setText(textTV1.getText()));

        }
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String clear;
                clear = textTV1.getText().toString();
                clear = "";
                textTV1.setText(clear);
            }
        });
        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String d = textTV1.getText().toString();
                if (d.length() != 0) {
                    d = d.substring(0, d.length() - 1);
                    textTV1.setText(d);

                }
            }
        });


    }
}