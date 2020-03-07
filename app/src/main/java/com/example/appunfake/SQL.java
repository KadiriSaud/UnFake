package com.example.appunfake;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class SQL extends SQLiteOpenHelper
{
    private static final String dbname = "NewsID.db";
    private static final int version = 1;
    public SQL (Context context)
    {
        super(context, dbname,null, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String qry = "create table tbl_ID(id integer primary key autoincrement, Pincode text, Date text)";
        db.execSQL(qry);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS tbl_ID");
        onCreate(db);
    }
    public String ID (String p1, String p2)
    {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues cv = new ContentValues();
        cv.put("Pincode", p1);
        cv.put("Date", p2);
        long res = db.insert("tbl_ID", null, cv);
        if(res == -1)
            return "Failed";
        else
            return "Successfully added for review";

    }
}
