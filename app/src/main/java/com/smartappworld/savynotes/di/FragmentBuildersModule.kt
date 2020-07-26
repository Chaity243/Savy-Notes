package com.smartappworld.savynotes.di


import com.smartappworld.savynotes.ui.main.AddFragment
import com.smartappworld.savynotes.ui.main.EditFragment
import com.smartappworld.savynotes.ui.main.ListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector


// declare all the fragments here , dependency of fragments are provided by this module

@Module
abstract class FragmentBuildersModule {

    // Method #1
    @ContributesAndroidInjector
    abstract fun contributeListFragment(): ListFragment

    // Method #2
    @ContributesAndroidInjector
    abstract fun contributeAddFragment(): AddFragment

    // Method #3
    @ContributesAndroidInjector
    abstract fun contributeEditFragment(): EditFragment
}