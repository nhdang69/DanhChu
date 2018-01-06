package com.example.diorous.danhchu.View.DangkyDangNhap;

import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.diorous.danhchu.Adapter.ViewpagerAdapter;
import com.example.diorous.danhchu.R;

public class DangKyDangNhap extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        KhoiTao();
        ThucHien();
        
    }

    private void ThucHien() {
        setupViewPager(viewPager);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        FragmentManager fragmentManager=getSupportFragmentManager();
        ViewpagerAdapter viewpagerAdapter=new ViewpagerAdapter(fragmentManager);
        viewPager.setAdapter(viewpagerAdapter);
    }

    private void KhoiTao() {
        tabLayout=findViewById(R.id.tabdangkydangnhap);
        viewPager=findViewById(R.id.vpdangkydangnhap);
    }
}
