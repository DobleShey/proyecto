package com.example.umpa;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Userhelper extends SQLiteOpenHelper {
    
    
    private static final int DATABASE_VERSION= 1;
    private static final String DATABASE_NAME= "adfantasy.db";


    public Userhelper( Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
    String query="select * from " + Userscontrat.UsersEntry.TABLE_NAME
            + " where " + Userscontrat.UsersEntry.NAME + " = ? ";
    String[] params=new String[1];
    params[0]="xana";
    Cursor cursor =db.rawQuery(query,params);
    while(cursor.moveToNext()){
        String name=cursor.getString(cursor.getColumnIndex(Userscontrat.UsersEntry.NAME));
    }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
