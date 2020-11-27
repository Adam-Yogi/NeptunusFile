package neptunus.yogi.testneptunus1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_2.*

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)


        fun click(view: View) {
            startActivity(Intent(this, MainActivity::class.java))
        }


        val button2 = findViewById<ImageView>(R.id.bab_a)

        button2.setOnClickListener {
            val intent = Intent(this, BabA::class.java)

            startActivity(intent)
        }

        val buttonBabB = findViewById<ImageView>(R.id.bab_b)

        buttonBabB.setOnClickListener {
            val intent = Intent(this, BabB::class.java)

            startActivity(intent)
        }

        val buttonBabC = findViewById<ImageView>(R.id.bab_c)

        buttonBabC.setOnClickListener {
            val intent = Intent(this, BabC::class.java)

            startActivity(intent)
        }

        val buttonBabD = findViewById<ImageView>(R.id.bab_d)

        buttonBabD.setOnClickListener {
            val intent = Intent(this, BabD::class.java)

            startActivity(intent)
        }

        val buttonBabE = findViewById<ImageView>(R.id.bab_e)

        buttonBabE.setOnClickListener {
            val intent = Intent(this, BabE::class.java)

            startActivity(intent)
        }

        val buttonBabF = findViewById<ImageView>(R.id.bab_f)

        buttonBabF.setOnClickListener {
            val intent = Intent(this, BabF::class.java)

            startActivity(intent)
        }

        val home1 = findViewById<ImageView>(R.id.home1)

        home1.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }

    }
}