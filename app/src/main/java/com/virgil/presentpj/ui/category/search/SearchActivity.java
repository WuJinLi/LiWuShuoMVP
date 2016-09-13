package com.virgil.presentpj.ui.category.search;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.virgil.presentpj.R;

/**
 * 搜索页面
 */
public class SearchActivity extends AppCompatActivity {

    private ImageView imageview_search_back;
    private EditText edittext_search;
    private TextView textview_search_search;
    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
        initView();
        initData();
    }

    private void initData() {
        mContext = this;
        textview_search_search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //点击搜索进行内容的搜索，和页面的跳转
                String trim = edittext_search.getText().toString().trim();
                if (trim .equals("")) {
                    Toast.makeText(mContext, "输入内容不能为空", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(SearchActivity.this, SearchDetailsActivity.class);
                    intent.putExtra("search", trim);
                    startActivity(intent);
                }
                edittext_search.setText("");
            }
        });
        imageview_search_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }

    private void initView() {
        imageview_search_back = (ImageView) findViewById(R.id.imageview_search_back);
        textview_search_search = (TextView) findViewById(R.id.textview_search_search);
        edittext_search = (EditText) findViewById(R.id.edittext_search);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }
}
