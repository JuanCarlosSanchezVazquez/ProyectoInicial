/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes.persistencia;

import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;

/**
 *
 * @author carlos
 */
public class archvioEmpleado {
    private String archivo;

    public archvioEmpleado() {
    }

    public archvioEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public void guardarEmpleados(ArrayList<Empleado> datos){
    
    }
    
    public ArrayList<Empleado>leerEmpleados(){
        ArrayList<Empleado> tmp=null;
     
        // leer el disco duro
        // se sube al Arraylist tmp
        return tmp;
    }
}
