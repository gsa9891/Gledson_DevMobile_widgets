package com.example.gledson.devmobile_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class TelaListView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);

        String [] secao = {"padaria", "limpeza","higiene pessoal","alimentos perecíveis", "bebidas e sucos","papelaria"};
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, secao);
        ListView listView = (ListView)findViewById(R.id.listView_exemplo);
        listView.setAdapter(adapter);
    }
}
