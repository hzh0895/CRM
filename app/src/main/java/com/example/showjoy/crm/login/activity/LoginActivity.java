package com.example.showjoy.crm.login.activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.showjoy.crm.R;
import com.example.showjoy.crm.main.activity.MainActivity;
import com.example.showjoy.crm.util.BaseActivity;

public class LoginActivity extends BaseActivity {
    private View nextButton;

    public static void activityStart(Context context) {
        Intent intent = new Intent(context, LoginActivity.class);
        context.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initData();
    }

    private void initView() {
        nextButton = findViewById(R.id.next_button);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.activityStart(LoginActivity.this);
                LoginActivity.this.finish();
            }
        });
    }

    private void initData() {

    }
}
