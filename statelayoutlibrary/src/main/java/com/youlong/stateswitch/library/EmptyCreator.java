package com.youlong.stateswitch.library;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * @ProjectName: StateLayout
 * @Package: com.youlong.stateswitch.library
 * @ClassName: EmptyCreator
 * @Author: xzg
 * @CreateDate: 2019/1/22 10:28
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/22 10:28
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */
public interface EmptyCreator {
    @NonNull
    StateEmptyInterface createStateEmpty(@NonNull Context context, @NonNull StateLayout layout);
}
