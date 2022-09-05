package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class alalmiCalculator extends AppCompatActivity {
    EditText alahsa2 ,quraan2 ,aslameh2 ,arbc2 ,english2 ,sport2 ,hasoob2 ,dstor2 ,gographa2 ,hstory2,franc2 ,phloso2 ,totaal2 ,nasbaa2 ,totala2 ;
    Button calcolet,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alalmi_calculator);

        alahsa2 = findViewById(R.id.alahsa2);
        quraan2 = findViewById(R.id.quraan);
        aslameh2 = findViewById(R.id.aslameah2);
        arbc2 = findViewById(R.id.arabc2);
        english2= findViewById(R.id.english2);
        sport2= findViewById(R.id.sport2);
        hasoob2= findViewById(R.id.hasob2);
        dstor2= findViewById(R.id.dstor2);
        gographa2= findViewById(R.id.gographa2);
        hstory2= findViewById(R.id.hstory2);
        phloso2= findViewById(R.id.pholosofy2);
        totaal2= findViewById(R.id.totaal);
        nasbaa2= findViewById(R.id.nasba);
        totala2=findViewById(R.id.total2);


        calcolet= findViewById(R.id.button22);
        reset= findViewById(R.id.resetbtn2);

        calcolet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                markcal();

            }
        });
       reset.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               reset();
           }
       });

    }
    public void markcal()
    {
        int   alahsa,quraan,aslameh,arbc,english,sport,hasoob,dstor,gographa,hstory,franc,phloso,tot2;
        double nasba2,total;

        alahsa = Integer.parseInt(alahsa2.getText().toString());
        quraan = Integer.parseInt(quraan2.getText().toString());
        aslameh = Integer.parseInt(aslameh2.getText().toString());
        arbc = Integer.parseInt(arbc2.getText().toString());
        english = Integer.parseInt(english2.getText().toString());
        sport= Integer.parseInt(sport2.getText().toString());
        hasoob = Integer.parseInt(hasoob2.getText().toString());
        dstor= Integer.parseInt(dstor2.getText().toString());
        gographa = Integer.parseInt(gographa2.getText().toString());
        hstory= Integer.parseInt(hstory2.getText().toString());
        phloso= Integer.parseInt(phloso2.getText().toString());

        tot2 = alahsa+quraan+aslameh+arbc+english+sport+hasoob+dstor+gographa+hstory+phloso;


        totaal2.setText(String.valueOf(tot2));

        nasba2 = tot2*100;

        nasbaa2.setText(String.valueOf(nasba2));

        total = nasba2/620;

        totala2.setText(String.valueOf(total));


    }
    public void reset()
    {
        alahsa2.setText("");
        quraan2.setText("");
        aslameh2.setText("");
        arbc2.setText("");
        english2.setText("");
        sport2.setText("");
        hasoob2.setText("");
        dstor2.setText("");
        gographa2.setText("");
        hstory2.setText("");
        phloso2.setText("");
        totaal2.setText("");
        nasbaa2.setText("");
        totala2.setText("");
        alahsa2.requestFocus();


    }
}