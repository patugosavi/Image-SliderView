package com.example.sliderview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    SliderView sliderView;
     BannerSliderAdapter adapter;

     Context mContext;

    List<SliderItem>sliderItemList=new ArrayList<>();

    String url1="https://personalexpo.pythonanywhere.com/media/project_images/Img2_None_2.png";
    String url2="https://personalexpo.pythonanywhere.com/media/project_images/Img3_None_3.jpg";
    String url3="https://personalexpo.pythonanywhere.com/media/project_images/Img4_None_4_sdecx8h.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext=getApplicationContext();

        ArrayList<SliderItem> sliderDataArrayList = new ArrayList<>();
        SliderView sliderView = findViewById(R.id.imageSlider);
        sliderDataArrayList.add(new SliderItem(url1));
        sliderDataArrayList.add(new SliderItem(url2));
        sliderDataArrayList.add(new SliderItem(url3));
        sliderDataArrayList.add(new SliderItem(url1));
        sliderDataArrayList.add(new SliderItem(url2));
        sliderDataArrayList.add(new SliderItem(url3));
        sliderDataArrayList.add(new SliderItem(url1));
        sliderDataArrayList.add(new SliderItem(url2));
        sliderDataArrayList.add(new SliderItem(url3));
        sliderDataArrayList.add(new SliderItem(url1));
        sliderDataArrayList.add(new SliderItem(url2));
        sliderDataArrayList.add(new SliderItem(url3));


        BannerSliderAdapter adapter = new BannerSliderAdapter(this, sliderDataArrayList);
        sliderView.setAutoCycleDirection(SliderView.LAYOUT_DIRECTION_LTR);
        sliderView.setSliderAdapter(adapter);
        sliderView.setScrollTimeInSec(3);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();
    }

}
