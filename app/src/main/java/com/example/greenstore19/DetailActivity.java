package com.example.greenstore19;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    TextView ShopDescription;
    ImageView ShopImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ShopImage=(ImageView)findViewById(R.id.ivImage2);
        ShopDescription=(TextView)findViewById(R.id.txtDescription);

Bundle mBundle =getIntent().getExtras();
if(mBundle!=null){
    ShopDescription.setText(mBundle.getString("Description"));
    //ShopImage.setImageResource(mBundle.getInt("Image"));
    Glide.with(this)
            .load(mBundle.getString("Image"))
            .into(ShopImage);
}

    }
}
