package com.example.shaml;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class tips extends AppCompatActivity {
         private ViewPager viewPager;
        private SlideAdapter myadapter;
        private Button NextBtn;
        private int  nCurrentPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        NextBtn = (Button) findViewById(R.id.nextBtn);
        viewPager =  (ViewPager) findViewById(R.id.viewpager);
        myadapter = new SlideAdapter(this);
        viewPager.setAdapter(myadapter);


        NextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewPager.setCurrentItem(nCurrentPage +1);
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

                    NextBtn.setText("Next");

                }else if (i == 2){
                    NextBtn.setEnabled(true);
                    NextBtn.setText("finish");
                }

            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        };
    }
}