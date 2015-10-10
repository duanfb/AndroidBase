package com.android.test.http;

import android.app.Activity;
import android.os.Bundle;
import android.os.Message;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.base.BaseActivity;
import com.android.test.R;

import butterknife.Bind;

/**
 * Created by Administrator on 2015/10/9 0009.
 */
public class TestHttpActivity extends BaseActivity {

    @Bind(R.id.tv1)
    TextView mTv1;
    @Bind(R.id.tv2)
    TextView mTv2;
    @Bind(R.id.iv)
    ImageView mIv;

    @Override
    protected int getMainContentViewId() {
        return R.layout.act_test_http;
    }

    @Override
    public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        TestHttpReq.request1(mHandler);
        TestHttpReq.request2(mHandler);
    }

    @Override
    public void onActivityStarted(Activity activity) {

    }

    @Override
    public void onActivityResumed(Activity activity) {

    }

    @Override
    public void onActivityPaused(Activity activity) {

    }

    @Override
    public void onActivityStopped(Activity activity) {

    }

    @Override
    public void onActivitySaveInstanceState(Activity activity, Bundle outState) {

    }

    @Override
    public void onActivityDestroyed(Activity activity) {

    }

    @Override
    public void handleMessage(Message msg) {
        super.handleMessage(msg);
        switch (msg.what) {
            case TestHttpReq.REQUEST_GET_FAIL://失败
                mTv1.setText("获取失败");
                break;
            case TestHttpReq.REQUEST_GET_SUCCESS://成功
                mTv1.setText((String) msg.obj);
                break;
            case TestHttpReq.REQUEST_POST_FAIL://失败
                mTv2.setText("获取失败");
                break;
            case TestHttpReq.REQUEST_POST_SUCCESS://成功
                mTv2.setText((String) msg.obj);
                break;
            default:
                break;
        }
    }


}