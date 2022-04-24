package com.example.sp20_bse_067_assi_2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText editTop;
//        TextView tvTop;
        Button btnone,btntwo,btnthree,btnfour,btnfive,btnsix,btnseven,btneight,btnnine,btnzero,btnback,btnopen;

        editTop = findViewById(R.id.editTop);
        btnone = findViewById(R.id.one);
        btntwo = findViewById(R.id.two);
        btnthree = findViewById(R.id.three);
        btnfour = findViewById(R.id.four);
        btnfive = findViewById(R.id.five);
        btnsix = findViewById(R.id.six);
        btnseven = findViewById(R.id.seven);
        btneight = findViewById(R.id.eight);
        btnnine = findViewById(R.id.nine);
        btnzero = findViewById(R.id.zero);
        btnback = findViewById(R.id.back);
        btnopen = findViewById(R.id.open);


        btnone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "1");

            }
        });

        btntwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "2");

            }
        });

        btnthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "3");

            }
        });
        btnfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "4");

            }
        });
        btnfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "5");

            }
        });
        btnsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "6");

            }
        });
        btnseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "7");

            }
        });
        btneight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "8");

            }
        });
        btnnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "9");

            }
        });

        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editTop.setText(editTop.getText() + "0");

            }
        });
        btnback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int length = editTop.getText().length();
                if (length > 0) {
                    editTop.getText().delete(length - 1, length);
                }
            }
        });
        btnopen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user_password = editTop.getText().toString();
                String key_value = "1234";
                if(user_password.equals(key_value)){
                    Toast.makeText(MainActivity.this,"UnLocked..",Toast.LENGTH_LONG).show();
                    Intent gotowelcomeScreen = new Intent(MainActivity.this,welcome_screen.class);
                    startActivity(gotowelcomeScreen);
                }else{
                    Toast.makeText(MainActivity.this,"Wrong Key"+ user_password,Toast.LENGTH_LONG).show();
                }

            }
        });


    }
}