package com.example.yemek_siparis.ui.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.yemek_siparis.R
import com.example.yemek_siparis.data.entity.Yemekler
import com.example.yemek_siparis.databinding.CardTasarimBinding

class YemeklerAdapter (var mContext:Context, var yemeklerListesi:List<Yemekler>) : RecyclerView.Adapter<YemeklerAdapter.CardTasarimTutucu>(){
    inner class CardTasarimTutucu(tasarim:CardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root){
        var tasarim:CardTasarimBinding
        init {
            this.tasarim = tasarim
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val layoutInflater = LayoutInflater.from(mContext)
        val tasarim = CardTasarimBinding.inflate(layoutInflater, parent, false)
        return CardTasarimTutucu(tasarim)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val yemek = yemeklerListesi.get(position)
        val t = holder.tasarim
        t.textViewAd.text = "${yemek}"

        t.satirCard.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.git_yemekdetay)
        }

    }

    override fun getItemCount(): Int {
        return yemeklerListesi.size
    }
}