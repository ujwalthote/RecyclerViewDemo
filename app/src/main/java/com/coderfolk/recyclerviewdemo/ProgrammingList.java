package com.coderfolk.recyclerviewdemo;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgrammingList extends RecyclerView.Adapter<ProgrammingList.Myviewholder> {
    String data[];

    public ProgrammingList(String data[]) {
        this.data = data;
    }

    @NonNull
    @Override
    public Myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.mylayout, parent, false);
        return new Myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Myviewholder holder, int position) {
            holder.textView.setText(data[position]);
            holder.imageView.setBackgroundResource(R.drawable.ic_launcher_foreground);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    class Myviewholder extends RecyclerView.ViewHolder {
        TextView textView;
        ImageView imageView;

        public Myviewholder(View itemView) {
            super(itemView);
            textView = (TextView) itemView.findViewById(R.id.text);
            imageView = (ImageView) itemView.findViewById(R.id.image);
        }
    }
}
