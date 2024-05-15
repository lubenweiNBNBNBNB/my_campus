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

public class lysh extends Fragment {
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
        NewsClass business1 = new NewsClass("荔园晨风");
        ItemList.add(business1);
        business1 = new NewsClass("深大义工");
        ItemList.add(business1);
        business1 = new NewsClass("学科竞赛");
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
