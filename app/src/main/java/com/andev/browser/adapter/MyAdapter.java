package com.andev.browser.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.andev.browser.R;

import java.util.ArrayList;
import java.util.HashMap;

public class MyAdapter extends ArrayAdapter<String> {

    ArrayList<String> animalList = new ArrayList<>();

    public MyAdapter(Context context, int textViewResourceId, ArrayList<String> objects) {
        super(context, textViewResourceId, objects);
        animalList = objects;
    }

    @Override
    public int getCount() {
        return super.getCount();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = convertView;
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        v = inflater.inflate(R.layout.list_view_items, null);
        TextView textView = (TextView) v.findViewById(R.id.textView);
        ImageView imageView = (ImageView) v.findViewById(R.id.imageView);
        textView.setText(animalList.get(position).toString());

        return v;

    }

}

//package example.abhiandriod.customarrayadapterexample;
//
//
//public class Item {
//
//    String animalName;
//    int animalImage;
//
//    public Item(String animalName,int animalImage)
//    {
//        this.animalImage=animalImage;
//        this.animalName=animalName;
//    }
//    public String getAnimalName()
//    {
//        return animalName;
//    }
//    public int getAnimalImage()
//    {
//        return animalImage;
//    }
