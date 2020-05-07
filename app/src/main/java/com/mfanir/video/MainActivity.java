package com.mfanir.video;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView video = (VideoView) findViewById(R.id.videoView);
        video.setVideoPath("android.resource://" + getPackageName() + "/" + R.raw.annabi);

        MediaController control = new MediaController(this);
        control.setAnchorView(video);

        video.setMediaController(control);
        video.start();
    }
}
