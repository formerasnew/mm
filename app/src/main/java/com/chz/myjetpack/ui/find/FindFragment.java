package com.chz.myjetpack.ui.find;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.chz.libnavannotation.FragmentDestination;
import com.chz.myjetpack.R;
@FragmentDestination(pageUrl = "main/tabs/find",asStarter = false)
public class FindFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_find, container, false);
    }
}