//package jp.satorukabuyama.coordinateapplv2;
//
//import android.content.Intent;
//import android.database.Cursor;
//import android.database.sqlite.SQLiteDatabase;
//import android.os.Bundle;
//import android.support.v7.app.AppCompatActivity;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//
///**
// * Created by satoru.kabuyama on 2016/10/17.
// */
//
//public class MyAccountActivity extends AppCompatActivity {
//
//        @Override
//        protected void onCreate(Bundle savedInstanceState) {
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_myaccount);
//
//            MyOpenHelper helper = new MyOpenHelper(this);
//            SQLiteDatabase db = helper.getReadableDatabase();
//
//            //queryメソッドの実行例
//            Cursor c = db.query("person", new String[] {"name", "age"}, null, null, null, null, null);
//
//            boolean mov = c.moveToFirst();
//            while (mov) {
//                TextView textView = new TextView(this);
//                textView.setText(String.format("%s : %d歳", c.getString(0), c.getInt(1)));
//                mov = c.moveToNext();
//                layout.addView(textView);
//            }
//            c.close();
//            db.close();
//
//        }
//}