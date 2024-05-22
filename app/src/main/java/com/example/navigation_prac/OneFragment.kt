package com.example.navigation_prac

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.navigation_prac.databinding.FragmentOneBinding


class OneFragment : Fragment() {
    private var _binding: FragmentOneBinding? = null
    private val binding: FragmentOneBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTwoByOne.setOnClickListener{
            findNavController().navigate(R.id.action_oneFragment_to_twoFragment)
        }
        binding.btnThreeByOne.setOnClickListener{
            findNavController().navigate(R.id.action_oneFragment_to_threeFragment)
        }
    }

}