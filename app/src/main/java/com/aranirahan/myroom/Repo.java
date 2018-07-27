package com.aranirahan.myroom;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class Repo {
    @PrimaryKey
    public final String id;
    public final String name;
    public final String url;

    public Repo(String id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }
}
