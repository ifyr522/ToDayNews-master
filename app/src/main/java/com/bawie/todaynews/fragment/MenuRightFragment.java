package com.bawie.todaynews.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bawie.todaynews.R;

/**
 * Created by Administrator on 2017/5/8.
 * time:
 * author:付智焱
 */

public class MenuRightFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.menuright_fragment,container,false);
        return  view;
    }
}
