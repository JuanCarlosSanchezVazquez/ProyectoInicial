/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes.persistencia;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import mx.unam.aragon.fes.Empleado;

/**
 *
 * @author carlos
 */
public class archivoEmpleado {
    private String archivo;

    public archivoEmpleado() {
    }

    public archivoEmpleado(String archivo) {
        this.archivo = archivo;
    }

    public String getArchivo() {
        return archivo;
    }

    public void setArchivo(String archivo) {
        this.archivo = archivo;
    }

    public void guardarEmpleados(ArrayList<Empleado> datos){
    
         try {
            ObjectOutputStream fSalida = new ObjectOutputStream(
                    new FileOutputStream(archivo));

            fSalida.writeObject(datos);
            fSalida.close();
        } catch (Exception e) {
            e.printStackTrace(); // manejo de excepciones
        }
    }
    
    public ArrayList<Empleado>leerEmpleados(){
        ArrayList<Empleado> tmp=null;
        
         try {
            ObjectInputStream fLectura = new ObjectInputStream(
                    new FileInputStream(archivo));

            tmp = (ArrayList<Empleado>) fLectura.readObject();
            if (tmp == null) {
                System.out.println("No hay nada");
            } else {
                System.out.println("Nombre" + tmp.size());
            }
            fLectura.close();

        } catch (Exception ex) {
            System.out.println("Error" + ex.toString());
        }
     
        // leer el disco duro
        // se sube al Arraylist tmp
        return tmp;
    }
}
