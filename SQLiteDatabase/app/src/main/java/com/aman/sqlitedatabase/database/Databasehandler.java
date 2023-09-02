package com.aman.sqlitedatabase.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class Databasehandler extends SQLiteOpenHelper
{
    public static final int VERSION_CODE = 1;
    public static String DB_NAME="ainwik";
    public static String TABLE_NAME ="employee";
    public static final String ID ="id";
    public static final String NAME ="name";
    public static final String SALARY ="salary";

    public Databasehandler(Context context)
    {
        super(context,DB_NAME,null,VERSION_CODE);

}


    @Override
    public void onCreate(SQLiteDatabase db) {
        String  query="CREATE TABLE "+TABLE_NAME+"("+ID+" NUMBER PRIMARY KEY,"+NAME+" TEXT,"+SALARY+" TEXT);";

        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
        onCreate(db);

    }
}
