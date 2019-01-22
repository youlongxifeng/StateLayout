package com.youlong.stateswitch.library;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * @ProjectName: StateLayout
 * @Package: com.youlong.stateswitch.library
 * @ClassName: DefaultNoNetWorkView
 * @Author: xzg
 * @CreateDate: 2019/1/22 10:33
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/22 10:33
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */
public class DefaultNoNetWorkView extends LinearLayout implements StateNoNetworkInterface {

    private ImageView mImageView;
    private Animation mLoadingAnim;
    private TextView mTextHint;

    public DefaultNoNetWorkView(Context context) {
        this(context, null);
    }

    public DefaultNoNetWorkView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DefaultNoNetWorkView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
    }

    private void initView(Context context) {
        LayoutInflater.from(context).inflate(R.layout.view_default_no_network, this, true);
        mImageView = findViewById(R.id.image_loading);
        mLoadingAnim = AnimationUtils.loadAnimation(getContext(), R.anim.loading);
        mTextHint = findViewById(R.id.text_no_network_hit);
    }

    @NonNull
    @Override
    public View getView() {
        return this;
    }

    @Override
    public void setPromptMessage(String msg) {
        mTextHint.setText(msg);
    }

    @Override
    public void setOnRetryListener(OnRetryListener listener) {

    }

    @Override
    public void visible(boolean visible) {
        if (visible) {
            mImageView.startAnimation(mLoadingAnim);
        } else {
            mImageView.clearAnimation();
        }
    }

}
