package Clase4.Herencia;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        //Imprimir Usando Contructor
        Docente docente = new Docente("Junior","Castillo","Yarlequé",(byte)35,"C01");
        docente.muestra();

        //Imprimir Usando Get y Set
        docente.setNombre(JOptionPane.showInputDialog(null, "Ingresa Nombre"));
        docente.setaPaterno(JOptionPane.showInputDialog(null, "Ingresa Apellido Paterno"));
        docente.setaMaterno(JOptionPane.showInputDialog(null, "Ingresa Apellido Materno"));
        docente.setEdad(Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresa Edad")));
        docente.setCodDocente(JOptionPane.showInputDialog(null, "Ingresa Código Docente"));
        docente.muestra();

        //Imprimir Usando Constructor
        Alumno alumno = new Alumno("Miguel","Castillo","Yarlequé",(byte)30,"Matematicas",20,17);
        alumno.muestra();

        //Imprimir Usando Get y Set
        alumno.setNombre(JOptionPane.showInputDialog(null, "Ingresa Nombre"));
        alumno.setaPaterno(JOptionPane.showInputDialog(null, "Ingresa Apellido Paterno"));
        alumno.setaMaterno(JOptionPane.showInputDialog(null, "Ingresa Apellido Materno"));
        alumno.setEdad(Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresa Edad")));
        alumno.setCurso(JOptionPane.showInputDialog(null, "Ingresa Nombre De Curso"));
        alumno.setNota1(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Nota 1")));
        alumno.setNota2(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa Nota 2")));
        alumno.muestra();
    }
}
