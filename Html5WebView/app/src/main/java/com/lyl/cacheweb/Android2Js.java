package com.lyl.cacheweb;

import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by 蓝兵 on 2018/1/24.
 */

public class Android2Js implements JsInterface {

    // 定义JS需要调用的方法
    // 被JS调用的方法必须加入@JavascriptInterface注解
    @JavascriptInterface
    @Override
    public void helloAndroid(String msg) {
        System.out.println(msg);
        Log.i("Html5WebChromeClient", "helloAndroid: " + msg);
    }
}
