package com.example.routeapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class coursesAdapter extends RecyclerView.Adapter<coursesAdapter.courseViewHolder>{
    List<coursesData>items;
    coursesAdapter(List<coursesData> items){this.items=items;
    }

    @NonNull
    @Override
    public courseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(
                parent.getContext()
        ).inflate(R.layout.courses_layout,parent,false);
        courseViewHolder viewHolder = new courseViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull courseViewHolder holder, int position) {
        coursesData item= items.get(position);
        holder.courseImg.setImageResource(item.courseImage);
        holder.courseName.setText(item.courseName);
        holder.coursehrs.setText(item.courseHrs);
    }

    @Override
    public int getItemCount() {
        return items==null? 0 : items.size();
    }

    class courseViewHolder extends RecyclerView.ViewHolder{

        TextView courseName;
        TextView coursehrs;
        ImageView courseImg;

        public courseViewHolder(@NonNull View itemView) {
            super(itemView);
            courseName=itemView.findViewById(R.id.courseTitle);
            coursehrs=itemView.findViewById(R.id.courseHours);
            courseImg=itemView.findViewById(R.id.courseImage);

        }
    }




}
