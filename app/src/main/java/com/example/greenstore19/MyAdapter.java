package com.example.greenstore19;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ShopViewHolder> {

    private Context mContext;
    private List<ShopData> myShopList;

    public MyAdapter(Context mContext, List<ShopData> myShopList) {
        this.mContext = mContext;
        this.myShopList = myShopList;
    }

    @NonNull
    @Override
    public ShopViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View mView = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_row_item, parent, false);


        return new ShopViewHolder(mView);
    }

    @Override
    public void onBindViewHolder(@NonNull final ShopViewHolder holder, int position) {
        holder.imageView.setImageResource(myShopList.get(position).getShopImage());
        holder.mtitle.setText(myShopList.get(position).getShopName());
        holder.mDescription.setText(myShopList.get(position).getShopDescription());
        holder.mAddress.setText(myShopList.get(position).getShopAddress());

   holder.mCardView.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           Intent intent=new Intent(mContext,DetailActivity.class);
           intent.putExtra("Image",myShopList.get(holder.getAdapterPosition()).getShopImage());
           intent.putExtra("Description",myShopList.get(holder.getAdapterPosition()).getShopDescription());
           mContext.startActivity(intent);
       }
   });

    }

    @Override
    public int getItemCount() {
        return myShopList.size();
    }
}


class ShopViewHolder extends RecyclerView.ViewHolder {

    ImageView imageView;
    TextView mtitle, mDescription, mAddress;
    CardView mCardView;


    public ShopViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.ivImage);
        mtitle = itemView.findViewById(R.id.tvTitlle);
        mDescription = itemView.findViewById(R.id.tvDescription);
        mAddress = itemView.findViewById(R.id.tvAddress);

        mCardView = itemView.findViewById(R.id.myCardView);
    }
}
