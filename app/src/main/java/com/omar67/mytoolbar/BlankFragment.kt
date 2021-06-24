package com.omar67.mytoolbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

/**
 * Sample blank fragment to test the library logic
 */
class BlankFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v =  inflater.inflate(R.layout.fragment_blank, container, false)

        v.findViewById<Button>(R.id.firstToSecondBtn).setOnClickListener {
            v.findNavController().navigate(R.id.action_blankFragment_to_blankFragment24)

        }
        return v
    }


}