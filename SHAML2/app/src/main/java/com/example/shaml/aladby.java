package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class aladby extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aladby);
        Button btnlaw = findViewById(R.id.btnLaw);
        Button btnphilosophy = findViewById(R.id.btnPhilosophy);


        btnlaw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,LawFragment.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });


        // fragments for philosophy
        btnphilosophy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.fragmentContainerView2,PhilosophyFragment.class,null).setReorderingAllowed(true).addToBackStack("name").commit();
            }
        });
    }
}