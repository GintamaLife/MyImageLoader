package com.marong.apple.myimageloader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.marong.apple.myimageloader.imageLoader.ImageLoaderManager;

public class MainActivity extends AppCompatActivity {

    private ImageView img1;
    private ImageView img2;
    private String url="http://img1.imgtn.bdimg.com/it/u=679805784,3150507797&fm=214&gp=0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        ImageLoaderManager.getInstance().showImage(ImageLoaderManager.getDefaultOptions(img1,url));
        ImageLoaderManager.getInstance().showImage(ImageLoaderManager.getDefaultOptions(img2,url));

    }

    private void initView() {
        img1 = (ImageView) findViewById(R.id.img_1);
        img2 = (ImageView) findViewById(R.id.img_2);
    }
}
