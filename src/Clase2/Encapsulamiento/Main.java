package Clase2.Encapsulamiento;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //constructor de forma implicito
        Persona p = new Persona();
        System.out.println("Mostrando Datos Fijos Constructor Persona 1");
        System.out.println("\tDatos De Persona " +
                "\nNombre: " + p.getNombre() +
                "\nApellido Paterno: " + p.getaPaterno() +
                "\nApellido Materno: " + p.getaMaterno() +
                "\nSexo: " + p.getSexo()+
                "\nEdad: " + p.getEdad());
        System.out.println("******ingresando Datos Persona 2 Set y Get");

        p.setNombre(JOptionPane.showInputDialog(null,"Ingrese Nombre"));
        p.setaPaterno(JOptionPane.showInputDialog(null,"Ingrese Apellido Paterno"));
        p.setaMaterno(JOptionPane.showInputDialog(null,"Ingrese Apellido Materno"));
        p.setSexo(JOptionPane.showInputDialog(null,"Ingrese Sexo").charAt(0));
        p.setEdad(Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese Edad")));

        System.out.println("\tDatos De Persona 02" +
                "\nNombre: " + p.getNombre() +
                "\nApellido Paterno: " + p.getaPaterno() +
                "\nApellido Materno: " + p.getaMaterno() +
                "\nSexo: " + p.getSexo()+
                "\nEdad: " + p.getEdad());

        System.out.println("******ingresando Datos Persona 3 Constructor Parametrizado");

        String nombre= (JOptionPane.showInputDialog(null,"Ingrese Nombre"));
        String paterno=(JOptionPane.showInputDialog(null,"Ingrese Apellido Paterno"));
        String materno=(JOptionPane.showInputDialog(null,"Ingrese Apellido Materno"));
        char sexo = (JOptionPane.showInputDialog(null,"Ingrese Sexo").charAt(0));
        byte edad=(Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese Edad")));

        Persona p3 = new Persona(nombre,paterno,materno,sexo,edad);
        System.out.println("\tDatos De Persona 03" +
                "\nNombre: " + p3.getNombre() +
                "\nApellido Paterno: " + p3.getaPaterno() +
                "\nApellido Materno: " + p3.getaMaterno() +
                "\nSexo: " + p3.getSexo()+
                "\nEdad: " + p3.getEdad());

    }
}
