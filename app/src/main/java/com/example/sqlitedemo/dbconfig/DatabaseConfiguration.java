package com.example.sqlitedemo.dbconfig;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import androidx.annotation.Nullable;
import com.example.sqlitedemo.domains.Item;

public class DatabaseConfiguration extends SQLiteOpenHelper {
  private static final String DATABASE_NAME = "ChiTieu.db";

  private static final int DATABASE_VERSION = 1;

  public DatabaseConfiguration(@Nullable Context context) {
    super(context, DATABASE_NAME, null, DATABASE_VERSION);
  }

  @Override
  public void onCreate(SQLiteDatabase db) {
    // tạo bảng 1
    String sqlCreateDB =
        "CREATE TABLE categories (id integer primary key autoincrement, name text)";
    db.execSQL(sqlCreateDB);

    // tạo bảng 2
    sqlCreateDB =
        "CREATE TABLE items("
            + "id integer primary key autoincrement, "
            + "name text, "
            + "category_id integer, "
            + "price real, "
            + "date text, "
            + "foreign key (category_id) references categories(id))";
    db.execSQL(sqlCreateDB);
  }

  public void addItem(Item i) {
    String sql = "INSERT INTO items(title,category_id,price,date)" + "VALUES(?,?,?,?)";
    String[] args = {
      i.getName(), i.getCategory().getId().toString(), i.getPrice().toString(), i.getDate()
    };
    SQLiteDatabase st = getWritableDatabase();
    st.execSQL(sql, args);
  }

  @Override
  public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    // code here...
  }
}
