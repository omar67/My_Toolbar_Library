package com.omar67.mytoolbar

import android.os.Bundle
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration

import com.omar67.mytoolbar.databinding.ActivityMainBinding

/*
Sample main activity to test the library
 */
class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        
        binding.myContainer.setupNavController(findNavController(R.id.fragmentContainer))
        
//        binding.myContainer.setupNavController(findNavController(R.id.fragmentContainer), onBackClicked = {
//            Toast.makeText(this, "Back button pressed", Toast.LENGTH_SHORT).show()
//        })
    }
}