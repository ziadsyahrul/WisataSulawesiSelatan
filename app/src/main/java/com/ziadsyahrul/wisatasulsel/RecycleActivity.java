package com.ziadsyahrul.wisatasulsel;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Adapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    //TODO 1 mengenerate butterknife untuk recycleview
    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    //TODO 2 membuat variable array untuk menampung data nama,detail dan gambar dari String Array pada
    String[] namaWisata;
    String[] detailWisata;
    int[] gambarWisata;

    com.ziadsyahrul.wisatasulsel.Adapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        //TODO 3 Mengisi variable array dari folder -> Strings,drawable
        namaWisata = getResources().getStringArray(R.array.wisata_name);
        detailWisata = getResources().getStringArray(R.array.detail_wisata);
        gambarWisata = new int[]{R.drawable.pantai_losari, R.drawable.takabonerate, R.drawable.taman_nasional_bantimurung, R.drawable.pantai_tanjung_bira, R.drawable.pulau_samalona, R.drawable.pemandian_air_panas_lejja, R.drawable.benteng_somba_opu, R.drawable.pantai_appalarang};

        //TODO 4 Membuat object adpater dan mengirim data nama,detail dan gambar ke adapter
        adapter = new com.ziadsyahrul.wisatasulsel.Adapter(RecycleActivity.this, gambarWisata, namaWisata, detailWisata);
        //TODO 5 Mensetting recyclerview dan mengeset recycleview dengan adapter
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter((RecyclerView.Adapter) adapter);

    }
}