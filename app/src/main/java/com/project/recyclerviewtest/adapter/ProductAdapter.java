package com.project.recyclerviewtest.adapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.project.recyclerviewtest.R;
import com.project.recyclerviewtest.entity.ProductEntity;

import java.util.List;

/**
 * @author shaomiao
 * @Date 2017/4/6
 * @Time 16:45
 */

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {

    DisplayMetrics dm;

    private Context mContext;

    private List<ProductEntity> mDatas;

    public ProductAdapter(Context context, List<ProductEntity> data) {
        this.mContext = context;
        this.mDatas = data;

        dm = new DisplayMetrics();
        ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(dm);
    }


    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_product, parent, false);
        MyViewHolder myViewHolderw = new MyViewHolder(view);
        //动态设置ImageView的宽高，根据自己每行item数量计算
        //dm.widthPixels-dip2px(20)即屏幕宽度-左右10dp+10dp=20dp再转换为px的宽度，最后/3得到每个item的宽高
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams((dm.widthPixels - dip2px(20)) / 3, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        return myViewHolderw;
    }

    @Override
    public void onBindViewHolder(ProductAdapter.MyViewHolder holder, int position) {
        ProductEntity entity = mDatas.get(position);
        holder.productName.setText(entity.getProductName());
        holder.productPrice.setText(entity.getProductPrice());
        Glide
                .with(mContext)
                .load(entity.getProductImage())
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .crossFade()
                .into(holder.productImg);
//        holder.productImg.setImageResource(R.mipmap.ic_launcher);
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView productImg;
        TextView productName;
        TextView productPrice;

        public MyViewHolder(View itemView) {
            super(itemView);
            productImg = (ImageView) itemView.findViewById(R.id.productImg_Iv);
            productName = (TextView) itemView.findViewById(R.id.productName_Tv);
            productPrice = (TextView) itemView.findViewById(R.id.productPrice_Tv);
        }
    }


    int dip2px(float dpValue) {
        final float scale = mContext.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }
}
