/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13.Entidades;

/**
 *
 * @author PC
 */
public class Curso {
    
    private String nombreCurso;
    private int cantidadHorasDia;
    private int cantidadDiasSemana;
    private String turno;
    private int PrecioPorHora;
    private String[] alumnos = new String[5];

    public Curso() {
    }

    public Curso(String nombreCurso, int cantidadHorasDia, int cantidadDiasSemana, String turno, int PrecioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasDia = cantidadHorasDia;
        this.cantidadDiasSemana = cantidadDiasSemana;
        this.turno = turno;
        this.PrecioPorHora = PrecioPorHora;
        this.alumnos = alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasDia(int cantidadHorasDia) {
        this.cantidadHorasDia = cantidadHorasDia;
    }

    public void setCantidadDiasSemana(int cantidadDiasSemana) {
        this.cantidadDiasSemana = cantidadDiasSemana;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public void setPrecioPorHora(int PrecioPorHora) {
        this.PrecioPorHora = PrecioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public int getCantidadHorasDia() {
        return cantidadHorasDia;
    }

    public int getCantidadDiasSemana() {
        return cantidadDiasSemana;
    }

    public String getTurno() {
        return turno;
    }

    public int getPrecioPorHora() {
        return PrecioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }
    
    
}
