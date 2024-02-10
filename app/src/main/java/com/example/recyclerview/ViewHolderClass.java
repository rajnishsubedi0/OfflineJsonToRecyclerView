package com.example.recyclerview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolderClass extends RecyclerView.ViewHolder {
    TextView textView;
    public ViewHolderClass(@NonNull View itemView) {
        super(itemView);
        textView=itemView.findViewById(R.id.textView_recyclerView);
    }
}
