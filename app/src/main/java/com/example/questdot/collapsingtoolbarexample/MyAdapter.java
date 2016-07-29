package com.example.questdot.collapsingtoolbarexample;

import android.support.v7.widget.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by HP on 10/5/2016.
 */
class MyAdapter extends RecyclerView.Adapter {

    class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tv;

        public ViewHolder(TextView textView) {
            super(textView);
            tv = textView;
        }

        public TextView getTv() {
            return tv;
        }
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(new TextView(parent.getContext()));
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        ViewHolder vh = (ViewHolder) holder;
        vh.getTv().setText("Item " + position);
    }

    @Override
    public int getItemCount() {
        return 100;
    }
}
