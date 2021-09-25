package com.talla.kotlindaggerhilt

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import javax.inject.Named
@HiltViewModel
class TestViewModel @Inject constructor(
    @Named("one") secStr:String
) : ViewModel() {

    init {
        Log.d("MainActivity", "ViewModel Output $secStr")
    }

}