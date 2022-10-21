package com.sky.ink.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private  Button [] button_number = new Button[10];

    private Button bt_score, bt_addition, bt_subtraction, bt_multiplication, bt_division, bt_equal, bt_clear;

    private TextView tv_expression, tv_result;
    private ImageView iv_backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initComponents();
        Objects.requireNonNull(getSupportActionBar()).hide();

        button_number[0].setOnClickListener(this);
        button_number[1].setOnClickListener(this);
        button_number[2].setOnClickListener(this);
        button_number[3].setOnClickListener(this);
        button_number[4].setOnClickListener(this);
        button_number[5].setOnClickListener(this);
        button_number[6].setOnClickListener(this);
        button_number[7].setOnClickListener(this);
        button_number[8].setOnClickListener(this);
        button_number[9].setOnClickListener(this);
        bt_score.setOnClickListener(this);
        bt_addition.setOnClickListener(this);
        bt_subtraction.setOnClickListener(this);
        bt_multiplication.setOnClickListener(this);
        bt_division.setOnClickListener(this);

        bt_clear.setOnClickListener(view -> {
            tv_expression.setText("");
            tv_result.setText("");
        });

        iv_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView return_expression = findViewById(R.id.tv_expression);
                String string = return_expression.getText().toString();

                if(!string.isEmpty()){
                    byte var0 = 0;
                    int var1 = string.length()-1;

                    //substring needs var0 for don't have error on the App
                    String expression = string.substring(var0,var1);
                    return_expression.setText(expression);
                }
                tv_result.setText("");
            }
        });

    }

    private void initComponents(){
       button_number[0] = findViewById(R.id.bt_zero);
       button_number[1] = findViewById(R.id.bt_one);
       button_number[2] = findViewById(R.id.bt_two);
       button_number[3] = findViewById(R.id.bt_three);
       button_number[4] = findViewById(R.id.bt_four);
       button_number[5] = findViewById(R.id.bt_five);
       button_number[6] = findViewById(R.id.bt_six);
       button_number[7] = findViewById(R.id.bt_seven);
       button_number[8] = findViewById(R.id.bt_eight);
       button_number[9] = findViewById(R.id.bt_nine);


       bt_score = findViewById(R.id.bt_score);
       bt_addition = findViewById(R.id.bt_addition);
       bt_subtraction = findViewById(R.id.bt_subtraction);
       bt_multiplication = findViewById(R.id.bt_multiplication);
       bt_division = findViewById(R.id.bt_division);
       bt_equal = findViewById(R.id.bt_equal);
       bt_clear = findViewById(R.id.bt_clear);

       tv_expression = findViewById(R.id.tv_expression);
       tv_result = findViewById(R.id.tv_result);

       iv_backspace = findViewById(R.id.iv_backspace);
    }

    public void concatExpression(String s, boolean clean_data){

        if (tv_result.getText().equals("")){
            tv_expression.setText("");
        }

        if (clean_data){
            tv_result.setText("");
            tv_expression.append(s);
        }else{
            tv_expression.append(tv_result.getText());
            tv_expression.append(s);
            tv_result.setText("");
        }
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.bt_zero: concatExpression("0",true); break;
            case R.id.bt_one: concatExpression("1",true); break;
            case R.id.bt_two: concatExpression("2",true); break;
            case R.id.bt_three: concatExpression("3",true); break;
            case R.id.bt_four: concatExpression("4",true); break;
            case R.id.bt_five: concatExpression("5",true); break;
            case R.id.bt_six: concatExpression("6",true); break;
            case R.id.bt_seven: concatExpression("7",true); break;
            case R.id.bt_eight: concatExpression("8",true); break;
            case R.id.bt_nine: concatExpression("9",true); break;
            case R.id.bt_score: concatExpression(".",true); break;
            case R.id.bt_addition: concatExpression("+",false); break;
            case R.id.bt_subtraction: concatExpression("-",false); break;
            case R.id.bt_multiplication: concatExpression("*",false); break;
            case R.id.bt_division: concatExpression("/",false); break;


        }

    }
}