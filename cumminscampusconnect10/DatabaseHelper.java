package com.example.cumminscampusconnect10;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "myDataBaseee.db";
    private static final int DATABASE_VERSION = 1;

    public static final String TABLE_NAME = "details";
    public static final String COLUMN_NAME = "name";
    public static final String COLUMN_TYPE = "type";
    public static final String COLUMN_FLOOR = "floor";

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS " + TABLE_NAME + " (" +
                COLUMN_NAME + " TEXT, " +
                COLUMN_TYPE + " TEXT, " +
                COLUMN_FLOOR + " TEXT)";

        db.execSQL(CREATE_TABLE_QUERY);

        // Insert hardcoded data into the database
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, "Classroom 1");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Sandhya Arora");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.put(COLUMN_NAME, "Vikram Athalaya");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();
        values.put(COLUMN_NAME, "Prachi Mukherji (IP cell)");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Sulakshana Nagpurkar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "Ground Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "S Rajput");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Sandeep Musale");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();




        values.put(COLUMN_NAME, "Anand Bewoor");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Ashutosh Muchrikar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Manasi Pathade");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Sandhya Arora");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Vidya Sisale");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "R Borhade");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Nutan Deshmukh");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Varsha Pimprale");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Nilofer Kittad");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();
        values.put(COLUMN_NAME, "G Phandikar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Jyoti Banagre");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Prakash Date");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Prachi Waghmare");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "S A Mangale");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "K S Joshi");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Sandhya Arora");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Nilofer Kittad");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Neeta Maitre");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Sakshi Mandke");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Priya Deokar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Sheetal Barekar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Pranjali Deshpande");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Ashwini Rajurkar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Rakhi Dongaonkar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Meenal Kamlakar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Shilpa Deshpande");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Vaishali Salgar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Yogini Kulkarni");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Vrushali Deshpande");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Madhuri Tasgaonkar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Sharyu Mirasdar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Anjali Naik");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Aparna Hajare");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Chhaya Gosavi");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Shilpa Pant");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Hitandra Khairnar");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Saurabh Mengale");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Mahendra Deore");
        values.put(COLUMN_TYPE, "Faculty");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Classroom 1");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Classroom 2");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Classroom 3");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 4");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 5");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "Classroom 6");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 7");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 8");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Classroom 9");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 10");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 11");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 12");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "2ndt Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 13");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Classroom 14");
        values.put(COLUMN_TYPE, "Classroom");
        values.put(COLUMN_FLOOR, "2nd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();
        values.put(COLUMN_NAME, "SL1");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR,"5th Floor");
                db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "SL2");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "Ground Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "SL3");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();



        values.put(COLUMN_NAME, "SL4");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "SL5");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "Ground Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "SL6");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "SL7");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "SL8");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "SL9");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "SL10");
        values.put(COLUMN_TYPE, "Lab");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "Library");
        values.put(COLUMN_TYPE, "Others");
        values.put(COLUMN_FLOOR, "3rd Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();


        values.put(COLUMN_NAME, "Principal’s Office");
        values.put(COLUMN_TYPE, "Others");
        values.put(COLUMN_FLOOR, "1st Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

        values.put(COLUMN_NAME, "HOD’s Office");
        values.put(COLUMN_TYPE, "Others");
        values.put(COLUMN_FLOOR, "5th Floor");
        db.insert(TABLE_NAME, null, values);

        values.clear();

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Handle database upgrades if needed
    }
}
