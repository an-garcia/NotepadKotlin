package com.xengar.android.notepadkotlin;

import android.app.Application;

import com.xengar.android.notepadkotlin.data.DataStore;

public class NotesApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        DataStore.INSTANCE.init(this);
    }
}
