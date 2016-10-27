package jp.satorukabuyama.coordinateapplv2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by satoru.kabuyama on 2016/08/17.
 * SQLiteOpenHelperを継承したクラスでSQLiteデータベースを生成しているアクティビィです。
 * レイアウトファイルとは紐づけていないので、目には見えない
 */
public class MyOpenHelper extends SQLiteOpenHelper {
    public MyOpenHelper(Context context) {
        super(context, "PersonalInfoDB", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table personalInfo( " + "name text not null, " + "gender text not null, " + "id text not null, " + "password text not null, " + "email text not null " + ");");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
