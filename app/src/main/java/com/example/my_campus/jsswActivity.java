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

public class jsswActivity extends AppCompatActivity
{
    private List<NewsClass> ItemList = new ArrayList<>();
    public static void actionStart(Context context) {
        Intent intent = new Intent(context, jsswActivity.class);
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
        NewsClass business1 = new NewsClass("办事大厅");
        ItemList.add(business1);
        business1 = new NewsClass("教师邮箱@");
        ItemList.add(business1);
        business1 = new NewsClass("本科生教务");
        ItemList.add(business1);
        business1 = new NewsClass("研究生教务");
        ItemList.add(business1);
        business1 = new NewsClass("Blackboard");
        ItemList.add(business1);
        business1 = new NewsClass("OA系统");
        ItemList.add(business1);
        business1 = new NewsClass("科学技术");
        ItemList.add(business1);
        business1 = new NewsClass("社会科学");
        ItemList.add(business1);
        business1 = new NewsClass("人力资源");
        ItemList.add(business1);
        business1 = new NewsClass("实验设备");
        ItemList.add(business1);
        business1 = new NewsClass("设备共享");
        ItemList.add(business1);
        business1 = new NewsClass("财务服务");
        ItemList.add(business1);
        business1 = new NewsClass("招标采购");
        ItemList.add(business1);
        business1 = new NewsClass("鸡你太美");
        ItemList.add(business1);
    }
}
