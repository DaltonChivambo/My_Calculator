package com.sky.ink.mycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private  Button [] button_number = new Button[10];

    private Button bt_score, bt_addition, bt_subtraction, bt_multiplication, bt_division, bt_equal, bt_clear;

    private TextView tv_expression, tv_result;
    private ImageView iv_backspace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();
        initComponents();
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
}