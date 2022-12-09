package com.example.task_intermediate_a.ui

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.task_intermediate_a.R

class SecondFragment : Fragment(R.layout.fragment_second) {

    lateinit var tv: TextView
    lateinit var toFirstBtn: Button
    lateinit var toThirdBtn: Button
    lateinit var name: String
    val args: SecondFragmentArgs by navArgs()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tv = view.findViewById(R.id.Second_Name_Tv)
        toFirstBtn = view.findViewById(R.id.Second_ToFirst)
        toThirdBtn = view.findViewById(R.id.Second_ToThird)
        name = args.name
        tv.text = name

        toFirstBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                view.findNavController()
                    .navigate(SecondFragmentDirections.actionSecondFragmentToFirstFragment())
            }
        })

        toThirdBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                view.findNavController()
                    .navigate(SecondFragmentDirections.actionSecondFragmentToThirdFragment())
            }
        })
    }



}


