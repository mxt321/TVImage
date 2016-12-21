package net.bjyfkj.caa.UI.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.allure.lbanners.LMBanners;
import com.allure.lbanners.transformer.TransitionEffect;
import com.allure.lbanners.utils.ScreenUtils;
import com.zhy.autolayout.AutoLayoutActivity;

import net.bjyfkj.caa.R;
import net.bjyfkj.caa.UI.adapter.LocalImgAdapter;
import net.bjyfkj.caa.util.AppUpdate;
import net.bjyfkj.caa.util.NetworkUtils;
import net.bjyfkj.caa.util.addLocalImgUtil;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AutoLayoutActivity {

    @BindView(R.id.d1)
    LMBanners d1;
    @BindView(R.id.d2)
    LMBanners d2;
    @BindView(R.id.d3)
    LMBanners d3;
    @BindView(R.id.d4)
    LMBanners d4;
    @BindView(R.id.d5)
    LMBanners d5;
    @BindView(R.id.c1)
    LMBanners c1;
    @BindView(R.id.c2)
    LMBanners c2;
    @BindView(R.id.c3)
    LMBanners c3;
    @BindView(R.id.c4)
    LMBanners c4;
    @BindView(R.id.c5)
    LMBanners c5;
    @BindView(R.id.b1)
    LMBanners b1;
    @BindView(R.id.b2)
    LMBanners b2;
    @BindView(R.id.b3)
    LMBanners b3;
    @BindView(R.id.b4)
    LMBanners b4;
    @BindView(R.id.b5)
    LMBanners b5;
    @BindView(R.id.a1)
    LMBanners a1;
    @BindView(R.id.a2)
    LMBanners a2;
    @BindView(R.id.a3)
    LMBanners a3;
    @BindView(R.id.a4)
    LMBanners a4;
    @BindView(R.id.a5)
    LMBanners a5;
    private LayoutInflater mInflater;

    private List<LMBanners> lmBannersList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);// 隐藏状态栏
        setContentView(R.layout.activity_main);
        mInflater = this.getLayoutInflater();
        ButterKnife.bind(this);
        appUpdate();
        init();
    }


    public void init() {
        lmBannersList = new ArrayList<>();
        lmBannersList.add(a1);
        lmBannersList.add(a2);
        lmBannersList.add(a3);
        lmBannersList.add(a4);
        lmBannersList.add(a5);
        lmBannersList.add(b1);
        lmBannersList.add(b2);
        lmBannersList.add(b3);
        lmBannersList.add(b4);
        lmBannersList.add(b5);
        lmBannersList.add(c1);
        lmBannersList.add(c2);
        lmBannersList.add(c3);
        lmBannersList.add(c4);
        lmBannersList.add(c5);
        lmBannersList.add(d1);
        lmBannersList.add(d2);
        lmBannersList.add(d3);
        lmBannersList.add(d4);
        lmBannersList.add(d5);
        for (int i = 0; i < lmBannersList.size(); i++) {
            initLMBanners1(lmBannersList.get(i), addLocalImgUtil.getlocalImages(i));
        }

    }

    public void initLMBanners1(LMBanners banners, List<Integer> localImages) {
        if (localImages.size() > 0) {
            //设置Banners高度
            banners.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, ScreenUtils.dip2px(this, 200)));
            //本地用法
            banners.setAdapter(new LocalImgAdapter(MainActivity.this), localImages);
            //网络图片
            //banners.setAdapter(new UrlImgAdapter(MainActivity.this), networkImages);
            //参数设置
            banners.setAutoPlay(true);//自动播放
            banners.setVertical(false);//是否可以垂直
            banners.setScrollDurtion(2000);//两页切换时间
            banners.setCanLoop(true);//循环播放
            banners.setHoriZontalTransitionEffect(TransitionEffect.Flip);//Flip//自定义样式
            banners.setDurtion(60000);//切换时间
            banners.hideIndicatorLayout();//隐藏原点
        }

    }


    @Override
    protected void onPause() {
        super.onPause();
        for (int i = 0; i < lmBannersList.size(); i++) {
            lmBannersList.get(i).stopImageTimerTask();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();
        for (int i = 0; i < lmBannersList.size(); i++) {
            lmBannersList.get(i).startImageTimerTask();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        for (int i = 0; i < lmBannersList.size(); i++) {
            lmBannersList.get(i).clearImageTimerTask();
        }
    }

    /**
     * app自动更新
     */
    public void appUpdate() {
        if (NetworkUtils.isConnected(MainActivity.this)) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    AppUpdate app = new AppUpdate(MainActivity.this);
                    Log.i("AppUpdate", "检查应用版本号");
                    app.checkUpdateForPower(new AppUpdate.OnResult() {
                        @Override
                        public void onNewVersion() {
                            Log.i("AppUpdate", "app有新版本");
                            Toast.makeText(MainActivity.this, "app有新版本", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onLatestVersion() {
                            Log.i("AppUpdate", "app已是最新版本");
                            Toast.makeText(MainActivity.this, "app已是最新版本", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onDownloading(long current, long total) {
                            Log.i("AppUpdate", "app正在下载");
                            Toast.makeText(MainActivity.this, "app正在下载", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onDownLoaCompleted() {
                            Log.i("AppUpdate", "app下载成功");
                            Toast.makeText(MainActivity.this, "app下载成功", Toast.LENGTH_SHORT).show();
                        }

                        @Override
                        public void onError() {
                            Log.i("AppUpdate", "app下载失败");
                        }
                    });
                }
            }).start();
        } else {
            Log.i("AppUpdate", "网络没有连接");
        }
    }
}