package com.example.my_campus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.AdapterView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class xsswActivity extends AppCompatActivity
{
    private List<NewsClass> ItemList = new ArrayList<>();
    public static void actionStart(Context context) {
        Intent intent = new Intent(context, xsswActivity.class);
        context.startActivity(intent);
    }
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.right_fragment);
        initItem();

        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.b_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        NewsClassAdapter adapter = new NewsClassAdapter(ItemList, this);
        recyclerView.setAdapter(adapter);
    }
    private void initItem()
    {
        NewsClass business1 = new NewsClass("UOOC课程");
        ItemList.add(business1);
        business1 = new NewsClass("学生邮箱@");
        ItemList.add(business1);
        business1 = new NewsClass("本科生选课");
        ItemList.add(business1);
        business1 = new NewsClass("荔园晨风");
        ItemList.add(business1);
        business1 = new NewsClass("荔园晨风");
        ItemList.add(business1);
        business1 = new NewsClass("荔园晨风");
        ItemList.add(business1);
        business1 = new NewsClass("荔园晨风");
        ItemList.add(business1);
        business1 = new NewsClass("荔园晨风");
        ItemList.add(business1);
        business1 = new NewsClass("");
        ItemList.add(business1);
    }
}
