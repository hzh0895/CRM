package com.example.showjoy.crm.contact.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.showjoy.crm.contact.fragment.ContactFragment;

/**
 * Created by ShowJoy on 16/5/26.
 */
public class ContactPagerAdapter extends FragmentPagerAdapter {

    public ContactPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch(position) {
            case 0: return new ContactFragment();
            case 1: return new ContactFragment();
            default: return null;
        }
    }

    @Override
    public int getCount() {
        return 2;
    }
}
