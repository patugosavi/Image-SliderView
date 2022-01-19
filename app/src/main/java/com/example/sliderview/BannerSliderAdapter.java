package com.example.sliderview;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class BannerSliderAdapter extends SliderViewAdapter<BannerSliderAdapter.BannerSliderViewHolder> {
    //list for storing urls of images.
    private final List<SliderItem> mSliderItems;


    public BannerSliderAdapter(Context context, List<SliderItem> mSliderItems) {
        this.mSliderItems = mSliderItems;
    }



    @Override
    public BannerSliderViewHolder onCreateViewHolder(ViewGroup parent) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.image_slider_layout_item, null);
        return new BannerSliderViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(BannerSliderAdapter.BannerSliderViewHolder viewHolder, int position) {
        final SliderItem sliderItem = mSliderItems.get(position);

        //Glide is use to load image from url in your imageview.
        Glide.with(viewHolder.itemView)
                .load(sliderItem.getImgUrl())
                .fitCenter()
                .into(viewHolder.imageViewBackground);

    }

    @Override
    public int getCount() {
        return mSliderItems.size();
    }

    public class BannerSliderViewHolder extends ViewHolder {
        ImageView imageViewBackground;


        public BannerSliderViewHolder(View itemView) {
            super(itemView);
            imageViewBackground = itemView.findViewById(R.id.myimage);
        }
    }
}
