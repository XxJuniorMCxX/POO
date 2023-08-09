package Clase5.Herencia.Override;

import javax.swing.*;

public class Main {
    //override--Sobre Escritura de Metodo(identicos)mismo nombre misma cantidad de parametros
    public static void main(String[] args) {
        byte cantVeces=Byte.parseByte(JOptionPane.showInputDialog(null,"Ingresa Cantidad de Registros"));
        for (int i = 0; i < cantVeces; i++) {
            String categoria= JOptionPane.showInputDialog("\tEscriba La Categoria Que pertenece\n1)Primaria\n2)Secundaria");
            switch (categoria.toLowerCase()) {
                case "primaria" -> {
                    Primaria p = new Primaria();
                    p.setCodigo(JOptionPane.showInputDialog(null, "Ingrese Codigo"));
                    p.setNombre(JOptionPane.showInputDialog(null, "Ingrese Nombre"));
                    p.setApellido(JOptionPane.showInputDialog(null, "Ingrese Apellido"));
                    p.setSexo(JOptionPane.showInputDialog(null, "Ingrese Sexo"));
                    p.setPromPracticas(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Promedio Final De Pc")));
                    p.setExamenParcial(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Promedio De Exámen Parcial")));
                    p.setGetExamenFinal(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Promedio  De Examen Final")));
                    p.setPromArte(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Promedio Final De Arte")));
                    System.out.println("El Codigo: " + p.getCodigo() + " Pertenece al Alumno: " + p.getNombre() + " " +
                            p.getApellido() + " de Sexo: " + p.getSexo() + " Saco En Las Pc Un Promedio De: " + p.getPromPracticas() +
                            " En Su Parcial Obtuvo: " + p.getExamenParcial() + " El Final Obtuvo: " + p.getGetExamenFinal() +
                            " Y En Su Promedio De Arte: " + p.getPromArte() + " Resultando El Promedio De: " + p.resultadoFinal());
                }
                case "secundaria" -> {
                    Secundaria s = new Secundaria();
                    s.setCodigo(JOptionPane.showInputDialog(null, "Ingrese Codigo"));
                    s.setNombre(JOptionPane.showInputDialog(null, "Ingrese Nombre"));
                    s.setApellido(JOptionPane.showInputDialog(null, "Ingrese Apellido"));
                    s.setSexo(JOptionPane.showInputDialog(null, "Ingrese Sexo"));
                    s.setPromPracticas(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Promedio Final De Pc")));
                    s.setExamenParcial(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Promedio De Exámen Parcial")));
                    s.setGetExamenFinal(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Promedio  De Examen Final")));
                    s.setPcLaboratorio(Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese Promedio Final De Laboratorio")));
                    System.out.println("El Codigo: " + s.getCodigo() + " Pertenece al Alumno: " + s.getNombre() + " " +
                            s.getApellido() + " de Sexo: " + s.getSexo() + " Saco En Las Pc Un Promedio De: " + s.getPromPracticas() +
                            " En Su Parcial Obtuvo: " + s.getExamenParcial() + " El Final Obtuvo: " + s.getGetExamenFinal() +
                            " Y En Su Promedio De Arte: " + s.getPcLaboratorio() + " Resultando El Promedio De: " + s.resultadoFinal());
                }
                default -> System.exit(0);
            }
        }


    }
}
