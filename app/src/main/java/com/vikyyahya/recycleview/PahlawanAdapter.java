package com.vikyyahya.recycleview;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PahlawanAdapter extends RecyclerView.Adapter<PahlawanAdapter.PahlawanHolder> {
    private ArrayList<Pahlawan>listpahlwan;
    private Activity activity;
    private Context context;


    public PahlawanAdapter(Context context) {   //construktor
        this.context = context;
    }

    public ArrayList<Pahlawan> getListpahlwan() {
        return listpahlwan;
    }

    public void setListpahlwan(ArrayList<Pahlawan> listpahlwan) {
        this.listpahlwan = listpahlwan;
    }

    @NonNull
    @Override
    public PahlawanHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview,parent,false);
        PahlawanHolder pahlawanHolder = new PahlawanHolder(view);
        return pahlawanHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PahlawanHolder holder, int position) {
        Pahlawan p = getListpahlwan().get(position);
        Glide.with(context)
                .load(p.getFoto())
                .override(350,550)
                .into(holder.imgV);
        holder.tvName.setText(p.getName());
        holder.tvRemarks.setText(p.getRemark());
        holder.pahlawan = p ;

        holder.btnShare.setOnClickListener(new CustomOnItemClickListener(position, new CustomOnItemClickListener.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Toast.makeText(context, "Share "+ getListpahlwan().get(position).getName(), Toast.LENGTH_SHORT).show();
            }
        }));
    }

    @Override
    public int getItemCount() {
        return getListpahlwan().size();
    }
    public void startActivity(Intent intent){

    }
    public class PahlawanHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imgV;
        TextView tvName,tvRemarks;
        Button btnShare, btnDetail;
        Pahlawan pahlawan;

        public PahlawanHolder(View itemView) {
            super(itemView);
            imgV = (ImageView)itemView.findViewById(R.id.img_foto);
            tvName = itemView.findViewById(R.id.tv_nama);
            tvRemarks = itemView.findViewById(R.id.tv_remark);
            btnDetail = itemView.findViewById(R.id.btn_detail);
            btnShare = itemView.findViewById(R.id.btn_share);
            btnDetail.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context, detailPahlawan.class);
            intent.putExtra("key",pahlawan);
            context.startActivity(intent);
        }
    }

}
