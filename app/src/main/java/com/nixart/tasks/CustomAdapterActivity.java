package com.nixart.tasks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class CustomAdapterActivity extends AppCompatActivity {

    ArrayList<Fruit> fruits = new ArrayList();
    ListView productList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_adapter);

        if(fruits.size()==0){
            fruits.add(new Fruit("Apple", "pcs."));
            fruits.add(new Fruit("Grape", "kg."));
            fruits.add(new Fruit("Mango", "pcs."));
            fruits.add(new Fruit("Juice", "litres"));
            fruits.add(new Fruit("Lime", "pcs."));
        }
        productList = (ListView) findViewById(R.id.productList);
        CustomAdapter adapter = new CustomAdapter(this, R.layout.list_item, fruits);
        productList.setAdapter(adapter);
    }
}
