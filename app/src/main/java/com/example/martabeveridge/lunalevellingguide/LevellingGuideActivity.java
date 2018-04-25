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

//public class TopMoviesActivity extends AppCompatActivity {
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_top_movies_list);
//
//        TopMovies topMovies = new TopMovies();
//        ArrayList<Movie> movieList = topMovies.getList();
//
//        TopMoviesAdapter topMoviesAdapter = new TopMoviesAdapter(this, movieList);
//
//        ListView moviesListView = findViewById(R.id.moviesListViewID);
//        moviesListView.setAdapter(topMoviesAdapter);
//    }
//
//    public void onListItemClick(View listItem){
//        Movie movie = (Movie) listItem.getTag();
//        Log.d("Movie Title: ", movie.getTitle());
//
//        Intent intent = new Intent(this, MovieDetailActivity.class);
//        intent.putExtra("movie", movie);
//        startActivity(intent);
//    }

}
