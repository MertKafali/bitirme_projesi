package com.example.yemek_siparis.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.yemek_siparis.data.repo.YemeklerDaoRepository

class YemekDetayFragmentViewModel : ViewModel()  {
    val yrepo = YemeklerDaoRepository()

    fun ekle(yemek_ad:String,yemek_fiyat:String){
        yrepo.yemekEkle(yemek_ad,yemek_fiyat)
    }
}