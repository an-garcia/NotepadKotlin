package com.xengar.android.notepadkotlin

import android.app.Application

import com.xengar.android.notepadkotlin.data.DataStore

class NotesApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        DataStore.init(this)
    }
}
