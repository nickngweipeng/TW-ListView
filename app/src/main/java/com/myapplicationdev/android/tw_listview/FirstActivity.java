package com.myapplicationdev.android.tw_listview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class FirstActivity extends AppCompatActivity {

    ListView lv;
    ArrayList<Year> al;
    YearAdapter aa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = (ListView)this.findViewById(R.id.lvCourse);

        al = new ArrayList<Year>();
        al.add(new Year("Year 1"));
        al.add(new Year("Year 2"));
        al.add(new Year("Year 3"));


        aa = new YearAdapter(this, R.layout.activity_second, al);
        lv.setAdapter(aa);
    }
}
