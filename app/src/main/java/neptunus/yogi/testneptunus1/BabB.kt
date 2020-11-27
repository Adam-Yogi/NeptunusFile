package neptunus.yogi.testneptunus1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_bab_b.*

class BabB : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bab_b)


        val button = findViewById<ImageView>(R.id.back_2)
        button.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)

            startActivity(intent)
        }

        val videoView = findViewById<VideoView>(R.id.videoView2)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.proses_evolusi_bumi
        val uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)


    }
}