package com.youlong.stateswitch.library;

import android.content.Context;
import android.support.annotation.NonNull;

/**
 * @ProjectName: StateLayout
 * @Package: com.youlong.stateswitch.library
 * @ClassName: IngCreator
 * @Author: xzg
 * @CreateDate: 2019/1/22 10:24
 * @UpdateUser: 更新者
 * @UpdateDate: 2019/1/22 10:24
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 * @description: （java类作用描述）
 */
public interface IngCreator {
    @NonNull
    StateIngInterface createStateIng(@NonNull Context context, @NonNull StateLayout layout);

}
