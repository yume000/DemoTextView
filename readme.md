# Android TextView  

### 基本設定  

##### 1.程式設定文字內容   

	textView.setText("文字內容");

##### 2.程式設定文字的style  

屬性是(context,style)  

	setTextAppearance(this,R.style.text)

----------

### 跑馬燈

##### 1.過長文字時的省略方式  

start:省略開頭文字  

middle:省略中間文字  

end:省略末端文字  

marquee:跑馬燈  

	android:ellipsize="marquee"  

##### 2.重複次數，-1表示無限  

	android:marqueeRepeatLimit="-1"  

##### 3.單行顯示  

	android:singleLine="true"  
  
##### 4.在觸控模式下取得焦點  

務必設定為**true**  

	android:focusableInTouchMode="true"  

##### 5.取得焦點  

務必設定為**true**  

	android:focusable="true"

----------
