package com.vikyyahya.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private RecyclerView rview;
private ArrayList<Pahlawan>list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.setTitle("Pahlawan Nasional");
        rview = (RecyclerView) findViewById(R.id.recview);
        rview.setHasFixedSize(true);
        list = new ArrayList<>();
        list.addAll(PahlawanData.getListData());

        showCardview();
    }

    private void showCardview(){

        rview.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter pahlawanAdapter = new PahlawanAdapter(this);
        pahlawanAdapter.setListpahlwan(list);
        rview.setAdapter(pahlawanAdapter);
    }
}
