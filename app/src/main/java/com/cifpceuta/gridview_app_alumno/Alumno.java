package com.cifpceuta.gridview_app_alumno;

public class Alumno {

    private int avatar;
    private String nombreAlumno;


    public Alumno(int avatar, String nombreAlumno) {
        this.avatar = avatar;
        this.nombreAlumno = nombreAlumno;
    }

    public int getAvatar() {
        return avatar;
    }

    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
}
