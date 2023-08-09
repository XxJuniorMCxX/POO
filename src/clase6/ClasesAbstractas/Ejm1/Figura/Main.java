package clase6.ClasesAbstractas.Ejm1.Figura;
import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        byte op = Byte.parseByte(JOptionPane.showInputDialog(null,"Ingrese Cantidad de Registros"));

        for (int i = 0; i < op; i++) {
            String tipo = JOptionPane.showInputDialog(null,"\tEscribe El Tipo De Figura\n1)Circunferencia\n2)Cuadrado");
            switch (tipo.toLowerCase()) {
                case "circunferencia" -> {
                    byte radio = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese Radio De La Circunferencia"));
                    Circunferencia c = new Circunferencia(radio);
                    System.out.println("El Area De La Circunferencia Es: " + c.area());
                }
                case "cuadrado" -> {
                    byte lado = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingrese Lado De Cuadrado"));
                    Cuadrado cu = new Cuadrado(lado);
                    System.out.println("El Area Del Cuadrado Es: "+cu.area());
                }
                default -> System.exit(0);
            }
        }

    }
}
