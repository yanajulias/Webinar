package com.example.webinar;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class BuahAdapter extends RecyclerView.Adapter<BuahAdapter.BuahViewHolder> {

    private ArrayList<Buah> listBuah;
    private Context context;


    public BuahAdapter(ArrayList<Buah> buahArrayList, Context context) {
        this.listBuah = buahArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public BuahAdapter.BuahViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.recycler_buah, parent, false);
        return new BuahViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BuahAdapter.BuahViewHolder holder, int position) {
        holder.gbrBuah.setImageResource(listBuah.get(position).getGbrBuah());
        holder.txtBuah.setText(listBuah.get(position).getNamaBuah());
    }

    @Override
    public int getItemCount() {
        return listBuah.size();
    }

    public class BuahViewHolder extends RecyclerView.ViewHolder {

        TextView txtBuah;
        ImageView gbrBuah;

        public BuahViewHolder(@NonNull View itemView) {
            super(itemView);

            txtBuah = itemView.findViewById(R.id.text_gambar);
            gbrBuah = itemView.findViewById(R.id.gambar);

        }
    }
}
