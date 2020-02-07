package com.kanlulu.kotlin01.coroutine;

import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

import com.kanlulu.kotlin01.Utils;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/**
 * author:kanlulu
 * data  :2020-02-06 13:05
 **/
public class Dashboard {
    private final OkHttpClient mOkHttpClient = new OkHttpClient();
    private final Request mRequest = new Request.Builder().url("https://baidu.com").get().build();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    public void display(final TextView textView){
        mOkHttpClient.newCall(mRequest).enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                Utils.printInfo(e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                final String string = response.body().string();
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(string);
                    }
                });
            }
        });
    }
}
