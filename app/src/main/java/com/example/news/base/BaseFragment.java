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