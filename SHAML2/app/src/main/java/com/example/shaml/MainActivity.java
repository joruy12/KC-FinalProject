package com.example.shaml;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView aladby1,alalmi2,tips3,quiz4,Calculator5;
    ImageSlider imageSlider;
    Button btnCall;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aladby1= findViewById(R.id.aladby);
        alalmi2= findViewById(R.id.al3lmy);
          tips3= findViewById(R.id.tipsCardView);
          quiz4= findViewById(R.id.quiz);
         Calculator5 = findViewById(R.id.Calculator);
          btnCall= findViewById(R.id.callbtn);

          MaterialToolbar toolbar = findViewById(R.id.topAppbar);
          DrawerLayout drawerLayout = findViewById(R.id.drawer_layoyt);
          NavigationView navigationView = findViewById(R.id.navigation_view);

        imageSlider = findViewById(R.id.image_slider);


        ArrayList<SlideModel> arrayList= new ArrayList<>();

        arrayList.add( new SlideModel(R.drawable.imageslider1, ScaleTypes.FIT));
        arrayList.add( new SlideModel(R.drawable.imageslider2, ScaleTypes.FIT));
        arrayList.add( new SlideModel(R.drawable.imageslider3, ScaleTypes.FIT));
        arrayList.add( new SlideModel(R.drawable.imageslider4, ScaleTypes.FIT));

        imageSlider.setImageList(arrayList);

        aladby1.setOnClickListener(this);
         alalmi2.setOnClickListener(this);
         tips3.setOnClickListener(this);
         quiz4.setOnClickListener(this);
         Calculator5.setOnClickListener(this);


         btnCall.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                  Intent intent = new Intent(Intent.ACTION_DIAL);
                  intent.setData(Uri.parse("tel:+96596000000"));
                  startActivity(intent);



                 Toast.makeText(MainActivity.this, "سوف يتم تحويلك للتواصل معنا", Toast.LENGTH_LONG).show();
             }
         });

         toolbar.setNavigationOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {

                 drawerLayout.openDrawer(GravityCompat.START);

             }
         });

         navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
             @Override
             public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                 int id = item.getItemId();
                 item.setChecked(true);
                 drawerLayout.closeDrawer(GravityCompat.START);
                 switch (id){
                     case R.id.nav_aboutshaml:
                      startActivity(new Intent(MainActivity.this,AboutActivity.class));
                      break;
                     case R.id.nav_add:
                         startActivity(new Intent(MainActivity.this,AddlistActivity.class));
                    break;
                     case R.id.nav_share:
                         Toast.makeText(MainActivity.this,"شكرا لمشاركة تطبيقنا",Toast.LENGTH_SHORT).show();break;
                     case R.id.nav_rate:
                         Toast.makeText(MainActivity.this,"شكرا للتقييم",Toast.LENGTH_SHORT).show();break;
                     default:
                         return true;


                 }

                return true;
             }
         });
    }

    @Override
    public void onClick(View view) {
        Intent intent;
        switch (view.getId()){
            case R.id.aladby:
                intent=new Intent(this,aladby.class);
                startActivity(intent);
                break;


            case R.id.al3lmy:
                intent= new Intent(this,alalmi.class);
                startActivity(intent);
                break;

            case R.id.tipsCardView:
                intent= new Intent(this,tips.class);
                startActivity(intent);
                break;

            case R.id.quiz:
                intent= new Intent(this,Quiz.class);
                startActivity(intent);
                break;

            case R.id.Calculator:
                intent= new Intent(this,Calculator.class);
                startActivity(intent);
                break;

        }

    }



}