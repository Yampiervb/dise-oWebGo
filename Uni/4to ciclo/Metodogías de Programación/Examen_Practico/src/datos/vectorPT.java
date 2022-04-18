/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.util.Vector;

public class vectorPT {

    private static Vector empleadosPT = new Vector();

    public static void agregar(Object empleado) {
        empleadosPT.addElement(empleado);
    }

    public static Vector consultar() {
        return empleadosPT;
    }

}
