package com.talla.kotlindaggerhilt

import android.content.Context
import androidx.core.app.ActivityCompat
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

//to tell dagger hilt this is module we annotate it with @Module
//@InstallIn() if we want to scope these dependencies what we declare in this module to tell dagger hild we want these
//dependencies to live how much time like ApplicationComponent or ActivityComponent or ServiceComponent
@Module
@InstallIn(ActivityComponent::class)
object MainModule {

    //here @ActivityScoped means it says until this activity alive it lives and also it has only single instance
    @ActivityScoped
    @Provides
    @Named("two")
    fun provideTestString2(@ApplicationContext context:Context,
                           @Named("one")testTwo:String) = "${context.getString(R.string.hello_man)}-$testTwo"

}