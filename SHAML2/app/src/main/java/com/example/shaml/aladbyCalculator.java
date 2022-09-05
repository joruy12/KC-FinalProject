package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class aladbyCalculator extends AppCompatActivity {

    EditText alahsa,quraan,aslameh,arbc,english,sport,hasoob,dstor,gographa,hstory,franc,phloso,totaal,nasbaa,totala;
    Button calcolet,reset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aladby_calculator);

        alahsa= findViewById(R.id.alahsa);
          quraan= findViewById(R.id.alquraan);
          aslameh= findViewById(R.id.aslameah);
          arbc= findViewById(R.id.arabc);
          english= findViewById(R.id.english);
         sport= findViewById(R.id.sport);
         hasoob= findViewById(R.id.hasob);
        dstor= findViewById(R.id.dstor);
         gographa= findViewById(R.id.gographa);
         hstory= findViewById(R.id.hstory);
          franc= findViewById(R.id.franc80);
         phloso= findViewById(R.id.pholosofy);
         totaal= findViewById(R.id.totaal2);
          nasbaa= findViewById(R.id.nasba2);
          totala=findViewById(R.id.total);


           calcolet= findViewById(R.id.button22);
          reset= findViewById(R.id.resetbtn);

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
       int   alahsa40,quraan20,aslameh40,arbc80,english80,sport20,hasoob20,dstor20,gographa80,hstory80,franc80,phloso60,tot;
       double nasba,total;

       alahsa40 = Integer.parseInt(alahsa.getText().toString());
       quraan20 = Integer.parseInt(quraan.getText().toString());
        aslameh40 = Integer.parseInt(aslameh.getText().toString());
        arbc80 = Integer.parseInt(arbc.getText().toString());
        english80 = Integer.parseInt(english.getText().toString());
        sport20 = Integer.parseInt(sport.getText().toString());
        hasoob20 = Integer.parseInt(hasoob.getText().toString());
        dstor20 = Integer.parseInt(dstor.getText().toString());
        gographa80 = Integer.parseInt(gographa.getText().toString());
        hstory80 = Integer.parseInt(hstory.getText().toString());
        franc80 = Integer.parseInt(franc.getText().toString());
        phloso60 = Integer.parseInt(phloso.getText().toString());

        tot = alahsa40+quraan20+aslameh40+arbc80+english80+sport20+hasoob20+dstor20+gographa80+hstory80+franc80+phloso60;


        totaal.setText(String.valueOf(tot));

        nasba = tot*100;

        nasbaa.setText(String.valueOf(nasba));

        total = nasba/620;

        totala.setText(String.valueOf(total));











    }
    public void reset()
    {
        alahsa.setText("");
         quraan.setText("");
         aslameh.setText("");
         arbc.setText("");
         english.setText("");
         sport.setText("");
         hasoob.setText("");
         dstor.setText("");
         gographa.setText("");
         hstory.setText("");
         franc.setText("");
         phloso.setText("");
         totaal.setText("");
         nasbaa.setText("");
         totala.setText("");
         alahsa.requestFocus();


    }

}