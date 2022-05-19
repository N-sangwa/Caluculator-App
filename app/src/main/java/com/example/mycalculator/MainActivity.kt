package com.example.mycalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //initializing edittext
    lateinit var etNum1 : EditText
    lateinit var etNum2 : EditText

    //initializing buttons
    lateinit var add : Button
    lateinit var sub : Button
    lateinit var multply : Button
    lateinit var mode : Button

    //initializing textview
    lateinit var answer : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //casting edit text
        etNum1 = findViewById(R.id.etNum1)
        etNum2 = findViewById(R.id.etNum2)

        //casting buttons
        add = findViewById(R.id.btnAdd)
        sub = findViewById(R.id.btnSub)
        multply = findViewById(R.id.btnMult)
        mode = findViewById(R.id.btnModulus)

        //casting textView
        answer = findViewById(R.id.tvAnswer)


        //setting on click Listener
        add.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()

            if(num1.isBlank()){
                etNum1.error = "Input required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNum2.error = "Input required"
                return@setOnClickListener
            }
            addValues(num1.toDouble(), num2.toDouble())
        }

        //subtract button
        sub.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()

            if(num1.isBlank()){
                etNum1.error = "Input required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNum2.error = "Input required"
                return@setOnClickListener
            }
            subsractValues(num1.toDouble(), num2.toDouble())
        }

        // multiplication button
        multply.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()

            if(num1.isBlank()){
                etNum1.error = "Input required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNum2.error = "Input required"
                return@setOnClickListener
            }
            multiplicateValues(num1.toDouble(), num2.toDouble())
        }

        //modulus button
        mode.setOnClickListener {
            var num1 = etNum1.text.toString()
            var num2 = etNum2.text.toString()

            if(num1.isBlank()){
                etNum1.error = "Input required"
                return@setOnClickListener
            }
            if (num2.isBlank()){
                etNum2.error = "Input required"
                return@setOnClickListener
            }
            modelus(num1.toDouble(), num2.toDouble())
        }
    }

    fun addValues(num1: Double, num2: Double){
        val addition = num1 + num2
        answer.text = addition.toString()

    }
    fun subsractValues  (num1: Double,num2: Double){
       var difference =  num1 - num2
        answer.text = difference.toString()
    }
    fun multiplicateValues (num1: Double , num2: Double){
        var factors = num1*num2
        answer.text = factors.toString()
    }
    fun modelus( num1: Double, num2: Double){
        var mode = num1 % num2
        answer.text = mode.toString()
    }
}
