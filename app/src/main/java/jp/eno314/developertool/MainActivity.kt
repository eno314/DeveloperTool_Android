package jp.eno314.developertool

import androidx.databinding.DataBindingUtil
import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jp.eno314.developertool.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.button.setOnClickListener {
            val inputText = binding.textInputLayout.editText?.text?.toString()
                    ?: return@setOnClickListener
            binding.root.setBackgroundColor(Color.parseColor(inputText))
        }
    }
}
