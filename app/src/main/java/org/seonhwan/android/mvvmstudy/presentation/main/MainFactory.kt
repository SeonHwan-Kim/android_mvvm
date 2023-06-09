package org.seonhwan.android.mvvmstudy.presentation.main

import android.os.Bundle
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.savedstate.SavedStateRegistryOwner

@Suppress("UNCHECKED_CAST")
class MainFactory(
    private val counter: Int,
    owner: SavedStateRegistryOwner,
    defaultArgs: Bundle? = null,
): AbstractSavedStateViewModelFactory(owner, defaultArgs){
    override fun <T : ViewModel> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
        if(modelClass.isAssignableFrom(MainViewModel::class.java)){
            return MainViewModel(counter, handle) as T
        }
        throw IllegalArgumentException("ViewModel class not found")
    }

}