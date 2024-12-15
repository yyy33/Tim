package com.tim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tim.databinding.ActivityBBinding

public class BActivity : AppCompatActivity() {

    private var _binding: ActivityBBinding? = null
    
    private val binding: ActivityBBinding
      get() = checkNotNull(_binding) { "Activity has been destroyed" }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate and get instance of binding
        _binding = ActivityBBinding.inflate(layoutInflater)

        // set content view to binding's root
        setContentView(binding.root)
    }
    
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
