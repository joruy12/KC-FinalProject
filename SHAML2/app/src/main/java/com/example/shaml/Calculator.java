package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
   public CardView aladbyca,alalmica;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        aladbyca=findViewById(R.id.aladbyca);
        alalmica=findViewById(R.id.alalmica);

        aladbyca.setOnClickListener(this);
        alalmica.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        Intent intent;

        switch (view.getId()){
            case  R.id.aladbyca:
                intent = new Intent(this,aladbyCalculator.class);
                startActivity(intent);
                break;


            case R.id.alalmica:
                intent = new Intent(this,alalmiCalculator.class);
                startActivity(intent);
                break;

        }
    }
}