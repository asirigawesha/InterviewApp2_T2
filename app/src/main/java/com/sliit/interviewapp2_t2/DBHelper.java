package com.sliit.interviewapp2_t2;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHelper extends SQLiteOpenHelper {


    @Override
    public void onCreate(SQLiteDatabase DB) {
        DB.execSQL("create Table userdetails(name TEXT primary key,contact TEXT, age TEXT, gender TEXT)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase DB, int i, int i1) {
       DB.execSQL("drop Table if exists userDetails");

    }

    public boolean insertUserData(String name, String contact, String age,String gender){
        SQLiteDatabase DB=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        // implement insert function to inset details to the database

        long results=0;

        if(results==-1){
            return false;
        }
        else{
            return true;
        }
    }



    public boolean deleteUserData(String name){

        SQLiteDatabase DB=this.getWritableDatabase();
        // implement query to find details a given username
        Cursor cursor=null;

        if(cursor.getCount()>0){
           // delete user from the table
            long results=0;
            if(results==-1){
                return false;
            }
            else{
                return true;
            }
        }else{
            return false;
        }

    }

    public Cursor getUserData(){
        SQLiteDatabase DB=this.getWritableDatabase();

        // implement query to retrieve details of all users in the table



        Cursor cursor=null;
        return cursor;

    }



    public DBHelper(Context context) {
        super(context, "userData.db", null, 2);
    }
}
