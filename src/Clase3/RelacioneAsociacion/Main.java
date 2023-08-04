package Clase3.RelacioneAsociacion;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Persona p = new Persona();
        Mascota m = new Mascota();

        p.setNombre(JOptionPane.showInputDialog(null,"Ingresa Nombre Del Dueño"));
        m.setNombre(JOptionPane.showInputDialog(null,"Ingresa Nombre De Mascota"));
        m.setTipo(JOptionPane.showInputDialog(null,"Ingresa Tipo De Mascota"));
        p.setMiMascota(m);
        p.mostrar();

    }
}
