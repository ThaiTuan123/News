/*
 * Copyright Text :
 * Created by Tuan on 4/3/22, 7:39 PM
 *  Copyright (c) 2022 . All rights reserved.
 *  Last modified 4/3/22, 6:49 PM
 */

package com.example.news.base;

import android.widget.Toast;

import androidx.fragment.app.Fragment;


public abstract class BaseFragment extends Fragment {

    protected void showToast(String message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    protected void showToast(int message) {
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

}