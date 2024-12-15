package com.tim

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tim.databinding.ActivityEditorBinding

public class EditorActivity : AppCompatActivity() {

    private var _binding: ActivityEditorBinding? = null
    
    private val binding: ActivityEditorBinding
      get() = checkNotNull(_binding) { "Activity has been destroyed" }
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate and get instance of binding
        _binding = ActivityEditorBinding.inflate(layoutInflater)

        // set content view to binding's root
        setContentView(binding.root)
    }
    
    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}
