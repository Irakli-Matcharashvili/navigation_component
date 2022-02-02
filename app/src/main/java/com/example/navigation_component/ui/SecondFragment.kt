package com.example.navigation_component.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation_component.R
import com.example.navigation_component.databinding.FirstFragmentBinding
import com.example.navigation_component.databinding.SecondFragmentBinding

class SecondFragment : Fragment() {

private lateinit var binding: SecondFragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = SecondFragmentBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.goToThirdFragmentButton.setOnClickListener {
            findNavController().navigate(R.id.actionSecondFragmentToThirdFragment)
        }
    }
}