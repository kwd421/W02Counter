package com.example.w02counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.w02counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var main: ActivityMainBinding
    private var count = 0// var은 변수, val은 상수
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        main = ActivityMainBinding.inflate(layoutInflater)

        setContentView(main.root)

        main.btnAdd.setOnClickListener {
            //count++
            main.txtCount.text = "${++count}"       //"" + ++count
        }

        main.btnSub.setOnClickListener{
            if(count > 0)
                main.txtCount.text = "${--count}"
        }
        main.btnReset.setOnClickListener {
            count = 0
            main.txtCount.text = "$count"
        }
    }
}