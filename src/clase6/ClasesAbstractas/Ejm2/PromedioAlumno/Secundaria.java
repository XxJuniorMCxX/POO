package clase6.ClasesAbstractas.Ejm2.PromedioAlumno;

public class Secundaria extends  Alumno{
    private double notaPintura;

    public Secundaria() {
    }

    public Secundaria(String codigo, String nombre, String apellido, String sexo, double pcTotal, double examParcial, double examFinal, double notaPintura) {
        super(codigo, nombre, apellido, sexo, pcTotal, examParcial, examFinal);
        this.notaPintura = notaPintura;
    }

    public double getNotaPintura() {
        return notaPintura;
    }

    public void setNotaPintura(double notaPintura) {
        this.notaPintura = notaPintura;
    }

    @Override
    public double promedioTotal() {
        return Double.parseDouble(String.format("%.2f",(getPcTotal()+getExamParcial()+getExamFinal()+this.notaPintura)/4));
    }
    public void mostrar(){
        System.out.println("El codigo: " + getCodigo() + " Pertenece al Alumno: " + getNombre() + " " + getApellido() +
                " De Sexo:" + getSexo() + " Obtubo Com Resultado De Sus Pc: " + getPcTotal() + " Su Examen Parcial: " + getExamParcial() +
                " Examen Final: " + getExamFinal() + " Nota De Taller: " + this.getNotaPintura() + " Resutando Con Ponderado Final De: " + promedioTotal() );
    }
}
