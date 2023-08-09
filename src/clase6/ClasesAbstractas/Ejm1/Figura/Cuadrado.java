package clase6.ClasesAbstractas.Ejm1.Figura;

import javax.swing.*;

public class Cuadrado extends Figura {
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double area() {
        return Double.parseDouble(String.format("%.2f",Math.pow(lado,2)));
    }
}
