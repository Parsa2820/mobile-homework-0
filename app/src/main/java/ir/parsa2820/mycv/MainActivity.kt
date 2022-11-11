package ir.parsa2820.mycv

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val callMeButton: Button = findViewById(R.id.callMeButton)
        callMeButton.setOnClickListener {
            val number: String = getString(R.string.number)
            val numberUri: Uri = Uri.parse(number)
            val intent = Intent(Intent.ACTION_DIAL, numberUri)
            startActivity(intent)
        }

        val nightModeSwitch: SwitchMaterial = findViewById(R.id.nightModeSwitch)
        nightModeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_YES
            } else {
                delegate.localNightMode = AppCompatDelegate.MODE_NIGHT_NO
            }
        }
    }
}