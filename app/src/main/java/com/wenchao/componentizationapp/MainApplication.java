package com.wenchao.componentizationapp;

import android.app.Application;

import com.wenchao.componentlib.AppConfig;
import com.wenchao.componentlib.IAppComponent;

/**
 * @author wenchao
 * @date 2019/7/8.
 * @time 13:38
 * description：
 */
public class MainApplication extends Application implements IAppComponent {

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application application) {
        for (String component : AppConfig.COMPONENTS) {
            try {
                Class<?>  clazz = Class.forName(component);
                Object object = clazz.newInstance();
                if(object instanceof IAppComponent){
                    ((IAppComponent)object).initialize(this);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
