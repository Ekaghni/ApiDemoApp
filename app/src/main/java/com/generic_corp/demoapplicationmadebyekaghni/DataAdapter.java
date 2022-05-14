package com.generic_corp.demoapplicationmadebyekaghni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {
    private ArrayList<model_for_outer_data> arrayList;

    public DataAdapter(ArrayList<model_for_outer_data> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.title_tv_trial.setText(arrayList.get(position).getEmployee_name());
        holder.rating_trial.setText(arrayList.get(position).getId());
        holder.overview_tv_trial.setText(arrayList.get(position).getEmployee_salary());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title_tv_trial,rating_trial,overview_tv_trial;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title_tv_trial = (TextView)itemView.findViewById(R.id.title_tv_trial);
            rating_trial = (TextView)itemView.findViewById(R.id.rating_trial);
            overview_tv_trial = (TextView)itemView.findViewById(R.id.overview_tv_trial);
        }
    }
}
