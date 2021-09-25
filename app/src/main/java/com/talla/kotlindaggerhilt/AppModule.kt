package com.talla.kotlindaggerhilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

//to tell dagger hilt this is module we annotate it with @Module
//@InstallIn() if we want to scope these dependencies what we declare in this module to tell dagger hild we want these
//dependencies to live how much time like ApplicationComponent or ActivityComponent or ServiceComponent
@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    //by using @Provides annotation we tell dagger hilt with this function we want to provide dependency which is this string
    @Singleton
    @Provides
    @Named("one")
    fun provideTestString() = "Hello World"

}