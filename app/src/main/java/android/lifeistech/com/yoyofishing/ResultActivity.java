package android.lifeistech.com.yoyofishing;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;


public class ResultActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        //一つ前の画面から値を受け取る
        Intent intent = getIntent();
        // "result"という名前で渡された値を受け取るようにします。もしなかったら０が代入されます。
        int result = intent.getIntExtra("result", 0);

        // TextViewとImageViewをLayoutファイルから関連付けします
        TextView textView = (TextView)findViewById(R.id.textView);
        ImageView imageView = (ImageView)findViewById(R.id.imageView3);
        //結果のよって画面の表示を変える
        switch (result) {
            //結果が０だった場合
            case 0:
                textView.setText("残念とれませんでした。。。");
                // nullを入れるのは画面を表示したくないから
                imageView.setImageDrawable(null);
                break;
            //結果が１だった場合
            case 1:
                textView.setText("やった！\n1個取れたよ！");
                imageView.setImageResource(R.drawable.img_yoyo1);

                break;

            // 結果が2だった場合
            case 2:
                textView.setText("やった！\n2個取れたよ！！");
                imageView.setImageResource(R.drawable.img_yoyo2);
                break;
            // 結果が3だった場合
            case 3:
                textView.setText("すごい！\n3個取れたよ！！！");
                imageView.setImageResource(R.drawable.img_yoyo3);
                break;
            // 結果が4かそれ以外だった場合
            case 4:
            default:
                textView.setText("すごい！\nたくさん取れたよ！！！！");
                imageView.setImageResource(R.drawable.img_yoyo4);
                break;
        }
    }

    // ゲーム再スタート
    public void retry(View view) {

        // 一つ前の画面に戻りたいからfinishを呼び出して現在の画面を閉じるよ！
        finish();
    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_result, menu);
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
