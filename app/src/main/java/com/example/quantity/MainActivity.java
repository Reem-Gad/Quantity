package com.example.quantity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int quantity=0;
    TextView textquan,textprice;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textprice=findViewById(R.id.te_price);
        textquan=findViewById(R.id.zero);
    }
    public void plus(View view) {
        quantity++;
        textquan.setText(""+ quantity);
    }


    public void minus(View view) {
        quantity--;
        if(quantity==-1){

            quantity=0;
        }
        textquan.setText(""+quantity);
    }

    public void order(View view) {
        textprice.setText(quantity*10 +"");
    }

    }


