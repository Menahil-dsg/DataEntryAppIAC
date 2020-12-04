package com.example.form2part3.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME ="myDatabase.db";

    public static final String TABLE_PART3QUES1 ="part3";

    public static final int DATABASE_VERSION =3;
    public static final String C1 ="Q111";
    public static final String C2 ="Q112";
    public static final String C3 ="Q121";
    public static final String C4 ="Q122";
    public static final String C5 ="Q131";
    public static final String C6 ="Q132";
    public static final String C7 ="Q211";
    public static final String C8 ="Q212";
    public static final String C9 ="Q221";
    public static final String C10 ="Q222";
    public static final String C11 ="Q231";
    public static final String C12 ="Q232";
    public static final String C13 ="Q311";
    public static final String C14 ="Q312";
    public static final String C15 ="Q321";
    public static final String C16 ="Q322";
    public static final String C17 ="Q331";
    public static final String C18 ="Q332";
    public static final String C19 ="Q411";
    public static final String C20 ="Q412";
    public static final String C21 ="Q421";
    public static final String C22 ="Q422";
    public static final String C23 ="Q431";
    public static final String C24 ="Q432";
    public static final String C25 ="Q511";
    public static final String C26 ="Q512";
    public static final String C27 ="Q521";
    public static final String C28 ="Q522";
    public static final String C29 ="Q531";
    public static final String C30 ="Q532";
    public static final String C31 ="Q611";
    public static final String C32 ="Q612";
    public static final String C33 ="Q621";
    public static final String C34 ="Q622";
    public static final String C35 ="Q631";
    public static final String C36 ="Q632";
    public static final String C37 ="Q711";
    public static final String C38 ="Q712";
    public static final String C39 ="Q721";
    public static final String C40 ="Q722";
    public static final String C41 ="Q731";
    public static final String C42 ="Q732";
    public static final String C43 ="Q8";


    String CREATE_TABLE = "create table "+ TABLE_PART3QUES1 +" (_ID INTEGER PRIMARY KEY AUTOINCREMENT," +

            ""+C1 +" TEXT NOT NULL," +
            ""+C2 +" TEXT," +
            ""+C3 +" TEXT," +
            ""+C4 +" TEXT," +
            ""+C5 +" TEXT," +
            ""+C6 +" TEXT," +
            ""+C7 +" TEXT," +
            ""+C8 +" TEXT," +
            ""+C9 +" TEXT," +
            ""+C10 +" TEXT," +
            ""+C11 +" TEXT," +
            ""+C12 +" TEXT," +
            ""+C13 +" TEXT," +
            ""+C14 +" TEXT," +
            ""+C15 +" TEXT," +
            ""+C16 +" TEXT," +
            ""+C17 +" TEXT," +
            ""+C18 +" TEXT," +
            ""+C19 +" TEXT," +
            ""+C20 +" TEXT," +
            ""+C21 +" TEXT," +
            ""+C22 +" TEXT," +
            ""+C23 +" TEXT," +
            ""+C24 +" TEXT," +
            ""+C25 +" TEXT," +
            ""+C26 +" TEXT," +
            ""+C27 +" TEXT," +
            ""+C28 +" TEXT," +
            ""+C29 +" TEXT," +
            ""+C30 +" TEXT," +
            ""+C31 +" TEXT," +
            ""+C32 +" TEXT," +
            ""+C33 +" TEXT," +
            ""+C34 +" TEXT," +
            ""+C35 +" TEXT," +
            ""+C36 +" TEXT," +
            ""+C37 +" TEXT," +
            ""+C38 +" TEXT," +
            ""+C39 +" TEXT," +
            ""+C40 +" TEXT," +
            ""+C41 +" TEXT," +
            ""+C42 +" TEXT," +
            ""+C43+" TEXT);";

// ""+C42+" TEXT , "+""+C43+");";

    //String CREATE_TABLE = "create table "+ TABLE_PART3QUES2 +" (_ID INTEGER PRIMARY KEY AUTOINCREMENT," +

            //""+C7 +" TEXT NOT NULL," +
            //""+C8 +" TEXT," +
           // ""+C9 +" TEXT," +
           // ""+C10 +" TEXT," +
           // ""+C11 +" TEXT," +
           // ""+C12+" TEXT);";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    @Override

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_PART3QUES1);
        onCreate(db);
    }
}
