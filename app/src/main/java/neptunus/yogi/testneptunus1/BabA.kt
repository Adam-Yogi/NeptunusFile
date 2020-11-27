package neptunus.yogi.testneptunus1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.MediaController
import android.widget.VideoView

class BabA : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bab_a)

        val button = findViewById<ImageView>(R.id.back_3)
        button.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)

            startActivity(intent)
        }

        val videoView = findViewById<VideoView>(R.id.videoView1)
        val videoPath = "android.resource://" + packageName + "/" + R.raw.pra_aksara
        val uri = Uri.parse(videoPath)
        videoView.setVideoURI(uri)

        val mediaController = MediaController(this)
        videoView.setMediaController(mediaController)
        mediaController.setAnchorView(videoView)


    }
}