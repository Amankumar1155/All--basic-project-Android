package com.kartik.sqlitedatabase.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.wifi.aware.PublishConfig;

import com.kartik.sqlitedatabase.model.EmpRecord;

import java.io.ObjectStreamField;

//SQLiteOpenHelper is used to access the database
public class Database_Handler extends SQLiteOpenHelper

{

public static final int VERSION_CODE = 1;

public static final String DB_NAME = "bhatt_database";
public static final String TABLE_NAME = "Employee";
public static final String ID = "id";
public static final String NAME = "nmae";
public static final String SALARY = "salary";

public Database_Handler(Context context){

    super(context,DB_NAME,null,VERSION_CODE);
}

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        String query = "CREATE TABLE "+TABLE_NAME+"("+ID+" NUMBER PRIMARY KEY,"+NAME+" TEXT,"+SALARY+" TEXT);";
        sqLiteDatabase.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
    onCreate(sqLiteDatabase);

    }

    //##################### INSERT RECORDS #####################

      public long insertRecord(EmpRecord record)
      {
         SQLiteDatabase DB =  getWritableDatabase();
          ContentValues values = new ContentValues();
          values.put(ID ,record.getId());
          values.put(NAME ,record.getName());
          values.put(SALARY ,record.getSalary());

          return DB.insert(TABLE_NAME,null,values);
      }
}
