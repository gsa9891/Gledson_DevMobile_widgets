package com.example.gledson.devmobile_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

public class TelaProgressBar extends AppCompatActivity {

    protected static final int TIMER_RUNNER = 10000;
    protected boolean mbActive;
    protected ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_progress_bar);

        progressBar = (ProgressBar)findViewById(R.id.progressBar);

        final Thread timerThread = new Thread(){

            public void run() {
                mbActive = true;

                try {
                    int waited = 0;
                    while (mbActive && (waited < TIMER_RUNNER)) {
                        sleep(200);
                        if (mbActive) {
                            waited += 200;
                            updateProgress(waited);
                        }
                    }
                }catch (InterruptedException e){

                }finally{
                    onContinue();
                }
            }
        };
        timerThread.start();

    }

    public void updateProgress (final int timePassed){
        if (null != progressBar){

          final int progresso = progressBar.getMax() * timePassed / TIMER_RUNNER;
          progressBar.setProgress(progresso);
        }

    }

    public void onContinue(){
        Log.d("mensagemFinal","Carregamento Completo !!!");
    }
}
