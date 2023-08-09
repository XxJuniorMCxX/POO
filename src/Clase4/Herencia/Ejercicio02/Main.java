package Clase4.Herencia.Ejercicio02;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Tecnico tecnico =  new Tecnico("J01","Junior","Castillo",null,500.00,200.00,150.00,300.00);
        tecnico.muestra();

        byte cantVeces = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese Cantidad de Registros"));
        for (int i=0; i<cantVeces;i++){
            String categoria = (JOptionPane.showInputDialog(null,"\tTipo Trabajador\n1)Auxiliar\n2)Tecnico"));
            switch (categoria.toLowerCase()) {
                case "auxiliar" -> {
                    String codigo = JOptionPane.showInputDialog("Ingresa Codigo");
                    String nombre = JOptionPane.showInputDialog("Ingresa Nombre");
                    String apellido = JOptionPane.showInputDialog("Ingresa Apellido");
                    double sueldoBase = Double.parseDouble(JOptionPane.showInputDialog("Ingresa Sueldo Base"));
                    double bonificacion = Double.parseDouble(JOptionPane.showInputDialog("Ingresa Bonificación"));
                    double descuento = Double.parseDouble(JOptionPane.showInputDialog("Ingresa Descuento"));
                    double bonoEspecial = Double.parseDouble(JOptionPane.showInputDialog("Ingresa Bono Especial"));
                    Auxiliar auxiliar = new Auxiliar(codigo, nombre, apellido, categoria, sueldoBase, bonificacion, descuento, bonoEspecial);
                    auxiliar.muestra();
                }
                case "tecnico" -> {
                    String codigo1 = JOptionPane.showInputDialog("Ingresa Codigo");
                    String nombre1 = JOptionPane.showInputDialog("Ingresa Nombre");
                    String apellido1 = JOptionPane.showInputDialog("Ingresa Apellido");
                    double sueldoBase1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa Sueldo Base"));
                    double bonificacion1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa Bonificación"));
                    double descuento1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa Descuento"));
                    double bonificacionEspecial = Double.parseDouble(JOptionPane.showInputDialog("Ingresa Bonificación Especial"));
                    Tecnico tecnico1 = new Tecnico(codigo1, nombre1, apellido1, categoria, sueldoBase1, bonificacion1, descuento1, bonificacionEspecial);
                    tecnico1.muestra();
                }
                default -> System.exit(0);
            }

        }
    }
}
