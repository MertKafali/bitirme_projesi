package com.example.yemek_siparis.data.repo

import androidx.lifecycle.MutableLiveData
import com.example.yemek_siparis.data.entity.Yemekler

class YemeklerDaoRepository {
    var yemeklerListesi:MutableLiveData<List<Yemekler>>

    init {
    yemeklerListesi = MutableLiveData()
    }

    fun yemekleriGetir() : MutableLiveData<List<Yemekler>>{
        return yemeklerListesi
    }

    fun yemekEkle(yemek_ad:String,yemek_fiyat:String){

    }

    fun yemekSil(yemek_id:Int){

    }
}