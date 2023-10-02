package com.example.bookstore.helpers;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.example.bookstore.fragment.LibraryFragment;
import com.example.bookstore.fragment.SachNoiFragment;
import com.example.bookstore.fragment.SachTruyenFragment;
import com.example.bookstore.fragment.TruyenTranhFragment;

public class ViewPageAdapter extends FragmentStatePagerAdapter {

    public ViewPageAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new LibraryFragment();
            case 1:
                return new SachNoiFragment();
            case 2:
                return new SachTruyenFragment();
            case 3:
                return new TruyenTranhFragment();
            default:
                return new LibraryFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Thư viện";
                break;
            case 1:
                title = "Sách nói";
                break;
            case 2:
                title = "Sách truyện";
                break;
            case 3:
                title = "Truyện tranh";
                break;
        }
        return title;
    }
}
