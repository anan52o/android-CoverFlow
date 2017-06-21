package com.conver.coverflownew;

import android.os.Bundle;
import android.app.Activity;
import android.database.DataSetObserver;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.SpinnerAdapter;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		init();
	}

	private void init() {
		 Integer[] mImageIds = new Integer[] { R.drawable.picture_1,
		 R.drawable.picture_2, R.drawable.picture_3,
		 R.drawable.picture_4, R.drawable.picture_5, R.drawable.picture_6,
		 R.drawable.picture_7 };
		// Integer[] mImageIds = new Integer[] { R.drawable.picture_1,
		// R.drawable.picture_2, R.drawable.picture_3 };
		CoverFlow coverFlow = new CoverFlow(this);
		coverFlow.setBackgroundColor(Color.BLACK);
		coverFlow.setAdapter(new ImageAdapter(this, mImageIds));
		coverFlow.setSelection(2, true);
		coverFlow.setAnimationDuration(1000);
		setContentView(coverFlow);
	}
}
