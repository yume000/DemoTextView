# Android TextView

### 基本設定
##### 1.setText("文字內容")   
程式設定文字內容  
##### 2.setTextAppearance(this,R.style.text)  
程式設定文字的style，屬性是(context,style)

----------

### 跑馬燈
##### 1.android:ellipsize="marquee"  
過長文字時的省略方式  
start:省略開頭文字  
middle:省略中間文字  
end:省略末端文字  
marquee:跑馬燈  
##### 2.android:marqueeRepeatLimit="-1"  
重複次數，-1表示無限  
##### 3.android:singleLine="true"  
單行顯示  
##### 4.android:focusableInTouchMode="true"  
在觸控模式下取得焦點，**務必設定為true**  
##### 5.android:focusable="true"
取得焦點，**務必設定為true**  

----------
