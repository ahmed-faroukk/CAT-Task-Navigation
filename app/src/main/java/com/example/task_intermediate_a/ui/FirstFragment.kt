package com.example.task_intermediate_a.ui

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.task_intermediate_a.R

class FirstFragment : Fragment(R.layout.fragment_first) {
        lateinit var getNameEt : EditText
        lateinit var nameAlertTv : TextView
        lateinit var toSecondBtn : Button
        lateinit var toThirdBtn : Button
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getNameEt = view.findViewById(R.id.appCompatEditText)
        nameAlertTv = view.findViewById(R.id.ForgetPassTv)
        toSecondBtn = view.findViewById(R.id.First_ToSecond)
        toThirdBtn = view.findViewById(R.id.First_ToThird)
        nameAlertTv.visibility = View.INVISIBLE
        toSecondBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                if(getNameEt.text.isEmpty())
                    nameAlertTv.visibility = View.VISIBLE
                else{
                    nameAlertTv.visibility = View.INVISIBLE
                    view.findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToSecondFragment(name = getNameEt.text.toString()))
                }

            }
        })

        toThirdBtn.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                    nameAlertTv.visibility = View.INVISIBLE
            view.findNavController().navigate(FirstFragmentDirections.actionFirstFragmentToThirdFragment())

            }
        })



    }


}