package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class tips extends AppCompatActivity {
         private ViewPager viewPager;
        private SlideAdapter myadapter;
        private Button NextBtn;
        private Button BackBtn;
        private int  nCurrentPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        NextBtn = (Button) findViewById(R.id.nextBtn);
       BackBtn = (Button) findViewById(R.id.prevBtn);

        viewPager =  (ViewPager) findViewById(R.id.viewpager);


        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);


        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(nCurrentPage + +1);


            }
        });
BackBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        viewPager.setCurrentItem(nCurrentPage - 1);
    }
});

        ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int il) {

            }

            @Override
            public void onPageSelected(int i) {

                nCurrentPage = i;
                if (i == 0){
                    NextBtn.setEnabled(true);
                    BackBtn.setEnabled(false);
                    BackBtn.setVisibility(View.INVISIBLE);

                    NextBtn.setText("Next");
                    BackBtn.setText("");

                }else if (i == 2){

                    NextBtn.setEnabled(true);
                    BackBtn.setEnabled(true);
                    BackBtn.setVisibility(View.VISIBLE);

                    NextBtn.setText("finish");
                    BackBtn.setText("Back");
                }else {
                    NextBtn.setEnabled(true);
                    BackBtn.setEnabled(true);
                    BackBtn.setVisibility(View.VISIBLE);

                    NextBtn.setText("Next");
                    BackBtn.setText("Back");


                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };
    }
}