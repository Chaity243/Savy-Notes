package com.smartappworld.savynotes.di

import androidx.lifecycle.ViewModelProvider
import com.smartappworld.savynotes.util.ViewModelProviderFactory
import dagger.Binds
import dagger.Module


@Module
abstract class ViewModelFactoryModule {

    // Method #1
    @Binds
    abstract fun bindViewModelFactory(viewModelProvideFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}