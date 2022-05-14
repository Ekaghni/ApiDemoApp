package com.generic_corp.demoapplicationmadebyekaghni;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.JsonObject;

import java.util.List;

public class PostAdapter extends RecyclerView.Adapter<PostAdapter.PostViewHolder> {

    List<Post> postList;
    Context context;

    public PostAdapter(Context context,List<Post> posts){
        this.context = context;
        postList = posts;
    }

    @NonNull
    @Override
    public PostViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new PostViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PostViewHolder holder, int position) {
        //Post post = postList.get(position);
        holder.employee_name.setText(postList.get(position).getEmployee_name());
        holder.employee_id.setText(postList.get(position).getId());
        holder.salary.setText(postList.get(position).getEmployee_salary());

    }

    @Override
    public int getItemCount() {
        return postList.size();
    }

    public class PostViewHolder extends RecyclerView.ViewHolder{

        TextView employee_name, employee_id, salary;
        public PostViewHolder(@NonNull View itemView) {
            super(itemView);

            employee_name = itemView.findViewById(R.id.title_tv);
            employee_id = itemView.findViewById(R.id.rating);
            salary = itemView.findViewById(R.id.overview_tv);
        }
    }
}
