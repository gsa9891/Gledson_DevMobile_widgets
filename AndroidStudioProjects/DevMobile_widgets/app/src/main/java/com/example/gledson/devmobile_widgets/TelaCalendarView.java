package com.example.gledson.devmobile_widgets;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class TelaCalendarView extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_calendar_view);

        TextView labelAno = (TextView)findViewById(R.id.labelAno);
        TextView labelMes = (TextView)findViewById(R.id.labelMes);
        TextView labelDia = (TextView)findViewById(R.id.labelDia);
        TextView labelDiaSemana = (TextView)findViewById(R.id.labelDiaSemana);

        Calendar calendario = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MMMM/d/E", Locale.US);//Tentei setar BR mas bugou
        String stringData = sdf.format(calendario.getTime());

        String[] valores = stringData.split("/",0);


//        for (int i = 0; i < valores.length; i++){
//           Log.v("CHECK_DATA", valores[i]);
//        }


        labelAno.setText(valores[0]);
        labelMes.setText(valores[1]);
        labelDia.setText(valores[2]);
        labelDiaSemana.setText(valores[3]);

    }
}
