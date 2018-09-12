package jp.eno314.developertool

import android.databinding.DataBindingUtil
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import jp.eno314.developertool.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener({
            val inputText = binding.textInputLayout.editText?.text?.toString()
                    ?: return@setOnClickListener
            binding.root.setBackgroundColor(Color.parseColor(inputText))
        })
    }
}
