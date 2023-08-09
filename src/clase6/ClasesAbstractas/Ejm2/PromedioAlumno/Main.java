package clase6.ClasesAbstractas.Ejm2.PromedioAlumno;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        byte cantVeces = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresar Cantidad de Registros"));
        for (int i = 0; i < cantVeces; i++) {
            String tipo = JOptionPane.showInputDialog(null, "Escribir Grado De Estudios\n1)Primaria\n2)Secundaria");
            switch (tipo.toLowerCase()) {
                case "primaria" -> {
                    String codigo = JOptionPane.showInputDialog("Ingrese Codigo");
                    String nombre = JOptionPane.showInputDialog("Ingrese Nombre");
                    String apellido = JOptionPane.showInputDialog("Ingrese Apellido");
                    String sexo = JOptionPane.showInputDialog("Ingrese Sexo");
                    double notaTaller = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota Final del Taller"));
                    double pcTotal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota Total Pc"));
                    double examParcial = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota Examen Parcial"));
                    double examFinal = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota Examen Final"));
                    Primaria p = new Primaria(codigo, nombre, apellido, sexo, pcTotal, examParcial, examFinal, notaTaller);
                    p.mostrar();
                }
                case "secundaria" -> {
                    String codigo1 = JOptionPane.showInputDialog("Ingrese Codigo");
                    String nombre1 = JOptionPane.showInputDialog("Ingrese Nombre");
                    String apellido1 = JOptionPane.showInputDialog("Ingrese Apellido");
                    String sexo1 = JOptionPane.showInputDialog("Ingrese Sexo");
                    double notaPintura = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota Final del Taller"));
                    double pcTotal1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota Total Pc"));
                    double examParcial1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota Examen Parcial"));
                    double examFinal1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese Nota Examen Final"));
                    Secundaria s = new Secundaria(codigo1, nombre1, apellido1, sexo1, pcTotal1, examParcial1, examFinal1, notaPintura);
                    s.mostrar();
                }
                default -> System.exit(0);
            }

        }
    }
}
