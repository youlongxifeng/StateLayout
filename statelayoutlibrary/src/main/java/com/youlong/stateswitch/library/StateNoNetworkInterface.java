package com.youlong.stateswitch.library;

import android.support.annotation.NonNull;
import android.view.View;

/**
 * @ProjectName: StateLayout
 * @Package: com.youlong.stateswitch.library
 * @ClassName: StateNoNetworkInterface
 * @Author: xzg
 * @CreateDate: 2019/1/22 10:32
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/22 10:32
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */

public interface StateNoNetworkInterface {

    interface OnRetryListener {

        void onRetry();
        void onUpdateDate();
    }

    /**
     * 获取实体视图
     *
     * @return 实体视图
     */
    @NonNull
    View getView();

    /**
     * 设置提示信息
     * @param msg
     */
    void setPromptMessage(String msg);

    /**
     * 设置重试监听
     * aram listener
     */
    void setOnRetryListener(OnRetryListener listener);

    /**
     * View是否显示(有的时候可能会启动一些动画，可以在这里做开始停止的动作)
     * @param visible
     */
    void visible(boolean visible);
}

