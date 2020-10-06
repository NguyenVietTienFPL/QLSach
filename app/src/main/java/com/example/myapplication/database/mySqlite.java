package com.example.myapplication.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class mySqlite extends SQLiteOpenHelper {

    public mySqlite( Context context) {

        super(context, "data.sql", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //tao bang
        String table_user = "create table user"+"(iduser INT primary key NOT NULL,"+"name NVARCHAR(50) NOT NULL,"+"gmail NVARCHAR(50),"+"tel INT, "+"password NVARCHAR(16))";
        String table_book = "create table book"+"(idBook INT primary key NOT NULL,"+"nameBook NVACHAR(100),"+"nameAuthor NVARCHAR(50),"+"price INT ,"+"amount INT)";
        String table_bill = "create table bill"+"(idBill INT primary key NOT NULL,"+"namekhachhang NVARCHAR(100) NOT NULL,"+"price INT,"+"nameBook NVARCHAR(100),"+"amount INT,"+"idBook INT,"+"theloai NVARCHAR(50))";
        String table_hoadonchitiet = "create table hoadonchitiet"+"(idhoadonchitiet INT primary key,"+"idBook INT,"+"IdUser INT)";
        db.execSQL(table_user);
        db.execSQL(table_book);
        db.execSQL(table_bill);
        db.execSQL(table_hoadonchitiet);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
      //them sua xoa du lieu
    }
}
