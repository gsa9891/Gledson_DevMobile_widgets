package com.example.gledson.devmobile_widgets;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class TelaAula3_ligar extends AppCompatActivity {

    private Button btn_tela_ligar;
    private EditText edt_txt_numTel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_aula3_ligar);

        edt_txt_numTel = (EditText)findViewById(R.id.edt_txt_numTel);
        btn_tela_ligar = (Button)findViewById(R.id.btn_tela_ligar);

        btn_tela_ligar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String numtel = edt_txt_numTel.getText().toString();
                Uri uri = Uri.parse("Tel:" + numtel);

                Intent intent = new Intent(Intent.ACTION_CALL, uri);
                if (ActivityCompat.checkSelfPermission(TelaAula3_ligar.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_DENIED) {
                    ActivityCompat.requestPermissions(TelaAula3_ligar.this, new String[]{Manifest.permission.CALL_PHONE}, 1);
                    return;

                }

                startActivity(intent);
            }
        });
    }
}
