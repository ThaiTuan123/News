/*
 * Copyright Text :
 * Created by Tuan on 4/3/22, 7:38 PM
 *  Copyright (c) 2022 . All rights reserved.
 *  Last modified 4/3/22, 6:49 PM
 */

package com.example.news.base;

import android.view.View;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseAdapter<T, VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    private List<T> mData = new ArrayList<>();
    public ClickListener<T> mListener;

    public BaseAdapter(ClickListener<T> mListener) {
        this.mListener = mListener;
    }

    @Override
    public int getItemCount() {
        return mData.size();
    }

    public void setData(List<T> newData) {
        mData.clear();
        mData.addAll(newData);
        notifyDataSetChanged();
    }

    public void appendData(List<T> newData) {
        int prevSize = mData.size();
        mData.addAll(newData);
        notifyItemRangeInserted(prevSize, newData.size());
    }

    public void removeItem(int position) {
        mData.remove(position);
        notifyItemRemoved(position);
    }

    public T getItem(int position) {
        if (position < 0 || position >= mData.size()) {
            return null;
        } else {
            return mData.get(position);
        }
    }

    public interface ClickListener<T> {
        void onItemClick(View view, T item, int position);
    }
}
