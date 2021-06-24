package com.omar67.mylibrary

import android.annotation.SuppressLint
import android.content.Context
import android.graphics.Canvas
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import android.util.Log
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController

class MyContainer(context: Context, attrs: AttributeSet) : ConstraintLayout(context, attrs) {
    private var container: ConstraintLayout? = null

    init {
        inflate(context, R.layout.modern_container, this)
        container = this.findViewById(R.id.myContainerContainer)
    }

    /**
     * Setup NavController with the custom title bar, By doing so the title will automatically detect the fragment label and set it as title
     * also will check if there is a back stack then a back button will show up and will be clickable to go back
     *
     * @param nav NavController to adapt with
     * @param onBackClicked optional param, will trigger a custom function that will be called whenever the back button is called
     *
     */
    fun setupNavController(nav: NavController, onBackClicked: () -> Unit = {handleBackBtn(nav)} ) {
        nav.addOnDestinationChangedListener { controller, destination, _ ->
            this.findViewById<TextView>(R.id.myContainerTitle).text = destination.label
            this.findViewById<Button>(R.id.myContainerBackBtn).let {
                if (controller.previousBackStackEntry != null)
                    it.visibility = VISIBLE
                else
                    it.visibility = INVISIBLE

                it.setOnClickListener {
                    onBackClicked.invoke()
                }
            }
        }
    }

    private fun handleBackBtn(controller: NavController) {
        controller.navigateUp()
    }

    override fun addView(child: View?, index: Int, params: ViewGroup.LayoutParams?) {
        container?.addView(child, index, params) ?: super.addView(child, index, params)
    }

    override fun addView(child: View?) {
        container?.addView(child) ?: super.addView(child)
    }

    override fun addView(child: View?, index: Int) {
        container?.addView(child, index) ?: super.addView(child, index)
    }

    override fun addView(child: View?, width: Int, height: Int) {
        container?.addView(child, width, height) ?: super.addView(child, width, height)
    }

    override fun addView(child: View?, params: ViewGroup.LayoutParams?) {
        container?.addView(child, params) ?: super.addView(child, params)
    }

}