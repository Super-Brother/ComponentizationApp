package com.wenchao.login;

import android.content.Context;
import android.content.Intent;

import com.wenchao.componentlib.ILoginService;

/**
 * @author wenchao
 * @date 2019/7/8.
 * @time 13:09
 * description：
 */
public class LoginServiceImpl implements ILoginService {

    @Override
    public void launch(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, LoginActivity.class);
        context.startActivity(intent);
    }
}
