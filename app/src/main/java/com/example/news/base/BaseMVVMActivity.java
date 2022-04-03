/*
 * Copyright Text :
 * Created by Tuan on 4/3/22, 7:39 PM
 *  Copyright (c) 2022 . All rights reserved.
 *  Last modified 4/3/22, 6:55 PM
 */

package com.example.news.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewbinding.ViewBinding;

public abstract class BaseMVVMActivity<V extends ViewBinding, VM extends BaseViewModel> extends BaseActivity {
    private V binding;
    private VM viewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = getLayoutBinding();
        setContentView(binding.getRoot());
        viewModel = new ViewModelProvider(this).get(getViewModelClass());
        registerViewModelObs();
        registerBaseViewModelObs();
        registerViewEvent();
        initialize();
        initTitle();
        initViewPager();
    }

    protected V getViewBinding() {
        return binding;
    }

    protected VM getViewModel() {
        return viewModel;
    }

    protected abstract Class<VM> getViewModelClass();

    protected abstract V getLayoutBinding();

    protected abstract void initialize();

    protected abstract void initTitle();

    protected abstract void initViewPager();

    protected abstract void registerViewEvent();

    protected abstract void registerViewModelObs();

    private void registerBaseViewModelObs() {
        viewModel.errorMessageObs.observe(this, msg -> showToast(msg));

    }
}