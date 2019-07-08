package com.wenchao.componentizationapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.wenchao.componentlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goLogin(View view) {
        ServiceFactory.getInstance().getILoginService().launch(this);
    }

    public void goMine(View view) {
        ServiceFactory.getInstance().getMineService().launch(this);
    }
}
