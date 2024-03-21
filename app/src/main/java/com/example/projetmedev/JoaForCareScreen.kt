package com.example.projetmedev

import androidx.annotation.StringRes

enum class CupcakeScreen(@StringRes val title: Int) {
    Login(title = R.string.login),
    Home(title = R.string.home)
}