package ir.parsa2820.mycv

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val callMeButton: Button = findViewById(R.id.callMeButton)
        callMeButton.setOnClickListener {
            val number: Uri = Uri.parse(R.string.number.toString())
            val toast: Toast = Toast.makeText(this, number.toString(), Toast.LENGTH_SHORT)
            toast.show()
            val intent = Intent(Intent.ACTION_DIAL, number)
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