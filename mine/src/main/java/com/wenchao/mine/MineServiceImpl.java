package com.wenchao.mine;

import android.content.Context;
import android.content.Intent;

import com.wenchao.componentlib.IMineService;

/**
 * @author wenchao
 * @date 2019/7/8.
 * @time 13:11
 * description：
 */
public class MineServiceImpl implements IMineService {
    @Override
    public void launch(Context context) {
        Intent intent = new Intent(context, MineActivity.class);
        context.startActivity(intent);
    }
}
