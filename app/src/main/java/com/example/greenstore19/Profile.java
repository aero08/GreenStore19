package com.example.greenstore19;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Profile extends AppCompatActivity {

    RecyclerView mRecyclerView;
    List<ShopData> myShopList;
    ShopData mShopData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
mRecyclerView=(RecyclerView)findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(Profile.this,1);
        mRecyclerView.setLayoutManager(gridLayoutManager);

        myShopList =new ArrayList<>();


        mShopData=new ShopData("Shop1-Sada","Onion-100 Rupees/kg\n"+"Potato-50 Rupees/kg","8982147100",R.drawable.image1);
        myShopList.add(mShopData);

        mShopData=new ShopData("Shop2-Raghogarh","Onion-100 Rupees/kg\n"+"Tomato-50 Rupees/kg","9399813200",R.drawable.image2);
        myShopList.add(mShopData);

        MyAdapter myAdapter =new MyAdapter(Profile.this,myShopList);
        mRecyclerView.setAdapter(myAdapter);
    }

}
