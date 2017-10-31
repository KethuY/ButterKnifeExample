package com.c2s.butterknifesample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by satya on 29-Oct-17.
 */

public class MyAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<Title> mTitles;
    LayoutInflater mLayoutInflater;

    public MyAdapter(Context context, ArrayList<Title> titles) {
        this.mContext = context;
        this.mTitles = titles;
        mLayoutInflater= (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }


    @Override
    public int getCount() {
        return mTitles.size();
    }

    @Override
    public Title getItem(int i) {
        return mTitles.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override public View getView(int position, View view, ViewGroup parent) {
        ViewHolder holder;
        if (view != null) {
            holder = (ViewHolder) view.getTag();
        } else {
            view = mLayoutInflater.inflate(R.layout.item, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        }

        holder.name.setText(mTitles.get(position).getName());
        holder.jobTitle.setText(mTitles.get(position).getTitle());

        return view;
    }

    private static class ViewHolder {
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.title) TextView jobTitle;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}