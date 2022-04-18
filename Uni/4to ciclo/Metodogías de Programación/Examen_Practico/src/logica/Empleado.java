/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author admin
 */
public class Empleado {

    private String dni;
    private String paterno;
    private String materno;
    private String nombres;
    private double sueldo;
    private double bonificacion;
    private double peso_pavo;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    public double getPeso_pavo() {
        return peso_pavo;
    }

    public void setPeso_pavo(double peso_pavo) {
        this.peso_pavo = peso_pavo;
    }

    public Empleado() {
    }

    public Empleado(String dni, String paterno, String materno, String nombres) {
        this.dni = dni;
        this.paterno = paterno;
        this.materno = materno;
        this.nombres = nombres;
    }
}
