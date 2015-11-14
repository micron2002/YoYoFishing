package android.lifeistech.com.yoyofishing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import java.util.Random;


public class PlayActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
    }

    // ヨーヨーを釣る
    public void fishing(View view) {
        // ランダムな結果をセットするようにします
        Random random = new Random();
        // 0〜5の整数をランダムに作成します
        int result = random.nextInt(5);
        // 結果の画面にいきます
        Intent intent = new Intent(this, ResultActivity.class);
        // 次の画面に渡す結果をセットします
        intent.putExtra("result", result);
        // 画面の移動を開始します
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_play, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
