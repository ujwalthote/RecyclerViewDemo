package com.coderfolk.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    String data[]=new String[]{"January","cat", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish",
            "cow", "dog", "mouse","bird", "fish", "cow", "dog", "mouse","bird",
            "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog",
            "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow", "dog", "mouse","bird", "fish", "cow"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.mylist);
        ProgrammingList programmingList=new ProgrammingList(data);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(programmingList);
    }
}
