package com.cifpceuta.gridview_app_alumno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    private GridView listaAlumnos;

    private MirArrayAdapterAlumnos adapterAlumnos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaAlumnos = findViewById(R.id.gvListaAlumnos);

        ArrayList <Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Chico-1",R.drawable.avatar1_chico));
        alumnos.add(new Alumno("Chica-2",R.drawable.avatar2_chica));
        alumnos.add(new Alumno("chica-3",R.drawable.avatar3_chico));
        alumnos.add(new Alumno("Chico-4",R.drawable.avatar4_chica));


        adapterAlumnos = new MirArrayAdapterAlumnos(this,alumnos);
        listaAlumnos.setAdapter(adapterAlumnos);

        listaAlumnos.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {


                boton(view,position);

                Alumno alumno = (Alumno) adapterAlumnos.getItem(position);


            }
        });



    }

    public void boton(View view, int numero){

        Intent intent = new Intent(this, Activity_chat.class);
        intent.putExtra("portada",adapterAlumnos.getItem(numero).getAvatar());
        intent.putExtra("nombre",adapterAlumnos.getItem(numero).getNombreAlumno());
        startActivity(intent);




    }


}