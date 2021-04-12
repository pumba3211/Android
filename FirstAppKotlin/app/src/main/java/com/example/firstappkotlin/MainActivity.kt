package com.example.firstappkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        testVariables()
    }

    private fun testVariables(){
        //Variables start with var
        var testNumber = 1
        var text = "Hello my name is Ronald alias Pumba"

        //Constants start with val
        val constant = "The constant value cant change"

        println(constant)
    }
}