package com.vu.android_fragments.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.vu.android_fragments.R;

public class settingFragment extends Fragment {

//    public settingFragment(){
//        super(R.layout.fragment_setting);
//
//    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
              return inflater.inflate(R.layout.fragment_setting, container, false);
    }
}
