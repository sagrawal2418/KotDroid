package com.quanitika.kotdroid

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.quanitika.kotdroid.databinding.MainActivityBinding

class MainActivity : AppCompatActivity() {
    private var binding: MainActivityBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)
        binding?.nameTv?.text = "Hello Sam"
    }
}
