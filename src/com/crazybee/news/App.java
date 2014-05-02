package com.crazybee.news;

import com.crazybee.news.db.NewsDatabase;
import com.crazybee.news.util.FileUtils;
import com.crazybee.news.util.ImageLoader;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;

/**
 * 
 * @author Zhe Liu
 * 
 */
public class App extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		//TODO check UIProcess
		FileUtils.mAppPackageName = getPackageName();
		NewsDatabase.getInstance(getApplicationContext());
		ImageLoader.getInstance().setLruCacheSize(
				((ActivityManager) getSystemService(Context.ACTIVITY_SERVICE)).getMemoryClass());
	}

}
