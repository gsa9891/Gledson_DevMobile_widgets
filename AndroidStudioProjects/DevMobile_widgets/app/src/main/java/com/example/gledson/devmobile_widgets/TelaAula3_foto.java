package com.example.gledson.devmobile_widgets;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class TelaAula3_foto extends AppCompatActivity {

    private Bitmap bitmap;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_aula3_foto);

        img = (ImageView)findViewById(R.id.imageView);
        img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                abrirCamera();
            }

        });
    }

    private void abrirCamera() {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent, 0);
    }

    protected void onActivityResult(int requestCode, int resultCode,Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        InputStream stream = null;
        if(requestCode == 0 && resultCode == RESULT_OK){
            try{
                if(bitmap != null){
                    bitmap.recycle();
                }
                stream = getContentResolver().openInputStream(data.getData());
                bitmap = BitmapFactory.decodeStream(stream);
                img.setImageBitmap(resizeImage(this, bitmap, 700, 600));

            }catch (FileNotFoundException e){
                e.printStackTrace();

            }finally {
                if(stream != null)
                    try {
                    stream.close();

                    }catch (IOException e){

                        e.printStackTrace();
                    }
            }
        }
    }

    private Bitmap resizeImage(Context context, Bitmap bmpOriginal, float newWidth,float newHeight){
        Bitmap novoBmp = null;

        int w = bmpOriginal.getWidth();
        int h = bmpOriginal.getHeight();

        float densityFactor = context.getResources().getDisplayMetrics().density;
        float novoW = newWidth * densityFactor;
        float novoH = newHeight * densityFactor;

        float scalaW = novoW/w;
        float scalaH = novoH/h;

        Matrix  matrix = new Matrix();

        matrix.postScale(scalaW,scalaH);

        novoBmp = Bitmap.createBitmap(bmpOriginal, 0, 0, w, h, matrix, true);

        return novoBmp;
    }
    public void girarFoto(View v){
        img.setRotation(90);
    }

    public void voltarFoto (View v){
        img.setRotation(0);
    }

}
