package com.example.gledson.devmobile_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;

public class TelaSeekBar extends AppCompatActivity {

    private TextView txtSeekBar;
    private ProgressBar pgrSeekBar;
    private SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_seek_bar);

        txtSeekBar = (TextView)findViewById(R.id.txtSeekBar);
        pgrSeekBar = (ProgressBar)findViewById(R.id.pgrBarSeek);
        seekBar = (SeekBar)findViewById(R.id.seekBar_exemplo);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                pgrSeekBar.setProgress(progress);
                txtSeekBar.setText("" + progress + "%");
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
