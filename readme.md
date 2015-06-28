# Android TextView  

### 基本設定  

##### 1.程式設定文字內容   

	textView.setText("文字內容");

##### 2.程式設定文字的style  

> 屬性是(context,style)  

	setTextAppearance(this,R.style.text)

----------

### 跑馬燈

##### 1.過長文字時的省略方式  

> start:省略開頭文字  

> middle:省略中間文字  

> end:省略末端文字  

> marquee:跑馬燈  

	android:ellipsize="marquee"  

##### 2.重複次數  

> -1表示無限  

	android:marqueeRepeatLimit="-1"  

##### 3.單行顯示  

	android:singleLine="true"  
  
##### 4.在觸控模式下取得焦點  

> 務必設定為**true**  

	android:focusableInTouchMode="true"  

##### 5.取得焦點  

> 務必設定為**true**  

	android:focusable="true"

----------

### 設定背景

> 在drawable增加xml，使用shape自定義背景  

	<?xml version="1.0" encoding="utf-8"?>  
	<shape
    xmlns:android="http://schemas.android.com/apk/res/android"
    android:shape="rectangle">
    	<stroke android:width="2.5dp"
	        android:color="#222222"
	        android:dashWidth="3.0dp"
	        android:dashGap="0.0dp" />
    	<gradient
	        android:startColor="#D4D4F8"
	        android:endColor="#5554A6"
	        android:angle="270" />
	    <padding
	        android:left="50dp"
	        android:top="20dp" android:right="7dp"
	        android:bottom="7dp" />
	    <corners
	        android:bottomLeftRadius="10dp"
	        android:bottomRightRadius="10dp"
	        android:topLeftRadius="30dp"
	        android:topRightRadius="30dp"
	        />
	</shape>