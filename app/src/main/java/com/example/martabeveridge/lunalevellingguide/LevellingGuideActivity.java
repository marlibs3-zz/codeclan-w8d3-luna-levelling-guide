package com.example.martabeveridge.lunalevellingguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class LevellingGuideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_levelling_guide_list);

        LevellingGuide levellingGuide = new LevellingGuide();
        ArrayList<Level> levelList = levellingGuide.getList();

        LevellingGuideAdapter levellingGuideAdapter = new LevellingGuideAdapter(this, levelList);

        ListView levellingGuideListView = findViewById(R.id.levellingGuideListViewId);
        levellingGuideListView.setAdapter(levellingGuideAdapter);

    }

}
