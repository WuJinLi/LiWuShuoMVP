package com.virgil.presentpj.ui.category.danpin;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.util.SimpleArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import com.virgil.presentpj.R;
import com.virgil.presentpj.bean.CategoriesBean;
import com.virgil.presentpj.bean.CategroyDanPinBean;
import com.virgil.presentpj.widget.ExpandListView;

import java.util.List;
import java.util.Map;

/**
 * Created by My on 2016/8/31.
 */
public class DanPinFragment extends Fragment implements DanPinContract.View {
    private ListView listView_danpin;
    private DanPinPresenter presenter;
    private Context mContext;
    private SimpleAdapter simpleAdapter;
    private ListView listView_right;
    private RightListViewAdapter rightListViewAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable
    Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_danpin, container, false);
        listView_danpin = (ListView) view.findViewById(R.id.listView_danpin);
        listView_right = (ListView) view.findViewById(R.id.listView_danpin_right);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mContext = getContext();
        presenter = new DanPinPresenter(this);
        presenter.getCategroyDanPinBean();
    }

    @Override
    public void getCategroyDanPinBeanSuccess(List<Map<String, String>> titles, List<CategoriesBean>
            params) {
        simpleAdapter = new SimpleAdapter(mContext, titles, R.layout.item_listview_left, new
                String[]{"name"}, new int[]{R.id.textview_name});
        listView_danpin.setAdapter(simpleAdapter);

        rightListViewAdapter = new RightListViewAdapter(mContext, params);
        listView_right.setAdapter(rightListViewAdapter);
        listView_danpin.setChoiceMode(AbsListView.CHOICE_MODE_SINGLE);
        listView_danpin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                listView_right.setSelection(position);
            }
        });
        listView_right.setOnScrollListener(new AbsListView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(AbsListView view, int scrollState) {

            }

            @Override
            public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount,
                                 int totalItemCount) {
            }
        });
    }

    @Override
    public void getCategroyDanPinBeanFail(String error) {
        Toast.makeText(mContext, error, Toast.LENGTH_SHORT).show();
    }
}
