package jp.satorukabuyama.coordinateapplv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by satoru.kabuyama on 2016/10/14.
 */

public class MyPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypage);

        Button myaccountBtn = (Button) findViewById(R.id.myAccountBtn);
        myaccountBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // アカウント詳細 画面を起動
                Intent intentLanking = new Intent();
                intentLanking.setClassName("jp.satorukabuyama.coordinateapplv2", "jp.satorukabuyama.coordinateapplv2.MyAccountActivity");
                startActivity(intentLanking);
            }
        });

    }
}
