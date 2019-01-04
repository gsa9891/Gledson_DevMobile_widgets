package com.example.gledson.devmobile_widgets;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.github.rtoshiro.util.format.MaskFormatter;
import com.github.rtoshiro.util.format.SimpleMaskFormatter;
import com.github.rtoshiro.util.format.text.MaskTextWatcher;

public class TelaEditView extends AppCompatActivity {

    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_edit_view);

        // criando mascara para numero de celular
        editText = (EditText)findViewById(R.id.editText);

        SimpleMaskFormatter smf = new SimpleMaskFormatter("(NN)NNN.NNN.NNN");
        MaskTextWatcher mtw = new MaskTextWatcher(editText, smf);
        editText.addTextChangedListener(mtw);




    }
}
