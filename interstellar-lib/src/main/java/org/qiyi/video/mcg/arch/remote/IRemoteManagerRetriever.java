package org.qiyi.video.mcg.arch.remote;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;

/**
 * Created by wangallen on 2018/4/17.
 */

public interface IRemoteManagerRetriever {
    IRemoteManager get(Fragment fragment);

    IRemoteManager get(android.app.Fragment fragment);

    IRemoteManager get(FragmentActivity fragActivity);

    IRemoteManager get(Activity activity);

    IRemoteManager get(Context context);

    IRemoteManager get(View view);
}
