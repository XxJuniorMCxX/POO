package clase6.ClasesAbstractas.Ejm2.PromedioAlumno;

public class Primaria extends Alumno{
    private double notaTaller;

    public Primaria() {
    }

    public Primaria(String codigo, String nombre, String apellido, String sexo, double pcTotal, double examParcial, double examFinal, double notaTaller) {
        super(codigo, nombre, apellido, sexo, pcTotal, examParcial, examFinal);
        this.notaTaller = notaTaller;
    }

    @Override
    public double promedioTotal() {
        return Double.parseDouble(String.format("%.2f",(getPcTotal()+getExamParcial()+getExamFinal()+this.notaTaller)/4));
    }
    public void mostrar(){
        System.out.println("El codigo: " + getCodigo() + " Pertenece al Alumno: " + getNombre() + " " + getApellido() +
                " De Sexo:" + getSexo() + " Obtubo Com Resultado De Sus Pc: " + getPcTotal() + " Su Examen Parcial: " + getExamParcial() +
                " Examen Final: " + getExamFinal() + " Nota De Taller: " + this.notaTaller + " Resutando Con Ponderado Final De: " + promedioTotal() );
    }
}
