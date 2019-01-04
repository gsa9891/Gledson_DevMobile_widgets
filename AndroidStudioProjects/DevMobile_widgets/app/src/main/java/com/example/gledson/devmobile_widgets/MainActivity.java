package com.example.gledson.devmobile_widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    private Button btn_aula3, btn_Listview,btn_imageView,btn_webView,btn_videoView,btn_calendarView,btn_progBar,btn_progBarHorizontal,btn_seekBar,btn_seekBarDisc,btn_ratingBar,btn_searchView,btn_textureView,btn_surfaceView,btn_horiDivider,btn_vertiDivider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_Listview = (Button)findViewById(R.id.btn_Listview);
        btn_imageView = ((Button)findViewById(R.id.btn_imageView));
        btn_webView = (Button)findViewById(R.id.btn_webView);
        btn_videoView = (Button)findViewById(R.id.btn_videoView);
        btn_calendarView = (Button)findViewById(R.id.btn_calendarView);
        btn_progBar = (Button)findViewById(R.id.btn_progBar);
        btn_progBarHorizontal = (Button)findViewById(R.id.btn_progBarHorizontal);
        btn_seekBar = (Button)findViewById(R.id.btn_seekBar);
        btn_seekBarDisc = (Button)findViewById(R.id.btn_editView);
        btn_aula3 = (Button)findViewById(R.id.btn_aula3);


        //Chamando a Tela de exemplo da view
        btn_Listview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
                btn_viewActivity();
                
            }
        });


        //Chamdo a tela de exemplo do Image View
        btn_imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_imageView();

            }
        });

        //Chamando a tela de exemplo do Web view
        btn_webView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_webView();
            }
        });

        //Chamando tela exemplo Video View
        btn_videoView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_videoView();
            }
        });

        //Chamando tela do exemplo de calendar View
        btn_calendarView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_calendarView();
            }
        });

        //Chamando tela Progress Bar
        btn_progBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_progBar();
            }
        });

        //Chamando a tela de exemplo Progress Bar Horizontal
        btn_progBarHorizontal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_progBarHorizontal();
            }
        });

        //Chamando a tela de exemplo do Seek Bar
        btn_seekBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_seekBar();
            }
        });

        //Chamando a tela de exemplo do Seek Bar Discret
        btn_seekBarDisc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_seekBarDisc();

            }
        });

        //Chamando o menu da aula 3
        btn_aula3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_aula3();

            }
        });

    }


    private void btn_seekBarDisc() {
        startActivity(new Intent(MainActivity.this, TelaEditView.class));
    }

    private void btn_seekBar() {
        startActivity(new Intent(MainActivity.this, TelaSeekBar.class));
    }

    private void btn_progBarHorizontal() {
        startActivity(new Intent(MainActivity.this, TelaProgressBarHorizontal.class));
    }

    private void btn_progBar() {
        startActivity(new Intent(MainActivity.this,TelaProgressBar.class));
    }

    private void btn_calendarView() {
        startActivity(new Intent(MainActivity.this, TelaCalendarView.class));
    }

    private void btn_videoView() {
        startActivity(new Intent(MainActivity.this, TelaVideoView.class));
    }

    private void btn_webView() {
        startActivity(new Intent(MainActivity.this, TelaWebView.class));
    }

    private void btn_imageView() {
        startActivity(new Intent(MainActivity.this, TelaImageView.class));
    }

    private void btn_viewActivity() {
        startActivity(new Intent(MainActivity.this, TelaListView.class));
    }

    private  void btn_aula3(){
        startActivity(new Intent(MainActivity.this, TelaAula3.class));
    }


}
