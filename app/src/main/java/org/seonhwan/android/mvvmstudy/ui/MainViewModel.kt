package org.seonhwan.android.mvvmstudy.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import org.seonhwan.android.mvvmstudy.domain.entity.ExampleEntity
import org.seonhwan.android.mvvmstudy.domain.repository.ExampleRepository
import timber.log.Timber
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val exampleRepository: ExampleRepository,
) : ViewModel() {
    private val _exampleData = MutableLiveData<ExampleEntity>()
    val exampleData: LiveData<ExampleEntity> get() = _exampleData

    fun getExampleData() {
        viewModelScope.launch {
            exampleRepository.getExample()
                .onSuccess { response ->
                    _exampleData.value = response
                }
                .onFailure {
                    Timber.tag("getExampleDataFailure").d(it)
                }
        }
    }
}
