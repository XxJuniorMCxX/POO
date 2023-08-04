package Clase3.RelacioneAsociacion.Ejercicio2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Renta r = new Renta();
        Inmueble mu= new Inmueble();
        Inquilino in = new Inquilino();
        byte cantVeces = Byte.parseByte(JOptionPane.showInputDialog(null,"Cantidad De Registros A Ingresar"));
        for (int i=0; i<cantVeces;i++) {
            System.out.println("Inquilino N° " + i);
            in.setNombre(JOptionPane.showInputDialog(null, "Ingresa Nombre Inquilino"));
            mu.setCalle(JOptionPane.showInputDialog(null, "Ingresa Nombre Calle"));
            mu.setNumeroCalle(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingresa Numero De Calle")));
            r.setDuracion(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Duración De Estadia")));
            r.setCosto(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Costo Total De Estadia")));
            r.setMiInquilino(in);
            r.setMiInmueble(mu);
            r.mostrar();
        }
    }

}
