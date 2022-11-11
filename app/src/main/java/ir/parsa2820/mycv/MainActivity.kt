package ir.parsa2820.mycv

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val callMeButton: Button = findViewById(R.id.button)
        callMeButton.setOnClickListener {
            val toast: Toast = Toast.makeText(this, "Calling...", Toast.LENGTH_SHORT)
            toast.show()
            val number: Uri = Uri.parse(R.string.number.toString())
            val intent = Intent(Intent.ACTION_DIAL, number)
            startActivity(intent)
        }
    }
}