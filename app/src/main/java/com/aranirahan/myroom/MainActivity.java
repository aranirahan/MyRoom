package com.aranirahan.myroom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        //set it on background thread
////        RepoDatabase
////                .getInstance(context)
////                .getRepoDao()
////                .insert(new Repo(1, "Cool Repo Name", "url"));
//
//        //lets simple like this
//        List<Repo> allRepos = RepoDatabase
//                .getInstance(MainActivity.this)
//                .getRepoDao()
//                .getAllRepos();

    }
}
