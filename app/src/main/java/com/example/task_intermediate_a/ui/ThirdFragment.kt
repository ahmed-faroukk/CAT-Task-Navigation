package com.example.task_intermediate_a.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.task_intermediate_a.R

class ThirdFragment : Fragment(R.layout.fragment_third) {

    lateinit var toFirstBtn: Button
    lateinit var toSecondBtn: Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        toFirstBtn = view.findViewById(R.id.Third_ToFirst)
        toSecondBtn = view.findViewById(R.id.Third_ToSecond)
        toFirstBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                view.findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToFirstFragment())
            }
        })
        toSecondBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                view.findNavController().navigate(ThirdFragmentDirections.actionThirdFragmentToSecondFragment("Please Enter Your Name In First Fragment"))
            }
        })

    }


}