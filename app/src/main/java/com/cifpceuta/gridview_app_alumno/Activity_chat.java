package com.cifpceuta.gridview_app_alumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Activity_chat extends AppCompatActivity {


    TextView tvTextoAlumno;
    ImageView ivAvatar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat);

        Intent intent = this.getIntent();

        int imagenAvatar = intent.getIntExtra("avatar",0);
        String titulo = intent.getStringExtra("titulo");


        tvTextoAlumno = (TextView) findViewById(R.id.tvDescAlumno);
        ivAvatar = (ImageView) findViewById(R.id.ivAvatar);



    }
}