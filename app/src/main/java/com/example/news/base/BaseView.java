/*
 * Copyright Text :
 * Created by Tuan on 4/3/22, 7:40 PM
 *  Copyright (c) 2022 . All rights reserved.
 *  Last modified 4/3/22, 6:49 PM
 */

package com.example.news.base;

public interface BaseView {
    void showLoading();

    void hideLoading();

    void onError(String error);
}
