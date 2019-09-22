package com.shafira.project01;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

import com.shafira.project01.model.Adapter;
import com.shafira.project01.model.TV;
import com.shafira.project01.model.GuestStar;
import com.shafira.project01.model.TVData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHeroes;
    private ArrayList<TV> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list.addAll(TVData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvHeroes.setLayoutManager(new LinearLayoutManager(this));
        Adapter listTVAdapter = new Adapter(list);
        rvHeroes.setAdapter(listTVAdapter);
    }

}
