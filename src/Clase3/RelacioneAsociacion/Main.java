package Clase3.RelacioneAsociacion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Mascota m = new Mascota();
        byte numVeces=Byte.parseByte(JOptionPane.showInputDialog(null,"Cuantos Registros Deseas Ingresar"));
        for (int i=0;i<numVeces;i++) {
            System.out.println("Imprimiendo Persona " + (i+1) );
            p.setNombre(JOptionPane.showInputDialog(null, "Ingresa Nombre Del Dueño"));
            m.setNombre(JOptionPane.showInputDialog(null, "Ingresa Nombre De Mascota"));
            m.setTipo(JOptionPane.showInputDialog(null, "Ingresa Tipo De Mascota"));
            p.setMiMascota(m);
            p.mostrar();
        }


    }
}
