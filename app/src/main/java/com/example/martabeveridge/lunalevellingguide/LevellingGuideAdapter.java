package com.example.martabeveridge.lunalevellingguide;

public class LevellingGuideAdapter {
}

//    public TopMoviesAdapter(Context context, ArrayList<Movie> movies){
//        super(context, 0, movies);
//    }
//
//    @Override
//    public View getView(int position, View listItemView, ViewGroup parent){
//        if (listItemView == null){
//            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.movie_list_item, parent, false);
//        }
//
//        Movie currentMovie = getItem(position);
//
//        TextView ranking = listItemView.findViewById(R.id.rankingTextViewId);
//        ranking.setText(currentMovie.getRanking().toString());
//
//        TextView titleTextView = listItemView.findViewById(R.id.titleTextViewId);
//        titleTextView.setText(currentMovie.getTitle());
//
//        TextView yearTextView = listItemView.findViewById(R.id.yearTextViewId);
//        yearTextView.setText(currentMovie.getYear().toString());
//
//        listItemView.setTag(currentMovie);
//
//        return listItemView;
//
//    }