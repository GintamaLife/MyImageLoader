package com.marong.apple.myimageloader.imageLoader;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * 项目名称：MyImageLoader
 * 类描述：
 * 创建人：马荣
 * 创建时间：2017/7/13 上午10:04
 */

public interface IImageLoaderstrategy {
    void showImage(@NonNull ImageLoaderOptions options);
    void cleanMemory(Context context);
    // 在application的oncreate中初始化
    void init(Context context);
}
