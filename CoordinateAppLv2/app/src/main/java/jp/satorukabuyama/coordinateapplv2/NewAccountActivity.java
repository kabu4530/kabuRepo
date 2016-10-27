package jp.satorukabuyama.coordinateapplv2;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by satoru.kabuyama on 2016/10/17.
 */

public class NewAccountActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_newaccount);

            //ここら辺DBの定義みたいな感じ。データベースを扱うよーみたいな
            MyOpenHelper helper = new MyOpenHelper(this);
            final SQLiteDatabase db = helper.getWritableDatabase();

            //名前
            EditText nameText = (EditText) findViewById(R.id.nameText);
            final String nameTextVal = nameText.getText().toString();

            //性別
            Spinner genderSpinner = (Spinner) findViewById(R.id.genderSpinner);
            int idx = genderSpinner.getSelectedItemPosition();
            final String genderSpinnerVal = genderSpinner.getSelectedItem().toString();

            //ID
            EditText idText = (EditText) findViewById(R.id.idText);
            final String idTextVal = idText.getText().toString();

            //パスワード
            EditText passText = (EditText) findViewById(R.id.passText);
            final String passTextVal = passText.getText().toString();

            //e-mail
            EditText emailText = (EditText) findViewById(R.id.emailText);
            final String emailTextVal = emailText.getText().toString();

            //登録ボタン
            Button registerBtn = (Button) findViewById(R.id.registerBtn);
            registerBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    ContentValues insertValues = new ContentValues();
                    insertValues.put("name", nameTextVal);
                    insertValues.put("gender", genderSpinnerVal);
                    insertValues.put("id", idTextVal);
                    insertValues.put("password", passTextVal);
                    insertValues.put("email", emailTextVal);
                    db.insert("personalInfo", nameTextVal, insertValues);

                    // マイページ 画面を起動
                    Intent intentMypage = new Intent();
                    intentMypage.setClassName("jp.satorukabuyama.coordinateapplv2", "jp.satorukabuyama.coordinateapplv2.MyPageActivity");
                    startActivity(intentMypage);

                    Toast.makeText(NewAccountActivity.this, "ご登録ありがとうございます", Toast.LENGTH_LONG).show();
                }
            });

        }
}
