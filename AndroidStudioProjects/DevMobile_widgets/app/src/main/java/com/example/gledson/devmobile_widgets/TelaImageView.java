package com.example.gledson.devmobile_widgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class TelaImageView extends AppCompatActivity {

    private ImageView imgView_exemplo;
    private Button btn_esconder,btn_mostrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_image_view);

        imgView_exemplo = (ImageView)findViewById(R.id.imgView_exemplo);

        btn_esconder = (Button)findViewById(R.id.btn_esconder);
        btn_mostrar = (Button)findViewById(R.id.btn_mostrar);

        btn_mostrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgView_exemplo.setVisibility(View.VISIBLE);

            }
        });

        btn_esconder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                imgView_exemplo.setVisibility(View.INVISIBLE);
            }
        });

    }

}
