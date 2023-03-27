package com.example.myapplication.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel


class DashboardViewModel : ViewModel() {
    var text = MutableLiveData<String>().apply {
        value = "0"
    }
}