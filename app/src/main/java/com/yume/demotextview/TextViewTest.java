package com.yume.demotextview;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
/**
 * Created by yume
 * 跑馬燈測試
    android:marqueeRepeatLimit="-1"
    跑馬燈的循環次數，-1表示無限循環。
    android:singleLine="true"
    指定TextView以單行顯示。
    android:focusableInTouchMode="true"
    指定在觸控模式下取得焦點，連同下一個focusable都必須設為true，跑馬燈才會動。
    android:focusable="true"
    讓TextView可以取得焦點。
    android:ellipsize="marquee"
    過長文字的省略方式，共有5種。
    none：不作用。形同end。
    start：省略開頭文字，注重顯示尾端文字。
    middle：省略中間文字，前後文字中間以...呈現。
    end：省略尾端文字。
    marquee：跑馬燈模式。
 */
public class TextViewTest extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.textview);
        TextView textView = (TextView)findViewById(R.id.textView1);
        textView.setText("set textview\'s content");
        textView.setTextAppearance(this,R.style.text);
        //跑馬燈
        TextView textView1 = (TextView)findViewById(R.id.textMarquee);
        textView1.setText("**** 跑馬燈測試中 跑馬燈測試中 跑馬燈測試中 跑馬燈測試中 跑馬燈測試中 跑馬燈測試中 跑馬燈測試中");
    }
}
