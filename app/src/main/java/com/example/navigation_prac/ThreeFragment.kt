package com.example.navigation_prac

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation_prac.databinding.FragmentThreeBinding

class ThreeFragment : Fragment() {
    private var _binding: FragmentThreeBinding? = null
    private val binding: FragmentThreeBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentThreeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnThreeByOne.setOnClickListener {
            findNavController().navigate(R.id.action_threeFragment_to_oneFragment)
        }
        binding.btnThreeByTwo.setOnClickListener {
            findNavController().navigate(R.id.action_threeFragment_to_twoFragment)
        }
    }
}

