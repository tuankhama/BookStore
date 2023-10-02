package com.example.bookstore.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.bookstore.R;
import com.example.bookstore.helpers.ViewPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class LibraryFragment extends Fragment {
    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_library, container, false);
        mTabLayout = view.findViewById(R.id.tab_layout);
        mViewPager = view.findViewById(R.id.view_page);
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(requireActivity().getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPageAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
        return view;
    }
}
