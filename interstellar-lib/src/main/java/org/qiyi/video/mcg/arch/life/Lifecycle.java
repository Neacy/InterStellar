package org.qiyi.video.mcg.arch.life;

/**
 * Created by wangallen on 2018/3/27.
 */

public interface Lifecycle {

    void addListener(LifecycleListener listener);

    void removeListener(LifecycleListener listener);

}
