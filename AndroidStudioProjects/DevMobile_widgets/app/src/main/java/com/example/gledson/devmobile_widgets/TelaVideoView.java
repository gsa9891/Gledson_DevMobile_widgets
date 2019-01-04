package com.example.gledson.devmobile_widgets;

import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class TelaVideoView extends AppCompatActivity {

    private VideoView videoView_exemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_video_view);

        videoView_exemplo = findViewById(R.id.videoView_exemplo);
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.video_test ;
        Uri uri = Uri.parse(videoPath);
        videoView_exemplo.setVideoURI(uri);
        MediaController mediaController = new MediaController(this);
        videoView_exemplo.setMediaController(mediaController);
        mediaController.setAnchorView(videoView_exemplo);


    }
}
