package com.example.shaml;

import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.transition.Slide;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class SlideAdapter extends PagerAdapter {
Context context;
 LayoutInflater inflater;

 // list of images
    public int [] lst_images = {
            R.drawable.photo1,
         R.drawable.photo2,
         R.drawable.photo3
 };
    // list of titles
    public String [] lst_title ={
            "الاصرار للنجاح",
            "العمل بجد وتنظيم الوقت",
            "تحقيق الاحلام"
    };
    // list of description
    public String[] lst_description = {
            "النجاح لا يتحقق إلا بالإصرار، وعدم التوقف عن محاولة التقدم والتطور، وعدم الاستسلام للفشل أو اليأس والإحباط، وليس عيباً أن تسقط، ولكن العيب أن تركن إلى السقوط. أما الإصرار فيمكن تلخيصه في مواصلة الجهد والعمل الدائم لتحقيق هدف ما، دون الاستسلام حتى يتحقق النجاح.",
            "العمل بجد هو وسيلتك الوحيدة التي تساعدك في طريقك إلى النجاح، فمهما كنت موهوبا لن تصل إلى شيء يذكر إذا افتقدت الاجتهاد في عملك،و لا يخفى عن أحد أن الكفاءة في العمل قد تكون أهم من العمل نفسه ولكي تحقق هذه الكفاءة لا بد من تنظيم الوقت واستغلاله بطريقة صحيحة و لا تنسى التوكل على الله قبل كل شى ،ويمكنك الاستعانه ببعض التطبيقات لتنظيم وقتك او فقط نظم وقتك بورقة وقلم وركز على تحديد الأهداف والتخطيط المسبق. تحديد الأولويات. القيام بالعمل في أفضل الأوقات المناسبة لك. تحديد مهلة لكل عمل عليك القيام به. وبذلك تنظم وقتك بالطريقة الصحيحة.",
    "لكل إنسان أحلامه الخاصة التي يتمنّى ويسعى لتحقيقها في أسرع وقتٍ ممكن، ولكي تنجح في تحقيق كل أحلامك التي تتمناها عليك ان تبذل كل جهدك ساعيًا لتحقيق احلامك ، ماتدري من الممكن اليوم اشتد عليك التعب من الدراسة وغداً تكون في وظيفة احلامك لذلك احترص على اختيار التخصص الذي يناسبك ويحقق لك احلامك"
    };
    // list of bg colors
    public  int [] lst_backgroundcolor ={
            Color.rgb(0, 0, 128),
            Color.rgb(45,89,134),
            Color.rgb(134,45,89)
    };

public SlideAdapter(Context context){
    this.context = context;
}

    @Override
    public int getCount() {
        return lst_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view==(LinearLayout)object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater = (LayoutInflater)  context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide,container,false);
        LinearLayout layoutslide = view.findViewById(R.id.slidelinearlayout);
        ImageView imgslide = (ImageView)   view.findViewById(R.id.slideimg);
        TextView txttitle = (TextView) view.findViewById(R.id.txttitle);
        TextView descrpition = (TextView) view.findViewById(R.id.txtdescription);
        layoutslide.setBackgroundColor(lst_backgroundcolor[position]);
        imgslide.setImageResource(lst_images[position]);
        txttitle.setText(lst_title[position]);
        descrpition.setText(lst_description[position]);
        container.addView(view);
        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
container.removeView((LinearLayout)object);
    }
}
