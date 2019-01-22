package com.youlong.stateswitch.library;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * @ProjectName: StateLayout
 * @Package: com.youlong.stateswitch.library
 * @ClassName: ErrorCreator
 * @Author: xzg
 * @CreateDate: 2019/1/22 10:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/22 10:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */
public interface ErrorCreator {
    @NonNull
    StateErrorInterface createStateError(@NonNull Context context, @NonNull StateLayout layout);
}
