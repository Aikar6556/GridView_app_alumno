package com.cifpceuta.gridview_app_alumno;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MirArrayAdapterAlumnos extends ArrayAdapter<Alumno> {

    Activity context;
    ArrayList<Alumno> alumnos;


    public MirArrayAdapterAlumnos (Activity activity, ArrayList<Alumno> l){
        super(activity,R.layout.activity_alumnos, l);
        this.context = activity;
        this.alumnos = l;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.activity_alumnos,parent,false);

        Alumno alumno = alumnos.get(position);
        ImageView ivAvatar;
        TextView textoAlumno;
        ivAvatar = (ImageView) rowView.findViewById(R.id.ivAvatar);
        textoAlumno = (TextView) rowView.findViewById(R.id.tvTextoAlumno);

        textoAlumno.setText(alumno.getNombreAlumno());
        ivAvatar.setImageResource(alumno.getAvatar());

        return rowView;


    }
}
