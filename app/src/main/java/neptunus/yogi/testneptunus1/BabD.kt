package neptunus.yogi.testneptunus1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class BabD : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bab_d)

        val button = findViewById<ImageView>(R.id.back_d)
        button.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)

            startActivity(intent)
        }
    }
}