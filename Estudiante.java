/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SistemaNotas;

/**
 *
 * @author ASUS
 */
public class Estudiante {
    private int codigo;
    private String nombre;
    private double previo1, previo2, previo3, examen;

    public Estudiante() {
    }

    public Estudiante(int codigo, String nombre, double previo1, double previo2, double previo3, double examen) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.previo1 = previo1;
        this.previo2 = previo2;
        this.previo3 = previo3;
        this.examen = examen;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrevio1() {
        return previo1;
    }

    public void setPrevio1(double previo1) {
        this.previo1 = previo1;
    }

    public double getPrevio2() {
        return previo2;
    }

    public void setPrevio2(double previo2) {
        this.previo2 = previo2;
    }

    public double getPrevio3() {
        return previo3;
    }

    public void setPrevio3(double previo3) {
        this.previo3 = previo3;
    }

    public double getExamen() {
        return examen;
    }

    public void setExamen(double examen) {
        this.examen = examen;
    }

    
}
