package com.example.buttontest;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button myBtn;
    TextView text;
    ImageButton img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myBtn=(Button) findViewById(R.id.button1);
        text=(TextView) findViewById(R.id.textView2);
        myBtn.setOnClickListener(buttonlistener);
        img=(ImageButton) findViewById(R.id.imageButton1);
    }
    Button.OnClickListener buttonlistener = new Button.OnClickListener(){

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			text.setText("ÁõÖÇÒã×÷Òµ£¡");
			img.setImageResource(R.drawable.abc);
		}};

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
