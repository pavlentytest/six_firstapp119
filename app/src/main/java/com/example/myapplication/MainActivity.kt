package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var btn: Button
    private lateinit var tv: TextView
    private var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        tv = findViewById(R.id.textView)
        counter = savedInstanceState?.getInt("key") ?: 0
        tv.text = counter.toString()
        btn.setOnClickListener {
            counter++
            tv.text = counter.toString()
        }
        // pattern MVVM
        Log.d("RRR","onCreate()")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt("key",counter)
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("RRR","onRestart()")
    }

    override fun onStop() {
        super.onStop()
        Log.d("RRR","onStop()")
    }

    override fun onPause() {
        super.onPause()
        Log.d("RRR","onPause()")
    }

    override fun onStart() {
        super.onStart()
        Log.d("RRR","onStart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("RRR","onDestroy()")
    }

    override fun onResume() {
        super.onResume()
        Log.d("RRR","onResume()")
    }
}