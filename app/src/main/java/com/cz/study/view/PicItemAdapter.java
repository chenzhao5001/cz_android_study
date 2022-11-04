package com.cz.study.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.cz.study.R;
import java.util.List;



public class PicItemAdapter extends BaseAdapter {
    static class ViewHolder{
        ImageView img;
        TextView txt;
    }

    List<PicData> mPicDataList = null;
    Context mContext = null;
    public PicItemAdapter(List<PicData> dataList, Context context) {
        mPicDataList = dataList;
        mContext = context;
    }

    @Override
    public int getCount() {
        return mPicDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder = null;
        if(convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);
            holder = new ViewHolder();
            holder.img = (ImageView) convertView.findViewById(R.id.item_img);
            holder.txt = (TextView) convertView.findViewById(R.id.item_txt);
            convertView.setTag(holder);   //将Holder存储到convertView中
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        Glide.with(mContext).load(mPicDataList.get(position).mPicSrc).into(holder.img);
        holder.txt.setText(mPicDataList.get(position).mContent);
        return convertView;
    }
}

