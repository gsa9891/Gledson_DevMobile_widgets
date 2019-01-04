package com.example.gledson.devmobile_widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaAula3 extends AppCompatActivity {

    private Button btn_ligar, btn_foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_aula3);

        btn_ligar = (Button)findViewById(R.id.btn_ligar);
        btn_foto = (Button)findViewById(R.id.btn_foto);


        //Chamando as telas
        btn_ligar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_ligar();

            }
        });

        btn_foto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btn_foto();

            }
        });

    }

    private void btn_ligar() {
        startActivity(new Intent(TelaAula3.this, TelaAula3_ligar.class));
    }

    private void btn_foto() {
        startActivity(new Intent(TelaAula3.this, TelaAula3_foto.class));
    }
}
