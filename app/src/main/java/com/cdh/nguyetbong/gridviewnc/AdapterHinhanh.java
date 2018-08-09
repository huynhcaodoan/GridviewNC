package com.cdh.nguyetbong.gridviewnc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AdapterHinhanh extends BaseAdapter {

    private Context context;
    private int layout;
    private List<HinhAnh> hinhAnhList;

    public AdapterHinhanh(Context context, int layout, List<HinhAnh> hinhAnhList) {
        this.context = context;
        this.layout = layout;
        this.hinhAnhList = hinhAnhList;
    }

    @Override
    public int getCount() {
        return hinhAnhList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    private class ViewHolder{
        ImageView imghinh;
        TextView textView;

    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(layout,null);
            holder.imghinh = (ImageView) view.findViewById(R.id.image);
            holder.textView = (TextView) view.findViewById(R.id.txt01);
            view.setTag(holder);
        }else {
            holder = (ViewHolder) view.getTag();
        }
        HinhAnh hinhAnh = hinhAnhList.get(i);
        holder.imghinh.setImageResource(hinhAnh.getHinhAnh());
        holder.textView.setText(hinhAnh.getTen());

        return view;
    }
}
