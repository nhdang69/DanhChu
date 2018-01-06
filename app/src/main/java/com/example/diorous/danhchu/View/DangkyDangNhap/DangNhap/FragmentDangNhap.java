package com.example.diorous.danhchu.View.DangkyDangNhap.DangNhap;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diorous.danhchu.R;

/**
 * Created by Diorous on 1/6/2018.
 */

public class FragmentDangNhap extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LayoutInflater layoutInflater= (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view=layoutInflater.inflate(R.layout.fragment_dangnhap,container,false);
        return view;
    }
}
