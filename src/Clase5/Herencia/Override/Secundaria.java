package Clase5.Herencia.Override;

public class Secundaria extends Alumno{
    private double pcLaboratorio;

    public Secundaria() {
    }
    public double getPcLaboratorio() {
        return pcLaboratorio;
    }

    public void setPcLaboratorio(double pcLaboratorio) {
        this.pcLaboratorio = pcLaboratorio;
    }
    public double resultadoFinal(){

        return Double.parseDouble(String.format("%.2f",((getPromPracticas()+getExamenParcial()
                +getGetExamenFinal()+getPcLaboratorio())/4)));
    }
}
