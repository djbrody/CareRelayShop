package com.brody.carerelayshop

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.brody.carerelayshop.model.Product
import com.brody.carerelayshop.repos.ProductsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainFragmentViewModel : ViewModel() {

    val products = MutableLiveData<List<Product>>()

    fun setup() {
        viewModelScope.launch(Dispatchers.Default) {
            products.postValue(ProductsRepository().fetchAllProductsRetrofit())
        }
    }

    fun search(term: String) {
        viewModelScope.launch(Dispatchers.Default) {
            products.postValue(ProductsRepository().searchForProducts(term))
        }
    }
}
