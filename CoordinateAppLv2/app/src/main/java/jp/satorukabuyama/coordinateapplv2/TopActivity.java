package jp.satorukabuyama.coordinateapplv2;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.AppLaunchChecker;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class TopActivity extends AppCompatActivity {

    private float fromX;//移動元のｘ座標
    private float fromY;//移動元のｙ座標
    private float fromScale;//移動元のスケール
    private float toX;//移動先のｘ座標
    private float toY;//移動先のｙ座標
    private float toScale;//移動先のスケール

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top);

        FloatingActionButton myPageFab = (FloatingActionButton) findViewById(R.id.myPageFab);
        FloatingActionButton lankingFab = (FloatingActionButton) findViewById(R.id.lankingFab);
        FloatingActionButton searchFab = (FloatingActionButton) findViewById(R.id.searchFab);

        //移動元
        fromX = myPageFab.getTranslationX();
        fromY = myPageFab.getTranslationY();
        fromScale = myPageFab.getScaleX();
        //移動先
        toX = fromX + 20;
        toY = fromY + 50;
        toScale = 0.98f;

        PropertyValuesHolder holderY = PropertyValuesHolder.ofFloat("translationY", toY, 0f);
        PropertyValuesHolder holderAlpha = PropertyValuesHolder.ofFloat("alpha", 0f, 1f);

        ObjectAnimator myPageAnim = ObjectAnimator.ofPropertyValuesHolder(myPageFab, holderY, holderAlpha);
        myPageAnim.setDuration(2000);
        myPageAnim.start();

        ObjectAnimator lankingAnim = ObjectAnimator.ofPropertyValuesHolder(lankingFab, holderY, holderAlpha);
        lankingAnim.setDuration(2000);
        lankingAnim.start();

        ObjectAnimator searchAnim = ObjectAnimator.ofPropertyValuesHolder(searchFab, holderY, holderAlpha);
        searchAnim.setDuration(2000);
        searchAnim.start();


        myPageFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // mypage 画面を起動
//                Intent intentMypage = new Intent();
//                intentMypage.setClassName("jp.satorukabuyama.coordinateapplv2", "jp.satorukabuyama.coordinateapplv2.MyPageActivity");
//                startActivity(intentMypage);

                Intent intentMypage = new Intent();
                intentMypage.setClassName("jp.satorukabuyama.coordinateapplv2", "jp.satorukabuyama.coordinateapplv2.NotLoginActivity");
                startActivity(intentMypage);

            }
        });



        lankingFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // lanking 画面を起動
                Intent intentLanking = new Intent();
                intentLanking.setClassName("jp.satorukabuyama.coordinateapplv2", "jp.satorukabuyama.coordinateapplv2.LankingActivity");
                startActivity(intentLanking);
            }
        });

        searchFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // search 画面を起動
                Intent intentSearch = new Intent();
                intentSearch.setClassName("jp.satorukabuyama.coordinateapplv2", "jp.satorukabuyama.coordinateapplv2.SearchActivity");
                startActivity(intentSearch);
            }
        });
    }
}
