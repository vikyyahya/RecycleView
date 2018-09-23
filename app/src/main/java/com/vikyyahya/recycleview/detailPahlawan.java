package com.vikyyahya.recycleview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class detailPahlawan extends AppCompatActivity {
    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailpahlawan);
        this.setTitle("Detail Pahlawan");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Pahlawan pahlawanterimadata = getIntent().getParcelableExtra("key");

        ImageView gmb_detail = findViewById(R.id.img_foto_detail);
        TextView nama_detail = findViewById(R.id.tv_nama_detail);
        TextView remark_detail = findViewById(R.id.tv_remark_detail);
        TextView dskr_detail = findViewById(R.id.tv_deskripsi);
        TextView lahir_detail = findViewById(R.id.tv_Lahir);
        TextView wafat_detail = findViewById(R.id.tv_Wafat);

        Glide.with(this)
                .load(pahlawanterimadata.getFoto())
                .override(350,550)
                .into(gmb_detail);
        nama_detail.setText(pahlawanterimadata.getName());
        remark_detail.setText(pahlawanterimadata.getRemark());
        dskr_detail.setText(pahlawanterimadata.getDetail());
        lahir_detail.setText(pahlawanterimadata.getTglLahir());
        wafat_detail.setText(pahlawanterimadata.getTglWafat());
    }
}
