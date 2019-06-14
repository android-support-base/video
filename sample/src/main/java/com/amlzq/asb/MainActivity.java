package com.amlzq.asb;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {
    String TAG = "MainActivity";

    TextView mTVInfo;
    String mUrl = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1544530677745&di=481cf504b33ac77bd69a75197b718499&imgtype=0&src=http%3A%2F%2Fpic28.photophoto.cn%2F20130706%2F1190120561270420_b.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTVInfo = findViewById(R.id.tv_info);
    }

}
