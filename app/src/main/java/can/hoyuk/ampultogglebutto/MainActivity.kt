package can.hoyuk.ampultogglebutto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import can.hoyuk.ampultogglebutto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var  binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.toggleButton.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked)
                binding.kkk.setImageResource(R.drawable.aaaa)
            else
                binding.kkk.setImageResource(R.drawable.kkkk)
        }
    }
}