package com.nixart.tasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter<Fruit> {
    private LayoutInflater inflater;
    private int layout;
    private ArrayList<Fruit> productList;
    CustomAdapter(Context context, int resource, ArrayList<Fruit> products) {
        super(context, resource, products);
        this.productList = products;
        this.layout = resource;
        this.inflater = LayoutInflater.from(context);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        final ViewHolder viewHolder;
        if(convertView==null){
            convertView = inflater.inflate(this.layout, parent, false);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        }
        else{
            viewHolder = (ViewHolder) convertView.getTag();
        }
        final Fruit fruit = productList.get(position);

        viewHolder.nameView.setText(fruit.getName());
        viewHolder.countView.setText(formatValue(fruit.getCount(), fruit.getUnit()));

        viewHolder.removeButton.setOnClickListener(v -> {
            int count = fruit.getCount()-1;
            if(count<0) count=0;
            fruit.setCount(count);
            viewHolder.countView.setText(formatValue(count, fruit.getUnit()));
        });
        viewHolder.addButton.setOnClickListener(v -> {
            int count = fruit.getCount()+1;
            fruit.setCount(count);
            viewHolder.countView.setText(formatValue(count, fruit.getUnit()));
        });

        return convertView;
    }
    private String formatValue(int count, String unit){
        return count + " " + unit;
    }

    private class ViewHolder {
        final Button addButton, removeButton;
        final TextView nameView, countView;
        ViewHolder(View view){
            addButton = view.findViewById(R.id.addButton);
            removeButton = view.findViewById(R.id.removeButton);
            nameView = view.findViewById(R.id.nameView);
            countView = view.findViewById(R.id.countView);
        }
    }
}
