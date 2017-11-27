package com.example.pc31.circleprogressbar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var customView = CirecleZoomView(this)

        setContentView(customView)

    }
}
