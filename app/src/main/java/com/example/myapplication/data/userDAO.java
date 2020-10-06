package com.example.myapplication.data;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.myapplication.database.mySqlite;
import com.example.myapplication.model.user;

import java.util.ArrayList;
import java.util.List;

public class userDAO {
  private mySqlite mysqlite;

    public userDAO(mySqlite mysqlite) {
        this.mysqlite = mysqlite;
    }
    public long addUser(user User){
        SQLiteDatabase sqLiteDatabase = mysqlite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",User.name);
        contentValues.put("gmail",User.gmail);
        contentValues.put("tel",User.tel);
        contentValues.put("password",User.password);
        return sqLiteDatabase.insert("table_user",null,contentValues);
    }
    public void delUser(String id){
        SQLiteDatabase sqLiteDatabase = mysqlite.getWritableDatabase();
        sqLiteDatabase.delete("table_user","name = ?",new String[]{id});
    }
    public void updateUser(user User){
        SQLiteDatabase sqLiteDatabase = mysqlite.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("name",User.name);
        contentValues.put("gmail",User.gmail);
        contentValues.put("tel",User.tel);
        contentValues.put("password",User.password);
        sqLiteDatabase.update("table_user",contentValues,"name=?",new String[]{User.name});
    }
    public List<user> getUser(){
        List<user> userList = new ArrayList<>();
        String truyVan = "SELECT * FROM table_user";//lay toan bo du lieu trong bang user
        Cursor cursor = mysqlite.getWritableDatabase().rawQuery(truyVan, null);
        if (cursor.getCount()>0){
            cursor.moveToNext();
            while (cursor.isAfterLast() == false){
                String name = cursor.getString(cursor.getColumnIndex("name"));
                int tel = cursor.getInt(cursor.getColumnIndex("tel"));
                String gmail = cursor.getString(cursor.getColumnIndex("gmail"));
                String password = cursor.getString(cursor.getColumnIndex("password"));

                user User = new user();
                User.name=name;
                User.gmail=gmail;
                User.password=password;
                User.tel=tel;
                userList.add(User);
                cursor.moveToNext();
            }
            cursor.close();
        }
        return userList;
    }
}
