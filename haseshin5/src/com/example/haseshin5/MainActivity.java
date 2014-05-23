package com.example.haseshin5;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		//リニアレイアウトの生成
		LinearLayout linearLayout=new LinearLayout(this);
		linearLayout.setOrientation(LinearLayout.VERTICAL);
		setContentView(linearLayout);

		//ボタンの生成１
		Button button1=new Button(this);
		button1.setText("どかーーーーーーーーーん！");
		button1.setLayoutParams(new LinearLayout.LayoutParams(
				LinearLayout.LayoutParams.MATCH_PARENT,
				LinearLayout.LayoutParams.WRAP_CONTENT));
	linearLayout.addView(button1);

	//ボタンの生成２
	Button button2=new Button(this);
	button2.setText("ピッ");
	button2.setLayoutParams(new LinearLayout.LayoutParams(
			LinearLayout.LayoutParams.WRAP_CONTENT,
			LinearLayout.LayoutParams.WRAP_CONTENT));
	linearLayout.addView(button2);
	}

}
//コメントこんにちは

//コメント②