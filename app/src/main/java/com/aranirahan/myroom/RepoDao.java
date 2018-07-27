package com.aranirahan.myroom;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;
import android.database.Cursor;

import java.util.List;

@Dao
public interface RepoDao {

    @Query("SELECT * FROM repo")
    List<Repo> getAllRepos();

    @Insert
    void insert(Repo... repos);

    @Update
    void update(Repo... repos);

    @Delete
    void delete(Repo... repos);

    //@Insert, @Update and@Delete you can pass many different types
    //e.g. for inserting you can have three different methods

//        @Insert
//        void insert(Repo repos);
//
//        @Insert
//        void insert(List<Repo> repoList);


    //@Query, you can return list of them, or Cursor

//        @Query("SELECT * FROM repo WHERE id=:id")
//        Repo getRepo(int id);
//
//        @Query("SELECT * FROM repo")
//        Cursor getCursor();

    //@Query, you can also pass parameter to get repositories by name or limit them

//    @Query("SELECT * FROM repo WHERE name = :name")
//    List<Repo> getRepoByName(String name);
//
//    @Query("SELECT * FROM repo WHERE name = :name LIMIT :max")
//    List<Repo> getReposByName(int max, String... name);


}
