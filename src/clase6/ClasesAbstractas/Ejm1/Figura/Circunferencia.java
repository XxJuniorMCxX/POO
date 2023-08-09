package clase6.ClasesAbstractas.Ejm1.Figura;

public class Circunferencia extends Figura{
    private double radio;

    public Circunferencia() {

    }

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Double.parseDouble(String.format("%.2f",Math.PI*Math.pow(radio,2)));
    }

}
