package com.example.news.base;

public interface BaseView {
    void showLoading();

    void hideLoading();

    void onError(String error);
}
