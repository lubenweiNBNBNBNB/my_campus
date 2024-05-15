package com.example.my_campus;

import static java.security.AccessController.getContext;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class jssw extends Fragment {
    private List<NewsClass> ItemList = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.right_fragment, container, false);

        initItem();

        RecyclerView recyclerView = view.findViewById(R.id.b_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);

        NewsClassAdapter adapter = new NewsClassAdapter(ItemList, (FragmentActivity) getContext());
        recyclerView.setAdapter(adapter);

        return view;
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
