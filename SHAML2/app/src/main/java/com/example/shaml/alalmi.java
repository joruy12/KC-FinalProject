package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class alalmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alalmi);
        Button btnmedicine = findViewById(R.id.btnMedicine);
          Button btnengineering = findViewById(R.id.btnEngineering);


          btnmedicine.setOnClickListener(new View.OnClickListener() {
              @Override
              public void onClick(View view) {
                  FragmentManager fragmentManager = getSupportFragmentManager();
                  fragmentManager.beginTransaction()
                          .replace(R.id.fragmentContainerView,MedicineFragment.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
              }
          });



          // fragments for engineering
        btnengineering.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView,EngineeringFragment.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });

    }
}