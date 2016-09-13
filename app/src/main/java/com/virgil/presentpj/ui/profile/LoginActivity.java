package com.virgil.presentpj.ui.profile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.virgil.presentpj.R;

public class LoginActivity extends AppCompatActivity {

    private ImageView imageview_login_close;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        initData();
    }

    private void initData() {
        imageview_login_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initView() {
        imageview_login_close = (ImageView) findViewById(R.id.imageview_login_close);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
