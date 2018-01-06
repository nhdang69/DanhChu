package com.example.diorous.danhchu.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.diorous.danhchu.View.DangkyDangNhap.DangKy.FragmentDangKy;
import com.example.diorous.danhchu.View.DangkyDangNhap.DangNhap.FragmentDangNhap;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Diorous on 1/6/2018.
 */

public class ViewpagerAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragments=new ArrayList<>();
    private List<String> NameFragments=new ArrayList<>();
    public ViewpagerAdapter(FragmentManager fm) {
        super(fm);
        KhoiTaoListFragment();
    }

    private void KhoiTaoListFragment() {
        FragmentDangNhap fragmentDangNhap=new FragmentDangNhap();
        String dangnhap="Đăng nhập";
        fragments.add(fragmentDangNhap);
        NameFragments.add(dangnhap);

        FragmentDangKy fragmentDangKy=new FragmentDangKy();
        String dangky="Đăng ký";
        fragments.add(fragmentDangKy);
        NameFragments.add(dangky);
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return NameFragments.get(position);
    }
}
