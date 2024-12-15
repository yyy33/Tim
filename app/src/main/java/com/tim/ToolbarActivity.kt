package com.tim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tim.databinding.ActivityToolbarBinding

public class ToolbarActivity : AppCompatActivity() {

    private var _binding: ActivityToolbarBinding? = null
    
    private val binding: ActivityToolbarBinding
      get() = checkNotNull(_binding) { "Activity has been destroyed" }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate and get instance of binding
        _binding = ActivityToolbarBinding.inflate(layoutInflater)

        // set content view to binding's root
        setContentView(binding.root)
    }
    
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
