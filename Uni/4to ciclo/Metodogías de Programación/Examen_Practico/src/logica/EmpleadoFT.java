/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.vectorFT;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class EmpleadoFT extends Empleado {

    private int antiguedad;
    private int horas_extra;
    private double tarifa_horas_extra;
    private double sueldo_base;

    public EmpleadoFT() {
    }

    public EmpleadoFT(String dni, String paterno, String materno, String nombres, int antiguedad, int horas_extra, double tarifa_horas_extra, double sueldo_base) {
        super(dni, paterno, materno, nombres);
        this.antiguedad = antiguedad;
        this.horas_extra = horas_extra;
        this.tarifa_horas_extra = tarifa_horas_extra;
        this.sueldo_base = sueldo_base;
        calcularBonificacion();
        calcularSueldo();
    }

    public int getAntiguedad() {
        return this.antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getHoras_extra() {
        return this.horas_extra;
    }

    public void setHoras_extra(int horas_extra) {
        this.horas_extra = horas_extra;
    }

    public double getTarifa_horas_extra() {
        return this.tarifa_horas_extra;
    }

    public void setTarifa_horas_extra(double tarifa_horas_extra) {
        this.tarifa_horas_extra = tarifa_horas_extra;
    }

    public double getSueldo_base() {
        return this.sueldo_base;
    }

    public void setSueldo_base(double sueldo_base) {
        this.sueldo_base = sueldo_base;
    }

    public void calcularSueldo() {
        double sueldoNeto = sueldo_base + (horas_extra * tarifa_horas_extra);
        setSueldo(sueldoNeto);
    }

    public void calcularBonificacion() {
        if (antiguedad > 4) {
            setBonificacion(sueldo_base * 0.30);
        } else {
            setBonificacion(sueldo_base * 0.10);
        }
    }

    public void calcularPesoP() {
        if (antiguedad > 2) {
            setPeso_pavo(7 + (antiguedad - 2) * 2);//Mas de 2 años se calcula el peso del pavo
        } else {
            setPeso_pavo(7);//Hasta 2 años un pavo de 7 kilos
        }
    }

    public void agregarEmpleado() {
        vectorFT.agregar(this);
    }

    public Vector obtenerListado() {
        return vectorFT.consultar();
    }

}
