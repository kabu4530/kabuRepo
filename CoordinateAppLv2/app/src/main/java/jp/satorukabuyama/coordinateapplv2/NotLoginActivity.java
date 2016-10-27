package jp.satorukabuyama.coordinateapplv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by satoru.kabuyama on 2016/10/17.
 */

public class NotLoginActivity extends AppCompatActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_notlogin);

            Button newAccountBtn = (Button) findViewById(R.id.newAccountBtn);
            newAccountBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // アカウント作成 画面を起動
                    Intent intentMypage = new Intent();
                    intentMypage.setClassName("jp.satorukabuyama.coordinateapplv2", "jp.satorukabuyama.coordinateapplv2.NewAccountActivity");
                    startActivity(intentMypage);

                }
            });

            Button loginBtn = (Button) findViewById(R.id.loginBtn);
            loginBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    // ログイン 画面を起動
                    Intent intentMypage = new Intent();
                    intentMypage.setClassName("jp.satorukabuyama.coordinateapplv2", "jp.satorukabuyama.coordinateapplv2.LoginActivity");
                    startActivity(intentMypage);

                }
            });

        }
}
