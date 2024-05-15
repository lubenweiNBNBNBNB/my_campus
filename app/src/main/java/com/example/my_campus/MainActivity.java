package com.example.my_campus;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.example.my_campus.R;//

public class MainActivity extends BaseActivity
{
    private String[] data ={"教师事务","学生事务","荔园生活","网上服务","强制下线"};
    private boolean isTwoPane;

    protected void onCreate(Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);
        setContentView(R.layout.activity_main);

        isTwoPane = false;
        if(findViewById(R.id.left_fragment) != null)
        {
            isTwoPane = true;
        }

        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // 在这里处理每一项的点击事件
                String selectedItem = data[position]; // 获取被点击的项的数据
                Toast.makeText(MainActivity.this, "You clicked: " + selectedItem, Toast.LENGTH_SHORT).show();

                if(isTwoPane)
                {
                    // 根据点击的不同项执行不同的操作
                    if (selectedItem.equals("教师事务")) {
                        // 执行相应的操作
                        replaceFragment(new jssw());
                    } else if (selectedItem.equals("学生事务")) {
                        // 执行相应的操作
                        replaceFragment(new xssw());
                    } else if (selectedItem.equals("荔园生活")) {
                        replaceFragment(new lysh());
                    }else if (selectedItem.equals("网上服务")) {
                        replaceFragment(new wsfw());
                    }else if (selectedItem.equals("强制下线")) {
                        Intent intent = new Intent("com.example.my_campus.FORCE_OFFLINE");
                        sendBroadcast(intent);
                    }
                }
                else
                {
                    if (selectedItem.equals("教师事务")) {
                        // 执行相应的操作
                        jsswActivity.actionStart(MainActivity.this);//这个位置居然不能传this 函数成员的方法构建
                    } else if (selectedItem.equals("学生事务")) {
                        // 执行相应的操作
                        xsswActivity.actionStart(MainActivity.this);
                    } else if (selectedItem.equals("荔园生活")) {
                        lyshActivity.actionStart(MainActivity.this);
                    }else if (selectedItem.equals("网上服务")) {
                        wsfwActivity.actionStart(MainActivity.this);
                    }else if (selectedItem.equals("强制下线")) {
                        Intent intent = new Intent("com.example.my_campus.FORCE_OFFLINE");
                        sendBroadcast(intent);
                    }
                }

                // 其他选项的处理类似
            }
        });



        ImageView imageView = (ImageView) findViewById(R.id.szu_image);
        imageView.setImageResource(R.drawable.szu);

    }
    private void replaceFragment(Fragment fragment)
    {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.list, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
