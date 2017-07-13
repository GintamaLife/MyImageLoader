package com.marong.apple.myimageloader;

import android.app.Application;

import com.marong.apple.myimageloader.imageLoader.ImageLoaderManager;

/**
 * 项目名称：MyImageLoader
 * 类描述：
 * 创建人：马荣
 * 创建时间：2017/7/13 上午10:10
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderManager.getInstance().init(this);
    }
}
