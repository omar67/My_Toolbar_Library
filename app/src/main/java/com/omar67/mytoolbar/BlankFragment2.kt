package com.omar67.mytoolbar

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.findNavController

/**
 * Sample second blank fragment to test the library logic
 */

class BlankFragment2 : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v =  inflater.inflate(R.layout.fragment_blank2, container, false)
        // Inflate the layout for this fragment
        v.findViewById<Button>(R.id.secondToFirst).setOnClickListener {
            v.findNavController().navigateUp()
//                .navigate(R.id.blankFragment)
        }
        return v
    }
}