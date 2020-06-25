package com.example.pagetitlestrip;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context=null;

    public FragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context=context;
    }


    @Override
    public Fragment getItem(int position) {
        return (PageFragment.newInstance(position));
    }

    @Override
    public int getCount() {
        return 10;
    }

    @Override
    public String getPageTitle(int position){
        return (PageFragment.getTitle(context,position));
    }
}
