package com.example.nepalairlink;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private final List<Fragment> mFragmentList = new ArrayList<>();
    private final List<String> mFragmentTitleList = new ArrayList<>();
    private List<Product> productList= new ArrayList<>();

    public ViewPagerAdapter(FragmentManager manager){
        super(manager);
    }

    @Override
    public  Fragment getItem(int position){
        return mFragmentList.get(position);
    }

    public void addFragment (Fragment fragment, String title){
        productList.add(new Product());
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position){
        return  mFragmentTitleList.get(position);
    }

    @Override
    public int getCount(){
        return mFragmentList.size();
    }
}
