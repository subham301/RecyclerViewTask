package com.example.subham.recyclerviewtask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.User;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private List<User> list;

    private String getContact(){
        String ans = "";
        for(int j = 0; j < 10; j++)
            ans = ans + Integer.toString((int) Math.random());
        return ans;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list = new ArrayList<>();
        for(int j = 0; j < 10; j++){
            User user = new User((j%2 == 0? R.drawable.img1 : R.drawable.img2), "Person Name"+j, getContact(), Integer.toString(j+18), "emailAddress"+j+"@xyz.com");
            list.add(user);
        }

        adapter = new MyAdapter(this, list);

        recyclerView = findViewById(R.id.recycle);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        recyclerView.setAdapter(adapter);
    }
}
