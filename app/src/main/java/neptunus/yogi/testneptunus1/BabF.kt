package neptunus.yogi.testneptunus1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView

class BabF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bab_f)

        val button = findViewById<ImageView>(R.id.back_f)
        button.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)

            startActivity(intent)
        }

        val videoView = findViewById<VideoView>(R.id.videoView6)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.homo_sapiens
        val uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)
    }
}