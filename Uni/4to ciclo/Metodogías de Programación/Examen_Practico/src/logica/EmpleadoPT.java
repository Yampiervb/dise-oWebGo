/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import datos.vectorPT;
import java.util.Vector;

/**
 *
 * @author admin
 */
public class EmpleadoPT extends Empleado {

    private boolean turno;//Turno 1(true): 11am a 6pm | Turno 2(false): 6pm hasta el cierre
    private double cantidad_horas;
    private double tarifa_h;

    public EmpleadoPT() {
    }

    public EmpleadoPT(String dni, String paterno, String materno, String nombres, double cantidad_horas, double tarifa_h) {
        super(dni, paterno, materno, nombres);
        this.cantidad_horas = cantidad_horas;
        this.tarifa_h = tarifa_h;
        calcularBonificacion();
        calcularSueldo();
    }

    public boolean getTurno() {
        return this.turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public double getCantidad_horas() {
        return this.cantidad_horas;
    }

    public void setCantidad_horas(double cantidad_horas) {
        this.cantidad_horas = cantidad_horas;
    }

    public double getTarifa_h() {
        return this.tarifa_h;
    }

    public void setTarifa_hora(double tarifa_h) {
        this.tarifa_h = tarifa_h;
    }

    public void calcularSueldo() {
        //calcularBonificacion();
        //double sueldoNeto = (cantidad_horas * tarifa_hora) + getBonificacion();
        double sueldoFinal = cantidad_horas * tarifa_h + getBonificacion();
        setSueldo(sueldoFinal);

    }

    public void calcularBonificacion() {
        if (turno) {
            setBonificacion(0);//No hay bonificacion para el turno 1
        } else {
            setBonificacion(800);//Bonificacion extraordinaro de 800 soles para el turno 2
        }
    }

    public void calcularPesoP() {

        setPeso_pavo(7);
    }

    public void agregarEmpleado() {
        vectorPT.agregar(this);
    }

    public Vector obtenerListado() {
        return vectorPT.consultar();
    }

}
