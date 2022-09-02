package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    public CardView aladby1,alalmi2,tips3,quiz4;
    ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aladby1= findViewById(R.id.aladby);
        alalmi2= findViewById(R.id.al3lmy);
          tips3= findViewById(R.id.tipsCardView);
          quiz4= findViewById(R.id.quiz);

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

        }

    }
}