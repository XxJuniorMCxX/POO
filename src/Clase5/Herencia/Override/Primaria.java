package Clase5.Herencia.Override;


public class Primaria extends  Alumno{
    private double promArte;

    public Primaria() {
    }

    public double getPromArte() {
        return promArte;
    }

    public void setPromArte(double promArte) {
        this.promArte = promArte;
    }
    public double resultadoFinal(){
        return Double.parseDouble(String.format("%.2f",((getPromPracticas()+getExamenParcial()
        +getGetExamenFinal()+getPromArte())/4)));
    }
}
