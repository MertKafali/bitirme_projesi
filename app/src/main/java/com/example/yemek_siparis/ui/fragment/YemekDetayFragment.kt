package com.example.yemek_siparis.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.yemek_siparis.R
import com.example.yemek_siparis.data.repo.YemeklerDaoRepository
import com.example.yemek_siparis.databinding.FragmentSepetBinding
import com.example.yemek_siparis.databinding.FragmentYemekDetayBinding
import com.example.yemek_siparis.ui.adapter.YemeklerAdapter
import com.example.yemek_siparis.ui.viewModel.SepetFragmentViewModel
import com.example.yemek_siparis.ui.viewModel.YemekDetayFragmentViewModel

class YemekDetayFragment : Fragment() {
private lateinit var tasarim:FragmentYemekDetayBinding
private lateinit var viewModel:YemekDetayFragmentViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentYemekDetayBinding.inflate(inflater, container, false)


        tasarim.buttonSepeteEkle.setOnClickListener {
            var yemek_ad = tasarim.textViewYemekAd.text.toString()
            var yemek_fiyat = tasarim.textViewFiyatt.text.toString()
            viewModel.ekle(yemek_ad, yemek_fiyat)
        }

        return tasarim.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel: YemekDetayFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }


}