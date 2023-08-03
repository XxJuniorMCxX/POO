package Clase1;
import javax.swing.*;
import java.time.LocalDate;

public class Bootcamp {

    public static void main(String[] args) {
        //ctrl+alt+l
        LocalDate fecha = LocalDate.now();
        System.out.println(fecha);
        byte op, cant_Veces;
        Persona p = new Persona();
        Persona p2 = new Persona();
        cant_Veces = Byte.parseByte(JOptionPane.showInputDialog("Ingrese Cantidad De Registros A Evaluar"));
        for (int i = 0; i <= cant_Veces; i++) {
            op= Byte.parseByte(JOptionPane.showInputDialog("Ingresa Option \n1)Muestra Datos Fijo \n2)Ingresa Los Datos A Mostrar "));
            System.out.println("******************************************");
            switch (op) {
                case 1 -> {
                    p.setNombre("Junior");
                    p.setApellido("Castillo");
                    p.setSexo('M');
                    p.setEdad((byte) 35);
                    System.out.println("nombre: " + p.getNombre() + "\nApellido: " + p.getApellido() +
                            "\nSexo: " + p.getSexo() + "\nEdad: " + p.getEdad());
                }
                case 2 -> {
                    p2.setNombre(JOptionPane.showInputDialog(null, "Ingresa Nombre"));
                    p2.setApellido(JOptionPane.showInputDialog(null, "Ingrese Apellido"));
                    p2.setSexo(JOptionPane.showInputDialog(null, "Ingrese Sexo").charAt(0));
                    p2.setEdad(Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese Edad")));
                    System.out.println("nombre: " + p2.getNombre() + "\nApellido: " + p2.getApellido() +
                            "\nSexo: " + p2.getSexo() + "\nEdad: " + p2.getEdad());
                }
                default -> System.out.println("no existe la option");
            }

        }


    }
}