package com.minemap;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
public class MainActivity extends Activity {
	private ArrayList<CheckBox> squares=new ArrayList<CheckBox>();
	private Button reset;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		reset= (Button)this.findViewById(R.id.button1);
		squares.add((CheckBox)this.findViewById(R.id.CheckBox01));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox02));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox03));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox04));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox05));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox06));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox07));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox08));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox09));
		squares.add((CheckBox)this.findViewById(R.id.checkBox1));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox10));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox11));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox12));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox13));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox14));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox15));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox16));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox17));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox18));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox19));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox20));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox21));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox22));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox23));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox24));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox25));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox26));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox27));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox28));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox29));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox30));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox31));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox32));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox33));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox34));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox35));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox36));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox37));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox38));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox39));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox40));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox41));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox42));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox43));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox44));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox45));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox46));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox47));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox48));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox49));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox50));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox51));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox52));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox53));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox54));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox55));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox56));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox57));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox58));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox59));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox60));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox61));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox62));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox63));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox64));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox65));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox66));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox67));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox68));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox69));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox70));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox71));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox72));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox73));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox74));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox75));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox76));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox77));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox78));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox79));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox80));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox81));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox82));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox83));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox84));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox85));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox86));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox87));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox88));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox89));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox90));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox91));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox92));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox93));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox94));
		squares.add((CheckBox)this.findViewById(R.id.CheckBox95));
		squares.add((CheckBox)this.findViewById(R.id.checkBox2));
		squares.add((CheckBox)this.findViewById(R.id.checkBox3));
		reset.setOnClickListener(new OnClickListener() {
			// handle event
			public void onClick(View view) {
				clearAll();
			}});
		return true;
	}
	public void clearAll(){
		for(int i=0;i<squares.size();i++){
			squares.get(i).setChecked(false);
		}
		
	}

}
