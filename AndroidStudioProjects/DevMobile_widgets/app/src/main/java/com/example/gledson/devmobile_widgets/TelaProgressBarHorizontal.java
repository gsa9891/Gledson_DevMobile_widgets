package com.example.gledson.devmobile_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;

public class TelaProgressBarHorizontal extends AppCompatActivity {

    protected static final int TIMER_RUNNER = 10000;
    protected boolean mbActive;
    protected ProgressBar progressBar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_progress_bar_horizontal);

        progressBar2 = (ProgressBar)findViewById(R.id.progressBar2);

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
        if (null != progressBar2){

            final int progresso = progressBar2.getMax() * timePassed / TIMER_RUNNER;
            progressBar2.setProgress(progresso);
        }

    }

    public void onContinue(){
        Log.d("mensagemFinal","Carregamento Completo !!!");
    }
}
