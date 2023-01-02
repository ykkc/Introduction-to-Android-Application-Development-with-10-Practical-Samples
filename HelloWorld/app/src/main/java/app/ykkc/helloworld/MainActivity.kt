package app.ykkc.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.ykkc.helloworld.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.morningButton.setOnClickListener {
            binding.greetingText.text = getString(R.string.good_morning_text)
        }
        binding.afternoonButton.setOnClickListener {
            binding.greetingText.text = getString(R.string.good_afternoon_text)
        }
        binding.eveningButton.setOnClickListener {
            binding.greetingText.text = getString(R.string.good_evening_text)
        }
    }
}