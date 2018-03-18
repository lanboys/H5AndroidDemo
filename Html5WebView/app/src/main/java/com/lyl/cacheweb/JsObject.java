package com.lyl.cacheweb;

import android.util.Log;
import android.webkit.JavascriptInterface;

/**
 * Created by 蓝兵 on 2018/1/24.
 */

public class JsObject implements JsInterface {

    // 定义JS需要调用的方法
    // 被JS调用的方法必须加入@JavascriptInterface注解
    @JavascriptInterface
    @Override
    public void helloAndroid(String msg) {

        Log.i("Html5WebChromeClient", "helloAndroid: " + msg);
    }
}


//  js代码调用
//  var androidObjectName = Android_Object_JsObject;//android中定义的名字
//
//  var callAndroid1 = function () {
//      androidObjectName.helloAndroid("我是来自js的代码")
//  };