package com.example.yemek_siparis.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.yemek_siparis.R
import com.example.yemek_siparis.databinding.FragmentAnasayfaBinding
import com.example.yemek_siparis.databinding.FragmentSepetBinding
import com.example.yemek_siparis.ui.viewModel.SepetFragmentViewModel


class SepetFragment : Fragment() {
private lateinit var tasarim:FragmentSepetBinding
private lateinit var viewModel: SepetFragmentViewModel
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentSepetBinding.inflate(inflater, container, false)

        return tasarim.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tempViewModel:SepetFragmentViewModel by viewModels()
        viewModel = tempViewModel
    }

}