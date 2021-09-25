package com.talla.kotlindaggerhilt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.lifecycle.ViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


private const val TAG = "MainActivity"
//every time we want to Inject something using dagger Hilt we use this annotation for activity,fragment,service
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    //dagger hilt will see this @Inject annotation and it is type of
    // string it will check all modules and get the string instance and inject to it
    @Inject
    @Named("two")
    lateinit var myString: String

    private val viewModel:TestViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate: $myString")
        viewModel
    }

}